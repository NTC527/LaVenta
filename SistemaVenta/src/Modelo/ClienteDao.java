
package Modelo;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;




public class ClienteDao {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    
    public boolean RegistrarCliente(Cliente c1){
        
        public List ListarCliente(){
            List<Cliente> ListaC1= client.ListarCliente();
            String sql = "SELECT * FROM clientes"; 
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        while (rs.next()){
            Cliente cl = new Cliente();
        cl.setId(rs.getInt("id"));
        cl.setDni(rs.getInt("dni"));
        cl.setNombre(rs.getString("nombre"));
        cl.setTelefono(rs.getInt("telefono"));
        cl.setDireccion(rs.getString("direccion"));
        cl.setRazon(rs.getString("razon"));
        ListarCl.add(cl)
        }
        } catch (SQLException e){
            System.out.println(e.toString()); 
        }
        return Listar Cl;
        }
}