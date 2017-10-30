package com.exercise.rest.api;

import javax.ws.rs.core.Response;

import com.exercise.rest.api.vo.ConsumptionVO;
import com.exercise.rest.api.vo.LoginVO;
import com.exercise.template.ITemplate;

public class UserActivityImp implements IUserActivity {
	
	/*
	 * This method will fetch the User details based on userId
	 * 
	 * @see com.exercise.rest.api.IUserActivity#getUser(java.lang.String)
	 */
	@Override
	public Response getUser(String userId) throws Exception {
		
		return null;
	}
	
	/*
	 * This method will register the user with the system
	 * 
	 * @see com.exercise.rest.api.IUserActivity#register(com.exercise.rest.api.vo.LoginVO)
	 */
	@Override
	public Response register(LoginVO login) throws Exception {
		IUserActivity userDao = new UserActivityImp();
		userDao.register(login);
		return null;
	}
	
	/*
	 * This method will login the user in the system
	 * 
	 * @see com.exercise.rest.api.IUserActivity#login(com.exercise.rest.api.vo.LoginVO)
	 */
	@Override
	public Response login(LoginVO login) throws Exception {
		IUserActivity userDao = new UserActivityImp();
		userDao.login(login);
		return null;
	}

	/*
	 * User specific consumption records could be fetched in a time frame
	 * 
	 * @see com.exercise.rest.api.IUserActivity#getCosumptionRecordByDate(java.lang.String, com.exercise.rest.api.vo.ConsumptionVO)
	 */
	@Override
	public Response getCosumptionRecordByDate(String userId, ConsumptionVO vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * Set the sustability goal for the user 
	 * 
	 * @see com.exercise.rest.api.IUserActivity#setSustabilityGoals(java.lang.String, com.exercise.template.ITemplate)
	 */
	@Override
	public Response setSustabilityGoals(String userId, ITemplate template) throws Exception {
		return null;
	}

	/*
	 * get the badges for the user
	 * 
	 * @see com.exercise.rest.api.IUserActivity#getBadges(java.lang.String)
	 */
	@Override
	public Response getBadges(String userId) throws Exception {
		return null;
	}

	/*
	 * get the sustainability score for the user
	 * 
	 * @see com.exercise.rest.api.IUserActivity#getSustainabilityScore(java.lang.String)
	 */
	@Override
	public Response getSustainabilityScore(String userId) throws Exception {
		return null;
	}

	/*
	 * get the incentives for the user
	 * 
	 * @see com.exercise.rest.api.IUserActivity#getIncentives(java.lang.String)
	 */
	@Override
	public Response getIncentives(String userId) throws Exception {
		return null;
	}

}
