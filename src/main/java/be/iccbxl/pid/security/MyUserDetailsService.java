package be.iccbxl.pid.security;

import be.iccbxl.pid.model.RoleUser;
import be.iccbxl.pid.model.User;
import be.iccbxl.pid.repository.RoleUserRepository;
import be.iccbxl.pid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Objects;


@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleUserRepository roleUserRepository ;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return new MyUserDetails(userService.getUserByLogin(userName));
    }


    class MyUserDetails implements UserDetails{

        private final User user ;

        MyUserDetails(User user) {
            this.user = user;
        }


        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            List<RoleUser> all = roleUserRepository.findByUser(user);
            String[] roles  = {} ;
            if (all!= null && !all.isEmpty()){
                roles =  all.stream()
                        .map(roleUser -> roleUser.getRole())
                        .filter(role ->! Objects.isNull(role))
                        .map(role -> role.getRole())
                        .toArray(String[]::new);
            }
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
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }
}
