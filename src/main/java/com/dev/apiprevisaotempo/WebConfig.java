package com.dev.apiprevisaotempo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:63342") // Permitir requisições do seu front-end
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permitir os métodos HTTP
                .allowCredentials(true); // Permitir o envio de credenciais (por exemplo, cookies)
    }
}
