package com.heu.donateserver.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.heu.donateserver.entity.Admin;

import java.util.Date;

public class TokenUtil {
    // token过期时间 单位ms
    private static final long EXPIRE_TIME = 60*60*1000;
    // 密码盐
    private static final String TOKEN_SECRET = "something";

    /**
     * 签名生成
     * @param user
     * @return token
     */
    public static String sign(Admin user){
        String token = null;
        try {
            Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            token = JWT.create()
                    .withIssuer("auth0")
                    .withClaim("username", user.getName())
                    .withExpiresAt(expiresAt)
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return token;
    }

    /**
     * 签名认证
     * @param token
     * @return boolean
     */
    public static boolean verify(String token){
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth0").build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println("认证通过: ");
            System.out.println("username" + jwt.getClaim("username").asString());
            System.out.println("过期时间: " + jwt.getExpiresAt());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
