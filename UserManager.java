package javaCamp3;

   

public class UserManager {
	
	public void Add(User user) {
		System.out.println(user.getName() + " isimli kullanici eklendi");
		
	}
	public void AddMultiple(User [] users) {
		for(User user : users) {
			Add(user);
		}
	}

}
