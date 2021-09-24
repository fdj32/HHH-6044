package io.github.fdj32.app.dao;

import java.io.Serializable;
import java.util.Objects;

public class CompositePrimaryKey implements Serializable {

	private static final long serialVersionUID = 4044633935060068931L;

	private Integer identityId;

	private Integer instanceId;

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

	public CompositePrimaryKey(Integer identityId, Integer instanceId) {
		this.identityId = identityId;
		this.instanceId = instanceId;
	}

	public CompositePrimaryKey(Integer instanceId) {
		this.instanceId = instanceId;
	}

	public CompositePrimaryKey() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(identityId, instanceId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		CompositePrimaryKey cpk = (CompositePrimaryKey) obj;
		return Objects.equals(identityId, cpk.identityId) && Objects.equals(instanceId, cpk.instanceId);
	}

}