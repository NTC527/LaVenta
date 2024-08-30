
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
            modelo = (DefaultTableModel) TableCliente.getModel();
            Object[] ob = new Object[6];  
        for(int i = 0; i < ListarC1.size(); i++){
            ob[0] = ListarCl.get(i).getId();
            ob[1] = ListarCl.get(i).getDni();
            ob[2] = ListarCl.get(i).getNombre();
            ob[3] = ListarCl.get(i).getTelefono();
            ob[4] = ListarCl.get(i).getDireccion();
            ob[5] = ListarCl.get(i).getRazon();
            modelo.addRow(ob);
        }
        TableCliente.setModel(modelo);
        }
}