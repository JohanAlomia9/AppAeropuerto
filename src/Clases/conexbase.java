/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class conexbase {
    public static void conectarabase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection con;
    
    String url="jdbc:sqlserver://192.168.200.4:1433;databaseName=Aeropuerto2022 [sa on db_accessadmin]";
            
    public Connection conectarBase()
    {
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        con = DriverManager.getConnection(url);
        
        JOptionPane.showMessageDialog(null, "Conexion exitosa");    
            }
                catch(Exception e)
                {
                   JOptionPane.showMessageDialog(null, "Conexion fallida"); 
                }
        return con;
        }   
    public int ValidarUsuario(String usuario, String contra)
 {
      String dato; 
     con=conectarBase();
     try{
     String consulta="select reg_usu, reg_contra from tbl_registro where reg_usu='"+usuario+"' and reg_contra='"+contra+"'";
     
     Statement st = con.createStatement();
     ResultSet rs = st.executeQuery(consulta);
     
    // dato = String.valueOf(rs.next());
     if(rs.next())
     {
         return 1;
     }
     else
     {
         return 0;
     }
    
     }catch(Exception e)
     {
         
     }
     return 0;
 }    
    public void RegistroUsuario(String usu,String contra,String cedu,String correo,String nombre)
 {
     con=conectarBase();
     String consulta="Insert into tbl_registro(reg_nombre,reg_cedula,reg_correo,reg_usu,reg_contra)values('"+nombre+"','"+usu+"','"+contra+"','"+correo+"','"+cedu+"')";
     
     try {
         PreparedStatement ps;
         ps = con.prepareCall(consulta);
         
         ps.executeUpdate();
         
         JOptionPane.showMessageDialog(null, "Usuario creado");
         
     }catch (Exception e){
         JOptionPane.showMessageDialog(null, "No se pudo crear el usuario");
     }
     
     
 }
}
