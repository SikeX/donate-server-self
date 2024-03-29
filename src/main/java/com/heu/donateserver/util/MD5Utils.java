package com.heu.donateserver.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

    /**使用MD5算法进行加密
     *
     * @param plainText
     * @return md5code
     */
    public static String md5(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes());
            } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有MD5这个算法");
        }

        // 16进制数
        String md5code = new BigInteger(1, secretBytes).toString(16);
        // 如果生成的数字未满32位，需要前面补0
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }
}
