package com.hyj.pet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hyj.pet.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
