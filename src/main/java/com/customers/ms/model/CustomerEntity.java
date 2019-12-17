package com.customers.ms.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection = "CustomerStaff")
@JsonPropertyOrder({"idC","nameC","lastNameC","dniC","Addr","Num"})
public class CustomerEntity {

	@Id
	private String idC;
	
	@NotEmpty(message = "not firts name")
	private String nameC;
	
	@NotEmpty(message = "not lastname")
	private String lastNameC;
	
	@NotEmpty(message = "not dniC")
	@Size(min = 8, max = 8, message = "must contain 8 characters")
	private String dniC;

	@NotEmpty(message = "not Addr")
	private String Addr;

	
	@NotEmpty(message = "not Num")
	private String Num;

	public String getIdC() {
		return idC;
	}

	public void setIdC(String idC) {
		this.idC = idC;
	}

	public String getNameC() {
		return nameC;
	}

	public void setNameC(String nameC) {
		this.nameC = nameC;
	}

	public String getLastNameC() {
		return lastNameC;
	}

	public void setLastNameC(String lastNameC) {
		this.lastNameC = lastNameC;
	}

	public String getDniC() {
		return dniC;
	}

	public void setDniC(String dniC) {
		this.dniC = dniC;
	}

	public String getAddr() {
		return Addr;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}

	public String getNum() {
		return Num;
	}

	public void setNum(String num) {
		Num = num;
	}
	
	
}
