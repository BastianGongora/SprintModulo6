package Modulo_6.modulo6.configuration;

import Modulo_6.modulo6.services.SecurityUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;

@Configuration
public class WebSecurityConfig {

    @Autowired
    SecurityUserDetailsService userDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests(authorize ->
                {
                    authorize.requestMatchers(antMatcher("/")).permitAll();
                    authorize.requestMatchers(antMatcher(HttpMethod.GET,"/contacto")).hasRole("CLIENTE");
                    authorize.requestMatchers(antMatcher(HttpMethod.GET,"/crear-capacitacion")).hasRole("CLIENTE");
                    authorize.requestMatchers(antMatcher(HttpMethod.GET,"/listado-capacitaciones")).hasRole("CLIENTE");
                    authorize.requestMatchers(antMatcher(HttpMethod.GET,"/datos-capacitacion")).hasRole("CLIENTE");
                    authorize.requestMatchers(antMatcher(HttpMethod.POST,"/anadir-capacitacion")).hasRole("CLIENTE");
                    authorize.requestMatchers(antMatcher(HttpMethod.POST,"/editarCapacitacion")).hasRole("CLIENTE");
                    authorize.requestMatchers(antMatcher(HttpMethod.GET,"/eliminar-capacitacion")).hasRole("CLIENTE");
                    authorize.requestMatchers(antMatcher(HttpMethod.POST,"/eliminarCapacitacion")).hasRole("CLIENTE");
                    authorize.requestMatchers(antMatcher(HttpMethod.GET,"/crear-usuario")).hasRole("ADMINISTRATIVO");

                    authorize.anyRequest().permitAll();
                })
                .csrf(AbstractHttpConfigurer::disable)
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    SecurityFilterChain authenticationManager(HttpSecurity http, PasswordEncoder passwordEncoder) throws Exception{
        http
                .getSharedObject(AuthenticationManagerBuilder.class)
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
        return http.build();
    }

}
