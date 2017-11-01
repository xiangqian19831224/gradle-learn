package com.example.demo;

import org.apache.ibatis.annotations.*;

/**
 * TODO: comment here
 */
@Mapper
public interface AccountDao {
	@Select("SELECT * FROM account where username=#{username}")
	Account findById(@Param("username") String username);
}
