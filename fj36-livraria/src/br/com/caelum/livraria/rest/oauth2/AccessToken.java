package br.com.caelum.livraria.rest.oauth2;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class AccessToken implements Serializable{

	private transient String token;
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public Boolean isPreenchido() {
		return token!=null;
	}
}
