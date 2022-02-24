package br.com.desafiosBecaLucasLinhares.interceptors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(final InterceptorRegistry registry) {

        registry.addInterceptor(new MusicaInterceptor()).addPathPatterns("/musica/criar");
        registry.addInterceptor(new OuvinteInterceptor()).addPathPatterns("/ouvinte/criar");
    }
}
