
package Modelo;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class ClienteDao {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    
    public boolean RegistrarCliente(Cliente c1){
        
        public List ListarCliente(){
            List<Cliente> ListaC1= new ArrayList();
            String sql = "SELECT * FROM clientes";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Cliente c1 = new Cliente();
                ps.setInt(1, c1.getDni());
                ps.setString(2, c1.getNombre());
                ps.setInt(3, c1.getTelefono());
                ps.setString(4, c1.getDireccion());
                ps.setString(5, c1.getRazon());
                ps.execute();
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            }
        return ListaC1;
        }
}