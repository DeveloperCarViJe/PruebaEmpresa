package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Conexion.ConexionDB;
import model.Empleados;

public class EmpleadosDao {


	PreparedStatement ps;
	ResultSet rs;
	ConexionDB c=new ConexionDB();
	Connection con;
	
	public void Registrar_Empleado(Empleados empleados) {
	    String sql = "INSERT INTO empleados (cedula, nombre, fecha_nacimiento, sueldo, estado) VALUES (?, ?, ?, ?)";
	    try {
	        con = c.getConnection();
	        ps = con.prepareStatement(sql);
	        ps.setInt(1, empleados.getCedula());
	        ps.setString(2, empleados.getNombre());
	        ps.setDate(3, (Date) empleados.getFecha_nacimiento());
	        ps.setInt(4, empleados.getSueldo());
	        ps.setString(4, empleados.getEstado());
	        ps.executeUpdate();
	        System.out.println("Empleado insertado correctamente.");
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (ps != null) ps.close();
	            if (con != null) con.close();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	}
}
