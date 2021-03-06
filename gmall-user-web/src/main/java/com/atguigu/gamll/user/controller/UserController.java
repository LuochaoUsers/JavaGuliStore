/**
 * FileName: UserController
 * Author:   #include
 * Date:     2019/12/1 17:05
 * Description:
 */
package com.atguigu.gamll.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 */
@Controller
public class UserController {

    @Reference
    private UserService userService;


    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello world!";
    }

}
