package com.ly.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ly.common.utils.PageUtils;
import com.ly.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author auto
 * @email sunlightcs@gmail.com
 * @date 2023-12-09 05:41:07
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

