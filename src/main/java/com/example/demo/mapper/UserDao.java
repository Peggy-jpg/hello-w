package com.example.demo.mapper;

import com.example.demo.pojo.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM user WHERE id = #{id}")
  User getUserById(int id);

}
