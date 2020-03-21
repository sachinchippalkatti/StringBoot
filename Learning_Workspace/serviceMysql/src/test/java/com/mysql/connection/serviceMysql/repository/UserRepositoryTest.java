package com.mysql.connection.serviceMysql.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mysql.connection.serviceMysql.pojo.User;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testAddUser() {
		User user = getUser();
		User saveduser = entityManager.persist(user);
		User getUser = userRepository.findById(saveduser.getId()).get();
		assertThat(getUser).isEqualTo(saveduser);
	}
	
	@Test
	public void testgetUserById() {
		User user = getUser();
		User saveduser = entityManager.persist(user);
		User getUser = userRepository.findById(saveduser.getId()).get();
		assertThat(getUser).isEqualTo(saveduser);
	}
	
	@Test
	public void testFindByAll() {
		User user = getUser();
		User user1 = getUser();
		entityManager.persist(user);
		entityManager.persist(user1);
		Iterable<User> getallUser = userRepository.findAll();
		List<User> actualList = new ArrayList<User>();
		for(User us : getallUser) {
			actualList.add(us);
		}
		
		assertThat(actualList.size()).isEqualTo(2);
	}
	
	public User getUser() {
	User user = new User();
	user.setName("sachin");
	//user.setAddress("chippalkatti");
	user.setDes("chippalkatti");
	return user;
	}
	
}
