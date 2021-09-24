package io.github.fdj32.app.dao;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class CompositePrimaryKey4 implements Serializable {

	private static final long serialVersionUID = 1289691162383029517L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer identityId;

	@Column(name = "instance_id")
	private Integer instanceId;

	@Column(name = "country", length = 50)
	private String country;

	@Column(name = "username", length = 50)
	private String username;

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

	public CompositePrimaryKey4(Integer identityId, Integer instanceId, String country, String username) {
		super();
		this.identityId = identityId;
		this.instanceId = instanceId;
		this.country = country;
		this.username = username;
	}

	public CompositePrimaryKey4(Integer instanceId, String country, String username) {
		super();
		this.instanceId = instanceId;
		this.country = country;
		this.username = username;
	}

	public CompositePrimaryKey4() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(identityId, instanceId, country, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		CompositePrimaryKey4 cpk = (CompositePrimaryKey4) obj;
		return Objects.equals(identityId, cpk.identityId) && Objects.equals(instanceId, cpk.instanceId)
				&& Objects.equals(country, cpk.country) && Objects.equals(username, cpk.username);
	}

}