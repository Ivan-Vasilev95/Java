package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import Entity.User;

public class XMLWorker {

	public void writeToXMLFile(String xmlFile, Collection<User> users) throws JAXBException {

		UserList list = new UserList();
		list.setUserBeans(new ArrayList<User>(users));
		// Създаване на JAXB контекст
		JAXBContext context = JAXBContext.newInstance(UserList.class);
		// Създаване на marshaller инстанция
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		// Записване в System.out
		m.marshal(list, System.out);
		// Записване във файл
		m.marshal(list, new File(xmlFile));

	}

	public UserList readerFromXMLFile(String xmlFile)
			throws JAXBException, FileNotFoundException, UnsupportedEncodingException {

		// Създаване на JAXB контекст
		JAXBContext context = JAXBContext.newInstance(UserList.class);
		// Създаване на unmarshaller инстанция
		Unmarshaller um = context.createUnmarshaller();

		InputStream imInputStream = new FileInputStream(xmlFile);
		Reader reader = new InputStreamReader(imInputStream, "UTF-8");

		UserList users = (UserList) um.unmarshal(reader);

		return users;

	}

}
