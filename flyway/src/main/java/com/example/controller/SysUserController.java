package com.example.controller;

import com.example.domain.entity.SysUser;
import com.example.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @Description 系统用户表 前端控制器
 * @Author huangliang
 * @Date 2021-06-19
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController implements ApplicationRunner {

    private final SysUserService sysUserService;

    @Autowired
    public SysUserController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @GetMapping("list")
    public void list() {
        List<SysUser> list = sysUserService.list();
        list.stream().forEach(user -> System.out.println(user.getRealName()));
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        list();
    }
}
