package consultoriodemascotas;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Operaciones {
    
    private static final String SQL_INSERT="insert into cliente(nombre, id, tlf, dir) values (?,?,?,?)";
    private static final String SQL_INSERT1="insert into mascota(nombre, raza, color) values (?,?,?)";
    private static final String SQL_INSERT2="insert into guarderia(fEnt, hEnt, fSal, hSal ) values (?,?,?,?)";
    private static final String SQL_INSERT3="insert into baño(completo, pelo, uñas) values (?,?,?)";
    private PreparedStatement  PS;   
    Conector cn;
    
    public Operaciones() {
        PS = null;
        cn = new Conector();
    }
    
    public int insert(String nom, int id, int tlf, String dir ){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_INSERT);          
            PS.setString(1, nom);
            PS.setInt(2, id);
            PS.setInt(3, tlf);
            PS.setString(4, dir);
            res = PS.executeUpdate();
        }catch(SQLException e){
            System.err.println("Error guardando"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión cerrada");
        }
       
        return res;
    }
    public int insertMas(String nom, String raza ,String color ){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_INSERT1);          
            PS.setString(1, nom);
            PS.setString(2, raza);
            PS.setString(3, color);
            res = PS.executeUpdate();
        }catch(SQLException e){
            System.err.println("Error guardando"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión cerrada");
        }
       
        return res;
    }
    public int insertGua(String fEnt, String hEnt ,String fSal, String hSal ){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_INSERT2);          
            PS.setString(1, fEnt);
            PS.setString(2, hEnt);
            PS.setString(3, fSal);
            PS.setString(4, hSal);
            res = PS.executeUpdate();
        }catch(SQLException e){
            System.err.println("Error guardando"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión cerrada");
        }
       
        return res;
    }
    public int insertBa(String completo, String pelo ,String uñas ){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_INSERT3);          
            PS.setString(1, completo);
            PS.setString(2, pelo);
            PS.setString(3, uñas);
            res = PS.executeUpdate();
        }catch(SQLException e){
            System.err.println("Error guardando"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión cerrada");
        }
       
        return res;
    }
}
