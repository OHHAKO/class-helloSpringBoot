package kr.ac.hansung.cse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration 
@EnableWebSecurity	//웹서큐리티 enabled 하겠다.
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        		.anyRequest()
        		.permitAll()
        		.and()
            .csrf().disable();
        //어떤리퀘든 , 다허용,그리고,csrf기능을 사용안하겠다 
    }
}