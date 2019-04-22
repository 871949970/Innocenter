package com.inno.eurekaclient.Dao;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao {


    String selectAll();
}
