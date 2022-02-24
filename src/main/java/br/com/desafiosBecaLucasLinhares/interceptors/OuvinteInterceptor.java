package br.com.desafiosBecaLucasLinhares.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OuvinteInterceptor implements HandlerInterceptor {

    private final Logger LOG = LoggerFactory.getLogger(OuvinteInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        return OuvinteValidation(request);
    }

    private boolean OuvinteValidation(HttpServletRequest request){

        if(request.getHeader("login").equals("04528968193")){
            LOG.info("estou no preHandle OuvinteInterceptor");
            return true;
        }else throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE);
    }
}
