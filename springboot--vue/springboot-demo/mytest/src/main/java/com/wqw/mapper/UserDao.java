package com.wqw.mapper;

import com.wqw.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {
	public User findUser(@Param("username") String username);
}
