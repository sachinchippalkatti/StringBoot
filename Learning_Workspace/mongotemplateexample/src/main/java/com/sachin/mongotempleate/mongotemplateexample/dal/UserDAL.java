package com.sachin.mongotempleate.mongotemplateexample.dal;

import java.util.List;
import java.util.Map;

import com.sachin.mongotempleate.mongotemplateexample.document.User;

public interface UserDAL {
	void addNewUser(User user);
	public List<User> getAllUser();
	public User getUserById(Integer userId);
	void updateUser(User user);
	Map<String,String> getUserSetting(Integer userId);
	void updateSetting(Integer userId,Map<String,String> setting);
}
