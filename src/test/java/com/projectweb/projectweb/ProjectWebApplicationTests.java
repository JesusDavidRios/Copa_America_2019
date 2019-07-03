package com.projectweb.projectweb;

import com.project.dao.UserDao;
import com.project.model.UserModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectWebApplicationTests {
/*
	@Autowired
	private UserDao userDao;
*/
	@Test
	public void crearUsuarioTest() {
/*
		UserModel userModel= new UserModel();
		userModel.setId(1);
		userModel.setName("Jesus");
		userModel.setPassword("123");
		userModel.setLevel("Admin");
		UserModel userModel1Test = userDao.save(userModel);

		Assert.assertTrue(userModel1Test.getPassword().equalsIgnoreCase(userModel.getPassword()));
*/


	}

}
