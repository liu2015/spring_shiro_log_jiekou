package com.example.demo.service.impl;

import com.example.demo.entity.SysUser;
import com.example.demo.mapper.SysUserMapper;
import com.example.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: demo1030
 * @Package: com.example.demo.service.impl
 * @ClassName: SysUserServiceimpl
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/10/30 10:15
 * @Version: 1.0
 */
@Service
public class SysUserServiceimpl implements SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser selectOne(SysUser user) {
        return sysUserMapper.selectOne( user );

    }
}
