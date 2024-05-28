package register;

import java.util.ArrayList;
import java.util.List;

public class registerModel {

private List<User> listUser;
	
	public registerModel() {
		// TODO Auto-generated constructor stub
		listUser = new ArrayList<User>();
		listUser.add(new User("abc@gmail.com", "Nguyen Duc Nam"));
		listUser.add(new User("xyz@gmail.com", "Phan Van Duc"));
		listUser.add(new User("opq@gmail.com", "Nguyen Hai Hau"));
	}
	
	public void themUser(User user) {
		listUser.add(user);
	}
	
	public boolean checkExist(String email) {
		for(User user: listUser) {
			if(user.getEmail().equals(email)) {
				return true;
			}
		}
		
		return false;
	}

}
