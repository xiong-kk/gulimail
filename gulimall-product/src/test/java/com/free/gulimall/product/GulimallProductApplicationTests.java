package com.free.gulimall.product;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.free.gulimall.product.entity.BrandEntity;
import com.free.gulimall.product.service.BrandService;
import com.netflix.client.ClientException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.List;


import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;





//    @Test
//    void contextLoads() {
//        /*BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
//
//        brandService.updateById(brandEntity);*/
//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//        list.forEach((item)->{
//            System.out.println(item);
//        });
//    }

}
