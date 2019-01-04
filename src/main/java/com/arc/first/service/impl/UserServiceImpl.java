package com.arc.first.service.impl;

import com.arc.first.mapper.system.UserMapper;
import com.arc.first.model.entries.SysUser;
import com.arc.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/4 15:28
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override

    public Long save(SysUser user) {
        return userMapper.save(user) == 1 ? user.getId() : null;
    }

    @Override
    public int delete(Long id) {
        return userMapper.delete(id);
    }

    @Override
    @Transactional
    public int update(SysUser user) {
        return userMapper.update(user);
    }

    @Override
    public SysUser get(Long id) {
        return userMapper.get(id);
    }

    @Override
    public SysUser getByFilePath(String username) {
        return userMapper.getByUsername(username);
    }

    @Override
    public List<SysUser> list() {
        return userMapper.list();
    }

    @Override
    public SysUser getByUsername(String username) {
        return userMapper.getByUsername(username);
    }
}
