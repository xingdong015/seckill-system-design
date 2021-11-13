package com.system.design.seckill.product.controller;

import com.system.design.seckill.common.po.Product;
import com.system.design.seckill.product.entity.MyResponse;
import com.system.design.seckill.product.service.ProductService;
import com.system.design.seckill.util.EsOptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 进行es检索入口
 * @author: 贾凯
 * @create: 2021-11-13 16:00
 */
@RestController
@RequestMapping("/es/product")
@CrossOrigin(allowCredentials="true")
@Slf4j
public class ProductController {
    @Resource
    private ProductService productService;
    @Resource
    private EsOptionUtil esOptionUtil;

    @PostMapping("/save")
    public MyResponse save(String body){

        return MyResponse.success();
    }

    @PostMapping("/saveBatch")
    public MyResponse saveBatch(String body){

        return MyResponse.success();
    }

    @PostMapping("/delete")
    public MyResponse delete(String body){

        return MyResponse.success();
    }

    @PostMapping("/deleteBatch")
    public MyResponse deleteBatch(String body){

        return MyResponse.success();
    }

    @PostMapping("/search")
    public MyResponse search(String body){

        return MyResponse.success();
    }

    @PostMapping("/search/all")
    public MyResponse searchAll(){

        return MyResponse.success();
    }



}
