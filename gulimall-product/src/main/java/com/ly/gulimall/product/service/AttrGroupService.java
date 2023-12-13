package com.ly.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ly.common.utils.PageUtils;
import com.ly.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author auto
 * @email sunlightcs@gmail.com
 * @date 2023-12-08 14:21:15
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);
}

