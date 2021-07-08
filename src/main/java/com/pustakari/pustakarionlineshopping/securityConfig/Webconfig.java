package com.pustakari.pustakarionlineshopping.securityConfig;


import com.pustakari.pustakarionlineshopping.filter.JwtFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@EnableWebSecurity
public class Webconfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private JwtFilter jwtFilter;



    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select au.username, au.password, u.active_status\n" +
                        "from user_info_table u\n" +
                        "inner join authentication_table au\n" +
                        "on  au.auth_id=u.authentication_auth_id\n" +
                        "where au.username=?")
                .authoritiesByUsernameQuery("select au.username, r.role_name\n" +
                        "from user_info_table u\n" +
                        "inner join authentication_table au\n" +
                        "on u.authentication_auth_id = au.auth_id\n" +
                        "inner join role_table r\n" +
                        "on r.role_id = u.role_role_id\n" +
                        "where au.username=?");

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

//        @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors().disable();
        http.csrf().disable();


        http = http.cors().and().csrf().disable();

        //set session management to stateless
        http = http.sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and();

        http.authorizeRequests(authorize -> authorize

                // .antMatchers("/roles/**").hasRole("ADMIN")

                .antMatchers("/users/register").permitAll()
                .antMatchers("/welcome/**").permitAll()
                .antMatchers("/").permitAll()
                .antMatchers("/authenticate").permitAll()

                .anyRequest().authenticated()
        )
                .formLogin();
        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

    }


}
/*http.authorizeRequests()

                .antMatchers(HttpMethod.DELETE).hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT).hasAnyRole("ADMIN","MANAGER")
                .antMatchers("role/addRoles","/users/list","/role/list").hasAnyRole("ADMIN","MANAGER")
                .antMatchers(HttpMethod.POST).permitAll()
                .antMatchers("/authenticate").permitAll()
                .anyRequest().authenticated();

*//*



        */
/*http= http.exceptionHandling()
                .authenticationEntryPoint((request,response,ex){
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED,ex.getMessage());
        })
        .and()*//*


*/
/*
//old ways
       http.authorizeRequests()
               .antMatchers("/users/**").hasAnyRole("ADMIN","MANAGER")
               .antMatchers(HttpMethod.PUT).hasAnyRole("ADMIN","MANAGER")
               .antMatchers(HttpMethod.DELETE).hasRole("ADMIN")
               .antMatchers("/role/**").hasRole("ADMIN")
               //.antMatchers(HttpMethod.POST).hasAnyRole("ADMIN","MANAGER")
               .antMatchers("/").permitAll()
               .antMatchers("/authenticate").permitAll()

              // .anyRequest().authenticated()
               .and()
               .formLogin().permitAll()
               .and()
               .sessionManagement()
               .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
*/





    // Use by Spring Security if CORS is enabled
//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source =
//                new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOrigin("*");
//        config.addAllowedHeader("*");
//        config.addAllowedMethod("*");
//        source.registerCorsConfiguration("/**", config);
//        return new CorsFilter(source);
//    }

//    @Bean
//    public AuthenticationSuccessHandler userauthenticationSuccessHandler(){
//
//            return new UserSimpleUrlAuthenticationSuccessHandler();
//    }






/*
we can make a list of Granted Authority by using collections.singletonList when we are using
UserDetailServiceImpl class to load the user with their username
-- this is the alternative methods if we do not want to user auth.jdbcAuthentication and wanted
-- to use auth.auth.userDetailsService()
private List<GrantedAuthority> getAuthority(String role) {
        return Collections.singletonList(new SimpleGrantedAuthority(role));
    }
 */
