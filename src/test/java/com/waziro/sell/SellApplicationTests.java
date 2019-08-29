package com.waziro.sell;

import com.waziro.sell.util.KeyUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellApplicationTests {

    @Test
    public void contextLoads() {
        for(int i=0; i<10; i++){
            System.out.println(KeyUtil.genUniqueKey());
        }
    }

}
