package com.exercise.dao;

import com.exercise.rest.api.vo.LoginVO;

/**
 * This class will responsible for user related
 * DB transaction. 
 * 
 * @author pranabd
 *
 */
public class UserDaoImpl implements IUserDao {

	/*
	 * This method will register the user with system
	 * 
	 * @see com.exercise.dao.IUserDao#register(com.exercise.rest.api.vo.LoginVO)
	 */
	@Override
	public boolean register(LoginVO loginVO) throws Exception {
		return true;

	}
	
	/*
	 * This method will login the user in the system
	 * @see com.exercise.dao.IUserDao#login(com.exercise.rest.api.vo.LoginVO)
	 */
	@Override
	public boolean login(LoginVO loginVO) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
