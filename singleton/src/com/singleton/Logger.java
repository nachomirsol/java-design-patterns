package com.singleton;

public class Logger {
    private static Logger logger;
    private Logger(){

    }
    /*
    * Sólo puede haber un static por clase, con static no necesitamos crear un objeto de una clase para llamar a su método.
    * Sólo puede llamar a métodos o constantes estáticos
    * */
    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
            return logger;
    }
}
