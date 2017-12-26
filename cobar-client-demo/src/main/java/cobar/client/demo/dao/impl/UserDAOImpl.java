package cobar.client.demo.dao.impl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import cobar.client.demo.common.Result;
import cobar.client.demo.dao.UserDAO;
import cobar.client.demo.model.User;
import cobar.client.demo.query.UserQuery;
@SuppressWarnings("deprecation")
@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Resource
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	
	@Override
	public Long addUser(User user) throws SQLException {
		
		return (Long) sqlMapClientTemplate.insert("IUser.insertUser", user);
	}

	@Override
	public User getUserByKey(User user) throws SQLException {
		return (User) sqlMapClientTemplate.queryForObject("IUser.getUserByKey", user);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserByKeys(List<Long> idList) throws SQLException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("keys", idList);
		
		return sqlMapClientTemplate.queryForList("IUser.getUsersByKeys", params);
	}

	@Override
	public Integer deleteByKey(User user) throws SQLException {
		return sqlMapClientTemplate.delete("IUser.deleteByKey", user);
	}

	@Override
	public Integer deleteByKeys(List<Long> idList) throws SQLException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("keys", idList);
		Integer row = sqlMapClientTemplate.delete("IUser.deleteByKeys", params);
		return row;
	}

	@Override
	public Integer updateUserByKey(User user) throws SQLException {
		return sqlMapClientTemplate.update("IUser.updateUserByKey", user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Result<User> getUserListWithPage(UserQuery userQuery) {
		Result<User> rs = new Result<User>();
		try {
			rs.setCount((Integer) this.sqlMapClientTemplate.queryForObject("IUser.getUserListCount", userQuery));
			if (userQuery.getFields() != null && userQuery.getFields() != "") {
				rs.setList((List<User>) this.sqlMapClientTemplate.queryForList(
						"IUser.getUserListWithPageFields", userQuery));
			} else {
				rs.setList((List<User>) this.sqlMapClientTemplate.queryForList(
						"IUser.getUserListWithPage", userQuery));
			}
		} catch (Exception e) {
			rs.setSuccess(false);
			rs.setCount(0);
			rs.setList(Collections.<User> emptyList());
			rs.setErrorMsg(e.toString());
		}
		return rs;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserList(UserQuery userQuery) throws SQLException {
		if (userQuery.getFields() != null && userQuery.getFields() != "") {
			return (List<User>) this.sqlMapClientTemplate.queryForList("IUser.getUserListFields", userQuery);
		}
		
		return (List<User>) this.sqlMapClientTemplate.queryForList("IUser.getUserList", userQuery);
	}

	@Override
	public User getUserByID(User user) throws SQLException {
		return (User) sqlMapClientTemplate.queryForObject("IUser.getUserByID", user);
	}

}
