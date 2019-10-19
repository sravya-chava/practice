package com.example.OnlineRetailerManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.OnlineRetailerManagement.Model.Userclass;
import com.example.OnlineRetailerManagement.Repositories.UserDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserSecurityService implements UserDetailsService{
	private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);
	
	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Userclass userclass=userDao.findByUsername(username);
		 if (null == userclass) {
	            LOG.warn("Username {} not found", username);
	            throw new UsernameNotFoundException("Username " + username + " not found");
	        }
		return userclass;
	}

}
