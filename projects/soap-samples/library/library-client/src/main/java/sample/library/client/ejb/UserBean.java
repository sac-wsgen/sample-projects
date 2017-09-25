package sample.library.client.ejb;

import javax.ejb.Stateless;

import sample.library.service.ILibraray;
import sample.library.service.LibrarayService;
import sample.library.service.User;

@Stateless
public class UserBean {
	
	public boolean registerUser(String username) {
		LibrarayService libService = new LibrarayService();
		ILibraray library = libService.getLibrarayPort();
		
		if(!library.usernameExists(username)) {
			library.registerUser(username);
			return true;
		}
		
		throw new UserRegisterException();
	}
	
	public boolean deleteUser(String username) {
		LibrarayService libService = new LibrarayService();
		ILibraray library = libService.getLibrarayPort();
		
		if(library.usernameExists(username)) {
			User user = library.getUserByUsername(username);
			boolean ret = library.removeUser(user.getId());
			if(!ret) {
				throw new UserDeleteException();
			}
			
			// user must have been removed 
			// -> second web service call must return FALSE 
			//    if user has been successfully removed
			boolean postRet = library.removeUser(user.getId());
			if(postRet) {
				throw new UserDeleteException();
			}
			
			return true;
		}
		
		return false;
	}

	public User getUserByName(String username) {
		LibrarayService libService = new LibrarayService();
		ILibraray library = libService.getLibrarayPort();
		
		return library.getUserByUsername(username);
	}

	
}
