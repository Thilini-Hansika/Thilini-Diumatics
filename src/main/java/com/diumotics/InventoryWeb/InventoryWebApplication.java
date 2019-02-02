package com.diumotics.InventoryWeb;

import com.diumotics.InventoryWeb.config.ViewScope;
import com.google.common.collect.ImmutableMap;
import javax.faces.webapp.FacesServlet;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
public class InventoryWebApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(InventoryWebApplication.class, args);
	}
        
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(InventoryWebApplication.class);
        }
//
//        @Bean
//        public ServletRegistrationBean servletRegistrationBean() {
//            FacesServlet servlet = new FacesServlet();
//            ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(servlet, "*.xhtml");
//            return servletRegistrationBean;
//        }
//    
//        @Bean
//        public static CustomScopeConfigurer viewScope() {
//            CustomScopeConfigurer configurer = new CustomScopeConfigurer();
//            configurer.setScopes(new ImmutableMap.Builder<String, Object>().put("view", new ViewScope()).build());
//            return configurer;
//        }

}

