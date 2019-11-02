package com.example.demo.mapper;

import com.example.demo.entity.TUser;
import mybatis.MyMapper;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface TUserMapper extends MyMapper<TUser> {
    Boolean add(TUser user);

    List<TUser> seach(String userName, String phone);
    int insert1(TUser user);

}