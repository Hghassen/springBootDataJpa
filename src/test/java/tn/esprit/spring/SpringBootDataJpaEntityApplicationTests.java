package tn.esprit.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.IUserService;
import tn.esprit.spring.service.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDataJpaEntityApplicationTests {

	@Autowired
	IUserService us;
	
	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);

	@Test
	public void testRetrieveUser()  {
		User user = us.retrieveUser("1");
		l.info("retrieveUser : "+  user);
	}

	public void testretrieveAllUsers() {
		us.retrieveAllUsers();
	}
/*
	@Test
	public void testdeleteUser(String id) {
		us.deleteUser(id);

	}

	@Test
	public void contextLoads() {
		us.retrieveAllUsers();
	}*/
}
