package com.test.useraction;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.exercise.dao.IUserDao;
import com.exercise.dao.UserDaoImpl;
import com.exercise.rest.api.vo.LoginVO;

public class UserActionTest {
	
	IUserDao userDao;
	
	@Before
	public void initialize() {
		userDao = new UserDaoImpl();
	}
	
	@Test
	public void validRegister() throws Exception{
		LoginVO loginVO= new LoginVO();
		loginVO.setEmailId("abc@mail.com");
		loginVO.setPassword("12345");
		loginVO.setConfirmPassword("12345");
		
		assertTrue(userDao.register(loginVO));
	}
	
	@Test
	public void invalidRegister() {
		LoginVO loginVO= new LoginVO();
		loginVO.setEmailId("abc@mail.com");
		loginVO.setPassword("12345");
		loginVO.setConfirmPassword("123456");
		
		try {
			userDao.register(loginVO);
		} catch (Exception e) {
			e.printStackTrace();
			assertEquals("Exception message", e.getMessage());
		}
	}
	
	@Test
	public void validLogin() throws Exception{
		LoginVO loginVO= new LoginVO();
		loginVO.setEmailId("abc@mail.com");
		loginVO.setPassword("12345");
		
		assertTrue(userDao.login(loginVO));
	}
	
	@Test
	public void invalidLogin() {
		LoginVO loginVO= new LoginVO();
		loginVO.setEmailId("abc@mail.com");
		loginVO.setPassword("123456");
		
		try {
			userDao.login(loginVO);
		} catch (Exception e) {
			e.printStackTrace();
			assertEquals("Exception message", e.getMessage());
		}
	}
}
