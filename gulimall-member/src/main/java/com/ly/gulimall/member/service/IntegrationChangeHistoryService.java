package com.ly.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ly.common.utils.PageUtils;
import com.ly.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author auto
 * @email sunlightcs@gmail.com
 * @date 2023-12-09 05:21:40
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

