package com.exercise.dao;

import com.exercise.rest.api.vo.LoginVO;

public interface IUserDao {
	public void register(LoginVO loginVO) throws Exception;
	public boolean login(LoginVO loginVO) throws Exception;
}
