package cobar.client.demo.service;

import java.util.List;

import cobar.client.demo.common.Result;
import cobar.client.demo.model.User;
import cobar.client.demo.query.UserQuery;

public interface UserService {
	public Long addUser(User user)throws Exception;
	public User getUserByKey(User user)throws Exception;
	public User getUserByID(User user)throws Exception;
	public List<User> getUserByKeys(List<Long> idList)throws Exception;
	public Integer deleteByKey(User user)throws Exception;
	public Integer deleteByKeys(List<Long> idList)throws Exception;
	public Integer updateUserByKey(User user)throws Exception;
	public Result<User> getUserListWithPage(UserQuery userQuery)throws Exception;
	public List<User> getUserList(UserQuery userQuery)throws Exception;
}
