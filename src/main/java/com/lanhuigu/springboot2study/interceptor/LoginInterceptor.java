package com.lanhuigu.springboot2study.interceptor;

import com.lanhuigu.springboot2study.po.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Jiuzhoumu
 * @date 2021/9/21 19:06
 */

/**
 * 登陆检查
 * 1、配置好拦截器要拦截哪些请求
 * 2、把这些配置放在容器中
 */
public class LoginInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(LoginInterceptor.class);

    /**
     * 目标方法执行之前
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info(">>>>>> 执行LoginInterceptor.LoginInterceptor的preHandle方法，handler = {}", handler);

        String requestUrl = request.getRequestURI();
        log.info(">>>>>> 拦截的请求的路径是 {}", requestUrl);

        // 登录检查逻辑
        HttpSession session = request.getSession();
        User loginUser = (User) session.getAttribute("loginUser");
        if (null != loginUser) {
            log.info(">>>>>> loginUser = {}", loginUser);
            // 放行
            return true;
        }
        // 拦截。未登录。跳转到登录页
        log.info(">>>>>> 拦截。未登录。跳转到登录页");
        request.setAttribute("msg", "请先登录");
        request.getRequestDispatcher("/").forward(request, response);
        return false;
    }

    /**
     * 目标方法执行之后
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
        log.info(">>>>>> 执行LoginInterceptor.LoginInterceptor的postHandle方法，modelAndView = {}", modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
        log.info(">>>>>> 执行LoginInterceptor.LoginInterceptor的postHandle方法，异常ex = {}", ex);
    }
}
