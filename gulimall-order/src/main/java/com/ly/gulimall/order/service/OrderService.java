package com.ly.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ly.common.utils.PageUtils;
import com.ly.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author auto
 * @email sunlightcs@gmail.com
 * @date 2023-12-09 05:34:47
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

