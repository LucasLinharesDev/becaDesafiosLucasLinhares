//package br.com.desafiosBecaLucasLinhares.exceptions.handle;
//
//import org.springframework.dao.DataIntegrityViolationException;
//import org.springframework.dao.EmptyResultDataAccessException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.converter.HttpMessageNotReadableException;
//import org.springframework.transaction.TransactionSystemException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.time.LocalDateTime;
//import java.util.NoSuchElementException;
//
//@ControllerAdvice
//public class ExceptionHandle {
//
//    @ExceptionHandler(TransactionSystemException.class)
//    public ResponseEntity<DefaultException> handle(TransactionSystemException e){
//
//        DefaultException defaultException1 = new DefaultException();
//
//        defaultException1.setMenssagem(e.getLocalizedMessage());
//        defaultException1.setDataHora(LocalDateTime.now());
//        defaultException1.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
//
//        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(defaultException1);
//
//    }
//
//    @ExceptionHandler(HttpMessageNotReadableException.class)
//    public ResponseEntity<DefaultException> handle(HttpMessageNotReadableException e){
//
//        DefaultException defaultException1 = new DefaultException();
//
//        defaultException1.setMenssagem(e.getLocalizedMessage());
//        defaultException1.setDataHora(LocalDateTime.now());
//        defaultException1.setStatus(HttpStatus.UNPROCESSABLE_ENTITY.value());
//
//        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(defaultException1);
//
//    }
//
//    @ExceptionHandler(NoSuchElementException.class)
//    public ResponseEntity<DefaultException> handle(NoSuchElementException e){
//
//        DefaultException defaultException1 = new DefaultException();
//
//        defaultException1.setMenssagem(e.getLocalizedMessage());
//        defaultException1.setDataHora(LocalDateTime.now());
//        defaultException1.setStatus(HttpStatus.NOT_FOUND.value());
//
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(defaultException1);
//
//    }
//
//    @ExceptionHandler(ResponseStatusException.class)
//    public ResponseEntity<DefaultException> handle(ResponseStatusException e){
//
//        DefaultException defaultException1 = new DefaultException();
//
//        defaultException1.setMenssagem(e.getLocalizedMessage());
//        defaultException1.setDataHora(LocalDateTime.now());
//        defaultException1.setStatus(HttpStatus.NOT_FOUND.value());
//
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(defaultException1);
//
//    }
//
//    @ExceptionHandler(DataIntegrityViolationException.class)
//    public ResponseEntity<DefaultException> handle(DataIntegrityViolationException e){
//
//        DefaultException defaultException1 = new DefaultException();
//
//        defaultException1.setMenssagem(e.getLocalizedMessage());
//        defaultException1.setDataHora(LocalDateTime.now());
//        defaultException1.setStatus(HttpStatus.NOT_FOUND.value());
//
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(defaultException1);
//
//    }
//
//    @ExceptionHandler(EmptyResultDataAccessException.class)
//    public ResponseEntity<DefaultException> handle(EmptyResultDataAccessException e){
//
//        DefaultException defaultException1 = new DefaultException();
//
//        defaultException1.setMenssagem(e.getLocalizedMessage());
//        defaultException1.setDataHora(LocalDateTime.now());
//        defaultException1.setStatus(HttpStatus.NOT_FOUND.value());
//
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(defaultException1);
//
//    }
//
//}
