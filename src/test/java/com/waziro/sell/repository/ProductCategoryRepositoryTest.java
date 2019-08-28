package com.waziro.sell.repository;

import com.waziro.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void getOneTest(){
        //ProductCategory productCategory = repository.getOne(1);
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.toString());
    }

    @Rollback(false)
    @Test
    public void saveTest(){
        /*ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("年轻人最爱");
        productCategory.setCategoryType(1002);
        repository.save(productCategory);*/
        ProductCategory productCategory = repository.findById(7).get();
        productCategory.setCategoryName("我的最爱");
        ProductCategory result= repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(1001,1002,1003);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}