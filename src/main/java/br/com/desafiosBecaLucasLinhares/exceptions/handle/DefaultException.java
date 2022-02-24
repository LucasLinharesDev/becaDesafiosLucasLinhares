package br.com.desafiosBecaLucasLinhares.exceptions.handle;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DefaultException {

     private Integer status;
     private String menssagem;
     private LocalDateTime dataHora;

}
