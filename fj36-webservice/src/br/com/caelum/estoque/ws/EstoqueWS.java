package br.com.caelum.estoque.ws;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;



@Stateless
@WebService(targetNamespace="http://caelum.com.br/estoque/v1")
public class EstoqueWS {
	
private Map<String, ItemEstoque>repositorio = new HashMap<String,ItemEstoque>();
	
	public EstoqueWS() throws RemoteException {
		repositorio.put("ARQ", new ItemEstoque("ARQ",5));
		repositorio.put("SOA", new ItemEstoque("SOA",2));
		repositorio.put("TDD", new ItemEstoque("TDD",3));
		repositorio.put("RES", new ItemEstoque("RES",4));
		repositorio.put("LOG", new ItemEstoque("LOG",3));
		repositorio.put("WEB", new ItemEstoque("WEB",4));
	}

	@WebMethod(operationName="ItensPeloCodigo")
	@WebResult(name="ItemEstoque")
	public List<ItemEstoque> getQuantidade(
			@WebParam(name="codigo")List<String> codigos, 
			@WebParam(name="tokenUsuario",header=true)String token ) throws RemoteException {
		
		if(token == null || !token.equals("TOKEN123"))throw new AutorizacaoException("Nao autorizado");
		
		List<ItemEstoque>itens = new ArrayList<ItemEstoque>();
		
		if(codigos == null || codigos.isEmpty()) {
			return itens;
		}
		
		for(String codigo : codigos){
			if(repositorio.containsKey(codigo)){
				itens.add(repositorio.get(codigo));
			}
		}
		return itens;
	}
}
