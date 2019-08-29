package com.waziro.sell.util;

import javax.swing.text.Style;
import java.util.Random;

public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式 时间+随机数
     * @return
     */

    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(10000)+10;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
