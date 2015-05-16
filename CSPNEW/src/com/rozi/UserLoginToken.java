package com.rozi;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class UserLoginToken {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) //아 저장되는 필드구나
	private Long key; //프라이머리
	
	@Persistent
	private String account; 
	
	@Persistent
	private String token; 
	
	@Persistent
	private String expireDate; 
	
	public UserLoginToken(String account, String token, String expireDate){
		this.account = account;
		this.token  = token;
		this.expireDate = expireDate;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public Long getKey() {
		return key;
	}

	public String getAccount() {
		return account;
	}
	
}
