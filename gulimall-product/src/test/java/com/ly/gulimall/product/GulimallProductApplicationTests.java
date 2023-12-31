package com.ly.gulimall.product;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ly.gulimall.product.entity.BrandEntity;
import com.ly.gulimall.product.service.BrandService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Resource
    BrandService brandService;

    @Test
    public void contextLoads() {
    //    BrandEntity brandEntity = new BrandEntity();
    //    brandEntity.setBrandId(1L);
    //    brandEntity.setDescript("华为");
    ///*    brandEntity.setName("华为");
    //    brandService.save(brandEntity);
    //    System.out.println("保存成功");*/
    //    brandService.updateById(brandEntity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(item->{
            System.out.println(item);
        }   );

    }

}
