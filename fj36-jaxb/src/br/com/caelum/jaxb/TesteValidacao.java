package br.com.caelum.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.util.JAXBSource;
import javax.xml.validation.SchemaFactory;

public class TesteValidacao {

	public static void main(String[] args) throws JAXBException {
		
		Livro livro = new Livro();
		livro.setCodigo("arq");
		
		JAXBContext context = JAXBContext.newInstance(Livro.class);
		JAXBSource source = new JAXBSource(context, livro);
		
		//SchemaFactory sf = SchemaFactory... TODO continuar
		
	}
}
