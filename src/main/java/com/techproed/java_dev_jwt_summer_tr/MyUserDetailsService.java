package com.techproed.java_dev_jwt_summer_tr;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService {
     
	@Override
	@Bean
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		return new User ("admin","nimda", new ArrayList<>()); //arraylist is for the authorities
	}

}
