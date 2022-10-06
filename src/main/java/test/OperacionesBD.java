package test;
import connection.DBConnection;
import beans.Patinetas;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    
    public static void main(String[] args) {
        actualizarPatinetas (1, "scooter ultra");
        listarPatinetas();
    }
    
    public static void actualizarPatinetas (int id_patineta, String tipo_patineta){
        DBConnection con = new DBConnection();
        String sql = "UPDATE patineta SET tipo_patienta= '"+ tipo_patineta + "'WHERE id_patineta= "+id_patineta;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
    }
    
    public static void listarPatinetas(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM patineta";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id_patineta = rs.getInt("id_patineta");
                String nombre_patineta = rs.getString("nombre_patineta");
                String tipo_patineta = rs.getString("tipo_patineta");
                double valor_dia = rs.getDouble ("valor_dia");
                        
             
                Patinetas patineta= new Patinetas (id_patineta, nombre_patineta, tipo_patineta, valor_dia);
                System.out.println(patineta.toString());
            }
            st.executeQuery(sql);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
    }
}
