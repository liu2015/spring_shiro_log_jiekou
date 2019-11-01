package com.example.demo.service;

import com.example.demo.entity.TUser;

import java.util.List;

/**
 * @ProjectName: demo1030
 * @Package: com.example.demo.service
 * @ClassName: TuserService
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/10/31 15:47
 * @Version: 1.0
 */

public interface TuserService {
    // 添加一跳信息
    public boolean add(TUser user);

    // 删除一跳信息
    public  boolean del (TUser user);

    // 查询所有内容
    public List<TUser> findall();

    // 查询条件获得结果
    public List<TUser> seach(String userName,String phone);

    //插入一条信息
    public int inert1(TUser user);

    public TUser selectOne(TUser user);

    public int updateByPrimaryKey(TUser user);
    public List<TUser> select(TUser user);
}
