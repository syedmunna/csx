package jaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ObjectToXml_mashalling {
	
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		JAXBContext context= JAXBContext.newInstance(JaxBExample.class);
		/*Converting object to Xml(Marshalling)*/
		/*Marshaller marsh =context.createMarshaller();
		marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		JaxBExample jb = new JaxBExample(1000,"munna",new Double(20000));
		marsh.marshal(jb, new FileOutputStream("employee.xml"));*/
		/*Converting Xml to object unmarshalling*/
		File f=new File("employee.xml");
		Unmarshaller unmarsh =context.createUnmarshaller();
		JaxBExample jb =(JaxBExample)unmarsh.unmarshal(f);
		System.out.println(jb.getId()+ " "+jb.getName()+" "+jb.getSalary() );
	}

}
