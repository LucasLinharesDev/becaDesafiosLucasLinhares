package br.com.desafiosBecaLucasLinhares.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MusicaInterceptor implements HandlerInterceptor {

    private final Logger LOG = LoggerFactory.getLogger(MusicaInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        return GeneralValidation(request);
    }

    private boolean GeneralValidation(HttpServletRequest request){

        if(request.getHeader("nome").equals("musica1")){
            LOG.info("estou no preHandle GeneralInterceptor");
            return true;
        }else throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE);

    }
}
