//package com.onestop.onestop.config;
//
//import com.onestop.onestop.User;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.rest.webmvc.com.onestop.onestop.config.RepositoryRestConfigurer;
//
//@Configuration
//public class JpaConfig implements RepositoryRestConfigurer {
//
//    @Bean
//    public RepositoryRestConfigurer repositoryRestConfigurer() {
//        return RepositoryRestConfigurer.withConfig(com.onestop.onestop.config -> {
//            com.onestop.onestop.config.exposeIdsFor(User.class);
//        });
//    }
//}
