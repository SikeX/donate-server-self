package com.heu.donateserver.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 拦截器
 * 1. 编写一个拦截器，实现 HandlerInterceptor 接口
 * 2. 把拦截器注册到容器中 ( 实现 WebMvcConfigurer 的  addInterceptors 方法)
 * 3. 指定拦截规则 【如果拦截所有，静态资源也会被拦截，可以用 excludePathPatterns 方法放行】
 */
/**
 * 登陆检查
 * @Slf4j
 * 1. @Slf4j 是 lombok提供的功能
 * 2. @Slf4j 注入后就可以使用 log.info()
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    // 目标方法执行之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true; // true表示放行
    }

    // 目标方法执行完成之后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    // 页面渲染以后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
