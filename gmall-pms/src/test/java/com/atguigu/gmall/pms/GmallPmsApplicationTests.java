package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class GmallPmsApplicationTests {
    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        Product product = productService.getById(1);
//        System.out.println(product.getName());
        //测试增删改在主库，查在从库
        Brand brand = new Brand();
        brand.setName("哈哈哈");
        brandService.save(brand);
    }

}
