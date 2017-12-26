package cobar.client.demo.model;

import java.util.Date;

public class User {
	private Long id;
	private Long taobaoId;
	private String name;
	private Date updTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTaobaoId() {
		return taobaoId;
	}
	public void setTaobaoId(Long taobaoId) {
		this.taobaoId = taobaoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getUpdTime() {
		return updTime;
	}
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", taobaoId=" + taobaoId + ", name=" + name + ", updateTime=" + updTime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((taobaoId == null) ? 0 : taobaoId.hashCode());
		result = prime * result + ((updTime == null) ? 0 : updTime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (taobaoId == null) {
			if (other.taobaoId != null)
				return false;
		} else if (!taobaoId.equals(other.taobaoId))
			return false;
		if (updTime == null) {
			if (other.updTime != null)
				return false;
		} else if (!updTime.equals(other.updTime))
			return false;
		return true;
	}
}
