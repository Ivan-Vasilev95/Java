package Data;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import Entity.User;

@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserList {

	@XmlElement(name = "user")
	private ArrayList<User> userBeans;
	
	public UserList(){
		userBeans=new ArrayList();
	}

	public ArrayList<User> getUserBeans() {
		return userBeans;
	}

	public void setUserBeans(ArrayList<User> userBeans) {
		this.userBeans = userBeans;
	}

}
