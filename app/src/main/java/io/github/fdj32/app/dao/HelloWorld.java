package io.github.fdj32.app.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "hello_world")
@IdClass(CompositePrimaryKey.class)
public class HelloWorld implements Serializable {

	private static final long serialVersionUID = -4693673479580230030L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer identityId;
	@Id
	@Column(name = "instance_id")
	private Integer instanceId;
	@Column(name = "username", length = 50)
	private String username;
	@Column(name = "country", length = 50)
	private String country;

	public CompositePrimaryKey getId() {
		return new CompositePrimaryKey(getIdentityId(), getInstanceId());
	}

	public void setId(CompositePrimaryKey id) {
		setIdentityId(id.getIdentityId());
		setInstanceId(id.getInstanceId());
	}

	public Integer getIdentityId() {
		return identityId;
	}

	public void setIdentityId(Integer identityId) {
		this.identityId = identityId;
	}

	public Integer getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(Integer instanceId) {
		this.instanceId = instanceId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
