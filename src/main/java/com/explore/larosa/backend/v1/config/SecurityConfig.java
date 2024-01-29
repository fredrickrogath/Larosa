package com.explore.larosa.backend.v1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // @Override
    // protected void configure(HttpSecurity http) throws Exception {
    //     http
    //         .authorizeRequests()
    //         .antMatchers("/v1/**").authenticated()
    //         .and()
    //         .addFilterBefore(customAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
    // }

    // @Bean
    // public PasswordEncoder passwordEncoder() {
    //     return new BCryptPasswordEncoder();
    // }

    // @Bean
    // public CustomAuthenticationFilter customAuthenticationFilter() throws Exception {
    //     CustomAuthenticationFilter filter = new CustomAuthenticationFilter(null);
    //     filter.setAuthenticationManager(authenticationManagerBean());
    //     return filter;
    // }

    // private AuthenticationManager authenticationManagerBean() {
    //     return null;
    // }

    @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(requests -> requests.requestMatchers("/v1/**").authenticated());
                return http.build();
        }

        @Bean
        public UserDetailsService userDetailsService() {
                // UserDetails user = User.withDefaultPasswordEncoder()
                //         .username("user")
                //         .password("password")
                //         .roles("USER")
                //         .build();
                // return new InMemoryUserDetailsManager(user);
                return null;
        }
}
