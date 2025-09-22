package com.jaychou.alphavault.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import com.mybatisflex.core.keygen.KeyGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Alpha因子模板表 实体类。
 *
 * @author <a href="https://github.com/kongjay">红模仿</a>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("alpha_template")
public class AlphaTemplate implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 模板唯一ID
     */
    @Id(keyType = KeyType.Generator, value = KeyGenerators.snowFlakeId)
    private Long id;

    /**
     * 模板名称
     */
    private String templateName;

    /**
     * 模板描述、投资逻辑说明
     */
    private String templateDescription;

    /**
     * Alpha因子的完整表达式代码
     */
    private String expression;

    /**
     * 模板状态：1-草稿, 2-已保存, 3-已归档
     */
    private Boolean status;

    /**
     * 用户自定义分类标签
     */
    private String category;

    /**
     * 该模板已成功提交的次数
     */
    private Long submissionCount;

    /**
     * 最近回测性能指标快照（JSON结构存储）
     */
    private String performanceSnapshot;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 更新时间
     */
    private Timestamp updateTime;

    /**
     * 逻辑删除
     */
    private Integer isDelete;

}
