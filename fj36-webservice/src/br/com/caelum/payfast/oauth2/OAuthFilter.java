package br.com.caelum.payfast.oauth2;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.apache.oltu.oauth2.rs.request.OAuthAccessResourceRequest;

@Provider
@ProtegidoPorOAuth
public class OAuthFilter implements ContainerRequestFilter {

	@Inject
	private HttpServletRequest request;
	
	@Inject
	private TokenDao dao;

	@Override
	public void filter(ContainerRequestContext ctx) throws IOException {
		System.out.println("Validando o access Token...");
		
		Response unauthorized = Response.status(Status.UNAUTHORIZED).build();
		
		try {
			OAuthAccessResourceRequest oauthRequest =
					new OAuthAccessResourceRequest(request);
			
			String accessToken = oauthRequest.getAccessToken();
			
			if(!dao.existeAccessToken(accessToken)) {
				ctx.abortWith(unauthorized);
			}
			
		}catch(Exception e) {
			ctx.abortWith(unauthorized);
		}
	}
}
