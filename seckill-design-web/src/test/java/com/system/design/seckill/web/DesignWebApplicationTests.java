package com.system.design.seckill.web;

import com.system.design.seckill.common.entity.Seckill;
import com.system.design.seckill.service.KillBuzServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DesignWebApplicationTests {

    @Autowired
    private KillBuzServiceImpl seckillService;

//    @Test
//    public void test() {
//        Seckill seckill = new Seckill();
//        seckill.setCount(9999L);
//        seckill.setSeckillId(3L);
//        seckillService.updateById(seckill);
//    }
//
//    @Test
//    public void save() {
//        Seckill seckill = new Seckill();
//        seckill.setCount(888L);
//        seckill.setSeckillId(3L);
//        seckillService.save(seckill);
//    }

}
