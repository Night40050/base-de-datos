package consultoriodemascotas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    private static final String DRIVER="com.mysql.cj.jdbc.Driver";
    private static final String USER="root";
    private static final String PAS="D4n13l1302";
    private static final String URL="jdbc:mysql://localhost:3306/ejer1?autoReconnect=true&useSSL=false";
    private static Connection  conn;
   
    public Conector() {
        conn= null;
        try{
            Class.forName(DRIVER);
            conn=DriverManager.getConnection(URL,USER, PAS);
            if(conn!= null){
                System.out.println("Conectado");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("error al conectar " + e);
        }
    }
    
    public Connection getConexion(){
        return conn;
    }
    
    public void close(){
        conn = null;
        if(conn == null){
            System.out.println("Conexión cerrada");
        }
    }
}
