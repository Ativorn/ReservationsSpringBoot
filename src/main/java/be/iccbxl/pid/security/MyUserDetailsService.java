package be.iccbxl.pid.security;

import be.iccbxl.pid.model.User;
import be.iccbxl.pid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collection;


@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;



    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return new MyUserDetails(userService.getUserByLogin(userName));
    }


    /**
     * Return the connected user, a null if no user connected.
     * @return
     */
    public User getConnectedUser() {
        //get the current user
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getPrincipal() instanceof MyUserDetails) {
            return ((MyUserDetails) authentication.getPrincipal()).getConnectedUser();
        } else {
            return null;
        }
    }

    class MyUserDetails implements UserDetails{

        private final User user ;

        MyUserDetails(User user) {
            this.user = user;
        }


        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            String[] roles = userService.getRolesOf(user);
            return AuthorityUtils.createAuthorityList(roles);
        }



        @Override
        public String getPassword() {
            return user.getPassword();
        }

        @Override
        public String getUsername() {
            return user.getLogin();
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return user.isActive();
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }

        public User getConnectedUser() {
            return user;
        }


    }
}
