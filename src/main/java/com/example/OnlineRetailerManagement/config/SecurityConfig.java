package com.example.OnlineRetailerManagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.OnlineRetailerManagement.service.UserSecurityService;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	private static final String[] PUBLIC_MATCHERS = {
            "/webjars/**",
            "/static/css/**",
            "/static/js/**",
            "/static/Images/**",
            "/",
            "/about/**",
            "/contact/**",
            "/error/**/*",
            "/console/**",
            "/signup"
    };
	
    private static final String SALT = "salt"; // Salt should be protected carefully

    @Autowired
    private UserSecurityService userSecurityService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
    }

    
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*auth.inMemoryAuthentication().withUser("javainuse")
				.password("{noop}javainuse").roles("USER");
		
		auth.inMemoryAuthentication().withUser("admin")
		.password("{noop}admin").roles("ADMIN");*/
		
		auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
		
	}

	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	    	System.out.println("configure");
	        http
	                .authorizeRequests().
	                antMatchers(PUBLIC_MATCHERS).
	                permitAll().antMatchers("/manufacturer").hasRole("ADMIN").anyRequest().authenticated();

	        http
	                .csrf().disable().cors().disable()
	                .formLogin().failureUrl("/login?error").defaultSuccessUrl("/welcome").loginPage("/login").permitAll()
	                .and()
	                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout").deleteCookies("remember-me").permitAll()
	                ;
	    }

	}
