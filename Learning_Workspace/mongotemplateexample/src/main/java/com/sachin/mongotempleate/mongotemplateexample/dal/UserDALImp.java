package com.sachin.mongotempleate.mongotemplateexample.dal;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.sachin.mongotempleate.mongotemplateexample.document.User;

@Repository
public class UserDALImp implements UserDAL {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		mongoTemplate.save(user);
	}
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(User.class);
	}

	@Override
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		return mongoTemplate.findOne(query, User.class);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		mongoTemplate.save(user);
	}

	@Override
	public Map<String, String> getUserSetting(Integer userId) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.fields().include("setting");
		query.addCriteria(Criteria.where("userId").is(userId));
		return mongoTemplate.findOne(query, User.class).getSetting();
	}

	@Override
	public void updateSetting(Integer userId,Map<String, String> setting) {
		// TODO Auto-generated method stub
		Query query =new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		User user = mongoTemplate.findOne(query, User.class);
		if(user !=null) {
			for(String key: setting.keySet()) {
				user.getSetting().put(key, setting.get(key));
			}
			mongoTemplate.save(user);
		}
	}
}
