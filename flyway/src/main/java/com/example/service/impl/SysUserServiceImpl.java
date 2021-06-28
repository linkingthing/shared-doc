package com.example.service.impl;

import com.example.domain.entity.SysUser;
import com.example.domain.repository.SysUserRepository;
import com.example.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Description 系统用户表 服务实现类
 * @Author huangliang
 * @Date 2021-06-19
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserRepository, SysUser> implements SysUserService {

}
