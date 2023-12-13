package com.ly.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ly.common.utils.PageUtils;
import com.ly.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author auto
 * @email sunlightcs@gmail.com
 * @date 2023-12-08 14:21:15
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> list);
}

