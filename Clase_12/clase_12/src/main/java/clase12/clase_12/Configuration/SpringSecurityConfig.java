// package clase12.clase_12.Configuration;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Configuration;
// // import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
// import org.springframework.security.web.AuthenticationEntryPoint;

// @Configuration
// @EnableWebSecurity
// public class SpringSecurityConfig extends WebSecurityConfiguration {
    
//     @Autowired
//     private AuthenticationEntryPoint auth;
    
//     protected void configure(HttpSecurity http) throws Exception{
//         http.csrf().disable().
//             authorizeRequests().anyRequest().authenticated().
//             and().httpBasic().authenticationEntryPoint(auth);
//     }

    // @Autowired
    // public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    //     auth.inMemoryAuthentication().withUser(null).password(null).role(null);
    // }
// }
