package com.ly.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ly.common.utils.PageUtils;
import com.ly.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author auto
 * @email sunlightcs@gmail.com
 * @date 2023-12-09 05:09:37
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

