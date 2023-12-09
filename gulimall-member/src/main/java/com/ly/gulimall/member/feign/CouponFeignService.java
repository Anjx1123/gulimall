package com.ly.gulimall.member.feign;

import com.ly.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 刘样
 * @version 1.0
 * 1、想要远程调用别的服务
 * 1） 引入open-feign
 * 2） 编写一个接口告诉SpringCloud 这个接口需要调用远程服务
 *  1 、 声明接口的每一个方法调用那个远程服务的那个请求
 * 3） 开启远程调用功能
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
