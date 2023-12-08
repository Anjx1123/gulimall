package com.ly.gulimall.order.dao;

import com.ly.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author auto
 * @email sunlightcs@gmail.com
 * @date 2023-12-09 05:34:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
