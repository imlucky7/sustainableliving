package com.exercise.dao;

import com.exercise.rest.api.vo.LoginVO;

public interface IUserDao {
	public boolean register(LoginVO loginVO) throws Exception;
	public boolean login(LoginVO loginVO) throws Exception;
}
