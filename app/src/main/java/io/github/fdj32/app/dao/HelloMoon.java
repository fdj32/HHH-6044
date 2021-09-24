package io.github.fdj32.app.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hello_moon")
public class HelloMoon {

	@EmbeddedId
	private CompositePrimaryKey4 cpk4;

	@Column(name = "said_date")
	private Date date;

	public CompositePrimaryKey4 getCpk4() {
		return cpk4;
	}

	public void setCpk4(CompositePrimaryKey4 cpk4) {
		this.cpk4 = cpk4;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
