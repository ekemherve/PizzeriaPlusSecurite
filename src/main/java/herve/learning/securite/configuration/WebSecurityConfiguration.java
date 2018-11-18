package herve.learning.securite.configuration;

import herve.learning.securite.dataAccess.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    private static final String LOGIN_REQUEST = "/login";

    private static final String [] AUTHORIZED_REQUESTS_ANYBODY = {"/", "/login", "/home", "/signup"};

    private static final String [] AUTHORIZED_REQUESTS_ADMIN = {"/admin"};

    String[] staticResources = {
            "/css/**",
            "/images/**",
            "/fonts/**",
            "/scripts/**",
    };


    @Autowired
    private UserDAO userDAO;

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();

        http
            .authorizeRequests()
            .antMatchers(AUTHORIZED_REQUESTS_ANYBODY).permitAll()
            .antMatchers(AUTHORIZED_REQUESTS_ADMIN).hasRole("ADMIN")
            .antMatchers(staticResources).permitAll()
            .anyRequest().authenticated()
            .and()

            .formLogin()
            .successHandler(new SavedRequestAwareAuthenticationSuccessHandler())
            .loginPage(LOGIN_REQUEST)
            .permitAll()
            .and()

            .logout()
            .logoutSuccessUrl("/")
            .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(userDAO).passwordEncoder(new BCryptPasswordEncoder());
    }

}
