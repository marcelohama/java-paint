package javapaint;

import java.sql.*;

public class Persistencia {
    
    private String linha;
    private Connection connect;
    private ResultSet tabela;
    
    public Persistencia() {

    }
    
    public Connection novaConexaoJDBC() {
        try {
            String url = "jdbc:odbc:database";
            Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
            connect = DriverManager.getConnection( url );
        }
        catch ( ClassNotFoundException cnfex ) {
            System.err.println("Falha ao ler o driver JDBC/ODBC");
        }
        catch ( SQLException sqlex ) {
            System.out.println("Impossível conectar");
        }
        catch ( Exception ex ) {
            System.out.println("Outro erro");
        }
        return connect;
    }
    
    public ResultSet select(String sqlcommand) {
        Statement statement;
        ResultSet rs = null;
        try {
            statement = connect.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
            );
            String query = sqlcommand;
            rs = statement.executeQuery( query );
        }
        catch ( SQLException sqlex ) {
        }
        return rs;
    }
    
    public void obterDesenho() {
        
    }
    
}
