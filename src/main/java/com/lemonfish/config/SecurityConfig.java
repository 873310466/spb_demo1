/*
package com.lemonfish.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

*/
/**
 * @author Masics 张超
 * @date 2020/2/4 16:08*//*




@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //请求授权
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //首页所有人可以访问,但是功能页只能有权限的人访问
        http.authorizeRequests().antMatchers("/").permitAll();
//                .antMatchers("/main.html").hasRole("vip1");
//                .antMatchers("/level2/**").hasRole("vip2")
//                .antMatchers("/level3/**").hasRole("vip3");

        http.csrf().disable();
        //没有权限，会默认到到登陆界面
        //定制登陆界面
        http.formLogin().loginPage("/toLogin");
//        http.formLogin().defaultSuccessUrl("/toMain", true);
        //记住我，默认保存两周
        http.rememberMe().rememberMeParameter("remember");

//        http.logout().deleteCookies("remove").invalidateHttpSession(true);
        http.logout().logoutSuccessUrl("/");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/**");
    }

    //认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {


*/
/*        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("root").password(new BCryptPasswordEncoder().encode("123456"));*//*

          */
/*      .and()
                .withUser("root").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1", "vip2", "vip3")
                .and()
                .withUser("guest").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1");*//*





//        auth.userDetailsService();
    }
}
*/
