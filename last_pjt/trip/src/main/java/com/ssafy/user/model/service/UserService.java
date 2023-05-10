package com.ssafy.user.model.service;

import java.util.List;

import com.ssafy.user.model.User;

public interface UserService {
	int joinMember(User user) throws Exception;
	User loginMember(String userId, String userPwd) throws Exception;
	List<User> listMember() throws Exception;
	void updateMember(User user) throws Exception;
	void deleteMember(String userId) throws Exception;
	

}
