package cobar.client.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import cobar.client.demo.model.User;
import cobar.client.demo.service.UserService;

//@ContextConfiguration(locations={"classpath:applicationContext-1.0.xml"})
//@ContextConfiguration(locations={"classpath:applicationContext-c3p0.xml"})
@ContextConfiguration(locations={"classpath:applicationContext-dbcp.xml"})
public class AppTest extends BaseTest{
	@Resource
	private UserService userService;
	
	@Test
	public void testAdd() throws Exception {
		User user = new User();
		Long id = new Long(new Random().nextInt(10000));
		user.setId(id);
		logger.info("id : {}",id);
		user.setName("Tom");
		Long taobaoId = id;
		user.setTaobaoId(taobaoId);
		userService.addUser(user);
	}
	@Test
	public void testGetUserBykey() throws Exception{
		User user = new User();
		user.setId(7658L);
		User user2 = userService.getUserByKey(user);
		logger.info(user2.toString());
	}
	@Test
	public void testGetUserBykeys() throws Exception{
		List<Long> idList = new ArrayList<Long>();
		idList.add(1L);
		idList.add(2L);
		List<User> userByKeys = userService.getUserByKeys(idList);
		for (User user : userByKeys) {
			logger.info(user.toString());
		}
	}
	
	
}
