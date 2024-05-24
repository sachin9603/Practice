package com.Anudip.Securitysec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig { 
	
	
	//ye jab bhi store hoga toh incrypt hokar hi store hoga  iski help se
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
		
	}
	
	
	@Bean 
	public UserDetailsService userdetailsService() {
		UserDetails  normalUser  =  User.withUsername("sachin").password(passwordEncoder().encode("parmar"))
				                    .roles("NORMAL")
				                    .build() ;
		
		UserDetails adminUser = User.withUsername("swati").password(passwordEncoder().encode("ppp")).roles("ADMIN")
				.build() ;
		
		
		InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager(normalUser, adminUser);
		
		return inMemoryUserDetailsManager ;
		
		
		
	}
	
	
	
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity  httpsecurity) throws Exception {
		httpsecurity.csrf().disable()
		.authorizeHttpRequests()
//		.requestMatchers("/home/admin")
//		.hasRole("ADMIN")
//		.requestMatchers("/home/normal")
//	    .hasRole("NORMAL")
		.requestMatchers("/home/public")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin() ;
		 return httpsecurity.build() ;
		 
		
		
	}
	

}
