import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.client.web.OAuth2LoginAuthenticationFilter;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Enable OAuth2 Login
            .oauth2Login()
                .loginPage("/login")
                .defaultSuccessUrl("/home", true)
            .and()
            // Secure endpoints
            .authorizeRequests()
                .antMatchers("/", "/login").permitAll()
                .anyRequest().authenticated()
            .and()
            // Enable OAuth2 resource server (for JWT tokens, for example)
            .oauth2ResourceServer()
                .jwt();
        return http.build();
    }
}

