package com.jaychou.alphavault.controller;

import com.jaychou.alphavault.entity.AlphaTemplate;
import com.jaychou.alphavault.service.AlphaTemplateService;
import com.mybatisflex.core.paginate.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Alpha因子模板表 控制层。
 *
 * @author <a href="https://github.com/kongjay">红模仿</a>
 */
@RestController
@RequestMapping("/alphaTemplate")
public class AlphaTemplateController {

    @Autowired
    private AlphaTemplateService alphaTemplateService;

    /**
     * 保存Alpha因子模板表。
     *
     * @param alphaTemplate Alpha因子模板表
     * @return {@code true} 保存成功，{@code false} 保存失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody AlphaTemplate alphaTemplate) {
        return alphaTemplateService.save(alphaTemplate);
    }

    /**
     * 根据主键删除Alpha因子模板表。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Long id) {
        return alphaTemplateService.removeById(id);
    }

    /**
     * 根据主键更新Alpha因子模板表。
     *
     * @param alphaTemplate Alpha因子模板表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody AlphaTemplate alphaTemplate) {
        return alphaTemplateService.updateById(alphaTemplate);
    }

    /**
     * 查询所有Alpha因子模板表。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<AlphaTemplate> list() {
        return alphaTemplateService.list();
    }

    /**
     * 根据主键获取Alpha因子模板表。
     *
     * @param id Alpha因子模板表主键
     * @return Alpha因子模板表详情
     */
    @GetMapping("getInfo/{id}")
    public AlphaTemplate getInfo(@PathVariable Long id) {
        return alphaTemplateService.getById(id);
    }

    /**
     * 分页查询Alpha因子模板表。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<AlphaTemplate> page(Page<AlphaTemplate> page) {
        return alphaTemplateService.page(page);
    }

}
