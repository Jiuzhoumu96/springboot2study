package com.lanhuigu.springboot2study.controller;

import com.lanhuigu.springboot2study.po.User;
import lombok.val;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Jiuzhoumu
 * @date 2021/9/20 23:42
 */
@Controller
public class IndexController {
    
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);
    
    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        
        return "login";
    }
    
    @PostMapping("/login")
    public String main(HttpSession session, User user, Model model) {
        if (StringUtils.isNotBlank(user.getUserName().trim()) && StringUtils.equals(user.getPassWord().trim(),"123456")) {
            session.setAttribute("loginUser", user);
            //登陆成功，重定向到main.html，重定向防止表单重复提交
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
        
        
    }
    
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model) {
        // User loginUser = (User) session.getAttribute("loginUser");
        // if(null != loginUser){
        //     return "main";
        // }else {
        //     model.addAttribute("msg","请重新登录");
        //     return "login";
        // }
        return "main";
    }
    
}
