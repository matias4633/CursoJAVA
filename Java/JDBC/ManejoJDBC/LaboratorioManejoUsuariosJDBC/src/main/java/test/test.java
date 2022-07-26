package test;

import datos.Manejador;
import java.util.Properties;

public class test {

    public static void main(String[] args) {
    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    private static final Properties info=new Properties();
    
    

    Manejador manager = new Manejador();

    manager.connect (JDBC_URL, JDBC_USER)
}
}
