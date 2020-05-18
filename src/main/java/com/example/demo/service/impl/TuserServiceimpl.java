package com.example.demo.service.impl;

import com.example.demo.entity.TUser;
import com.example.demo.mapper.TUserMapper;
import com.example.demo.service.TuserService;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.provider.base.BaseSelectProvider;
import tk.mybatis.mapper.provider.base.BaseUpdateProvider;

import java.util.List;

/**
 * @ProjectName: demo1030
 * @Package: com.example.demo.service
 * @ClassName: TuserServiceimpl
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/10/31 15:45
 * @Version: 1.0
 */
@Service
public class TuserServiceimpl implements TuserService {
    @Autowired
    TUserMapper tUserMapper;


    @Override
    public boolean add(TUser user) {
       /**
        * @Method add
        * @Author ZHY
        * @Version  1.0
        * @Description
        * @param user
        * @Return boolean
        * @Exception
        * @Date 2019/10/31 16:03
        */
        tUserMapper.add( user);
        return false;
    }

    @Override
    public boolean del(TUser user) {
/**
 * @Method del
 * @Author ZHY
 * @Version  1.0
 * @Description
 * @param userId
 * @Return boolean
 * @Exception
 * @Date 2019/10/31 16:03
 */
        tUserMapper.delete( user );
        return false;
    }

    @Override
    public List<TUser> findall() {
        /**
         * @Method findall
         * @Author ZHY
         * @Version  1.0
         * @Description
         * @param
         * @Return java.util.List<com.example.demo.entity.TUser>
         * @Exception
         * @Date 2019/10/31 16:03
         */
        return tUserMapper.selectAll();
    }

    @Override
    public List<TUser> seach(String userName, String phone) {
   /**
    * @Method seach
    * @Author ZHY
    * @Version  1.0
    * @Description
    * @param userName
    * @param phone
    * @Return java.util.List<com.example.demo.entity.TUser>
    * @Exception
    * @Date 2019/10/31 16:03
    */
        return  tUserMapper.seach(userName,phone);

    }


    public int inert1(TUser user) {
    /**
     * @Method inert
     * @Author ZHY
     * @Version  1.0
     * @Description
     * @param user
     * @Return int
     * @Exception
     * @Date 2019/10/31 16:02
     */

        int intset= tUserMapper.insert1( user );
        return intset;

    }


    @SelectProvider(type=BaseSelectProvider.class, method="dynamicSQL")
    public TUser selectOne(TUser user) {
        return tUserMapper.selectOne( user );
    }

    @UpdateProvider(type=BaseUpdateProvider.class, method="dynamicSQL")
    public int updateByPrimaryKey(TUser user) {
        return tUserMapper.updateByPrimaryKey( user );
    }

    @SelectProvider(type=BaseSelectProvider.class, method="dynamicSQL")
    public List<TUser> select(TUser user) {
        return tUserMapper.select( user );
    }
}
