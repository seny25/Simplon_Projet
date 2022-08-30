package stcManager.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class ApplicationConfig extends WebSecurityConfigurerAdapter{
	
	private final PasswordEncoder passewordencoder;
	
	
public ApplicationConfig(PasswordEncoder passewordencoder) {
	super();
	this.passewordencoder = passewordencoder;
}


	protected void configure(HttpSecurity http) throws Exception { 
      http
      .csrf().disable()
     .authorizeRequests()
     .antMatchers("/", "index", "/css/", "/js/").permitAll() 
            .antMatchers("/stcResponsable/**").hasRole(ApplicationUserRole.ADMIN.name()).anyRequest().authenticated().and()
             .httpBasic();
  }
	
	
	@Bean
   protected UserDetailsService UserDetailsService() {

        UserDetails Admin = User.builder().username("admin").password(passewordencoder.encode("admin123"))
                .roles(ApplicationUserRole.ADMIN.name())
               .build();

       UserDetails JUSTVISITOR = User.builder().username("visiteur").password(passewordencoder.encode("visiteur123"))
                .roles(ApplicationUserRole.VISITOR.name())
                .build();
       
       UserDetails Responsable=User.builder().username("responsable").password(passewordencoder.encode("responsable123"))
    		   .roles(ApplicationUserRole.RESPONSABLE.name())
    		   .build();
       
       UserDetails Participent=User.builder().username("participent").password(passewordencoder.encode("participent123"))
    		   .roles(ApplicationUserRole.PARTICPENT.name())
    		   .build();
       
       
       
       
       
       
        return new InMemoryUserDetailsManager(Admin, JUSTVISITOR,Responsable,Participent);
        
    }
		
	
}
