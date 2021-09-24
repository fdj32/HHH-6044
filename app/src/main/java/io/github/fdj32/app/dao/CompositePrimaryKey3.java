package io.github.fdj32.app.dao;

import java.io.Serializable;
import java.util.Objects;

public class CompositePrimaryKey3 implements Serializable {

	private static final long serialVersionUID = 800880696422225128L;

	private Integer identityId;

	private Integer instanceId;
	
	private String country;

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

	public CompositePrimaryKey3(Integer identityId, Integer instanceId, String country) {
		super();
		this.identityId = identityId;
		this.instanceId = instanceId;
		this.country = country;
	}

	public CompositePrimaryKey3(Integer instanceId, String country) {
		super();
		this.instanceId = instanceId;
		this.country = country;
	}

	public CompositePrimaryKey3() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(identityId, instanceId, country);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		CompositePrimaryKey3 cpk = (CompositePrimaryKey3) obj;
		return Objects.equals(identityId, cpk.identityId) && Objects.equals(instanceId, cpk.instanceId) && Objects.equals(country, cpk.country);
	}

}