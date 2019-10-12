package com.zensar.Services;

import org.springframework.stereotype.Service;

import com.zensar.entities.User;
@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(User user) {
		// TODO Auto-generated method stub
		if(user.getUsername().equals("rohini") && user.getPassword().equals("rohini"))
		{
			return true;
		}
		else {
		return false;
	}

}
}
