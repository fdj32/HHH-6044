package io.github.fdj32.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "hello_sun")
@IdClass(CompositePrimaryKey3.class)
public class HelloSun {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer identityId;
	@Id
	@Column(name = "instance_id")
	private Integer instanceId;
	@Id
	@Column(name = "country", length = 50)
	private String country;
	@Column(name = "username", length = 50)
	private String username;

	public CompositePrimaryKey3 getId() {
		return new CompositePrimaryKey3(getIdentityId(), getInstanceId(), getCountry());
	}

	public void setId(CompositePrimaryKey3 id) {
		setIdentityId(id.getIdentityId());
		setInstanceId(id.getInstanceId());
		setCountry(id.getCountry());
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
