package com.ly.gulimall.product.dao;

import com.ly.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author auto
 * @email sunlightcs@gmail.com
 * @date 2023-12-08 14:21:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
