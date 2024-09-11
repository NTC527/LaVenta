
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;


public class ClienteDao {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarCliente(Cliente c1){
        
    public List ListarCliente(){
            List<Cliente> ListaCl = new ArrayList();
            String sql = "SELECT * FROM clientes"; 
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        while (rs.next()) {
            Cliente cl = new Cliente();
            cl.setId(rs.getInt("id"));
            cl.setDni(rs.getInt("dni"));
            cl.setNombre(rs.getString("nombre"));
            cl.setTelefono(rs.getInt("telefono"));
            cl.setDireccion(rs.getString("direccion"));
            cl.setRazon(rs.getString("razon"));
            ListaCl.add(cl);
            }
        } catch (SQLException e) {
            System.out.println(e.toString()); 
        }
        return ListaCl;
    }
    
    public boolean EliminarCliente(int id){
        String sql = "DELETE FROM clientes WHERE id = ?";_
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
