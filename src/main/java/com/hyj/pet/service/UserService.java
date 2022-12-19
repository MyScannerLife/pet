package com.hyj.pet.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.pet.mapper.UserMapper;

public interface UserService extends IService<UserMapper> {
    int test();
}
