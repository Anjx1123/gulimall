package com.ly.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ly.common.utils.PageUtils;
import com.ly.common.utils.Query;
import com.ly.gulimall.product.dao.CategoryDao;
import com.ly.gulimall.product.entity.CategoryEntity;
import com.ly.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //2.组装成父子的树形结构
        //2.1找到所有的一级分类
        return entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).peek(menu -> menu.setChildren(getChildren(menu, entities))
        ).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort()))
        ).collect(Collectors.toList());
    }

    @Override
    public void removeMenuByIds(List<Long> list) {
        //todo 检查当前删除的菜单，是否被别的地方引用
        //逻辑删除

        baseMapper.deleteBatchIds(list);
    }

    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {

        return all.stream().filter(categoryEntity ->
                categoryEntity.getParentCid().equals(root.getCatId())
        ).peek(categoryEntity -> categoryEntity.setChildren(getChildren(categoryEntity, all))
        ).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort()))
        ).collect(Collectors.toList());
    }
    //




}
