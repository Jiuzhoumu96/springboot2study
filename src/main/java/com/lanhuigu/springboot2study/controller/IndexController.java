package com.lanhuigu.springboot2study.controller;

import com.lanhuigu.springboot2study.po.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "登录", tags = {"用户操作接口"})
//tags表示说明；value也是说明，可以使用tags替代
@Controller
public class IndexController {

    private static final Logger log = LoggerFactory.getLogger(IndexController.class);

    @ApiOperation(value = "login", notes = "登录")
    // value用于方法描述；notes用于提示内容；tags可以重新分组（视情况而用）
    @GetMapping(value = "/login")
    // @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        log.info(">>>>>> IndexController.loginPage");
        return "login";
    }

    @ApiOperation(value = "登录", notes = "输入用户名，密码")
    // value用于方法描述；notes用于提示内容；tags可以重新分组（视情况而用）
    @ApiImplicitParams({
            @ApiImplicitParam(name = "session", value = "会话", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "user", value = "用户", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "model", value = "model", required = true, dataType = "String", paramType = "query")})
    // name参数名；value参数说明；required是否必填；dataType数据类型；paramType参数类型；example举例说明
    @PostMapping("/login")
    public String main(HttpSession session, User user, Model model) {
        if (StringUtils.isNotBlank(user.getUserName().trim()) && StringUtils.equals(user.getPassWord().trim(), "123")) {
            log.info(">>>>>> IndexController.main");
            session.setAttribute("loginUser", user);
            log.info(">>>>>> user = {}", user);
            //登陆成功，重定向到main.html，重定向防止表单重复提交
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "账号密码错误");
            return "login";
        }
    }

    @ApiOperation(value = "main", notes = "进入main页面")
    // value用于方法描述；notes用于提示内容；tags可以重新分组（视情况而用）
    @ApiImplicitParams({
            @ApiImplicitParam(name = "session", value = "会话", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "model", value = "model", required = true, dataType = "String", paramType = "query")})
    // name参数名；value参数说明；required是否必填；dataType数据类型；paramType参数类型；example举例说明
    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model) {
        log.info(">>>>>> IndexController.mainPage");
        return "main";
    }

}
