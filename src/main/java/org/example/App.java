package org.example;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class App 
{
    private static final  Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Mensagem de log.");

        logger.debug("Mensagem de debug");

        try{
            throw new RuntimeException("Erro Simulado.");
        } catch (Exception e){
            logger.error("Erro encontrado");
        }
    }
}
