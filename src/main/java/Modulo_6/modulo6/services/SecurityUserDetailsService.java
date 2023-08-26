package Modulo_6.modulo6.services;


import Modulo_6.modulo6.repository.IUserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class SecurityUserDetailsService implements UserDetailsService {

    private final IUserRepository userRepository;

    public SecurityUserDetailsService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        var optUser = userRepository.findByUsername(username);
        if(optUser.isPresent()){
            Collection<? extends GrantedAuthority> authorities = optUser.get().getAuthorities()
                    .stream()
                    .map(role -> new SimpleGrantedAuthority("ROLE_".concat(role.getName().toString())))
                    .collect(Collectors.toSet());

            return new User(optUser.get().getUsername(),
                    optUser.get().getPassword(),
                    true,
                    true,
                    true,
                    true,
                    authorities);
        }
        throw new UsernameNotFoundException("User not found"+username);
    }
}
