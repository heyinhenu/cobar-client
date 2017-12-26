package cobar.client.demo.common;

import java.io.Serializable;
import java.util.List;
/**
 * @author Administrator
 * 
 * @param <T>
 */
public class Result<T> implements Serializable {
	private static final long serialVersionUID = -2781183900191543558L;
	
	private boolean isSuccess = true;
	private List<T> list;
	private int count;
	private String errorMsg;
	
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
