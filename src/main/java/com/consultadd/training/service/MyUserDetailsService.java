package com.consultadd.training.service;

import com.consultadd.training.model.MyUserDetails;
import com.consultadd.training.model.User;
import com.consultadd.training.repository.UserRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepsitory userRepsitory;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepsitory.findByUserName(userName);

        user.orElseThrow(() -> new UsernameNotFoundException("Not Found: "+ userName));

        return user.map(MyUserDetails::new).get();
    }
}
