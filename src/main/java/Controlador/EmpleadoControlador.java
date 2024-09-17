package Controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmpleadosDao;
import model.Empleados;

/**
 * Servlet implementation class EmpleadoControlador
 */
@WebServlet("/EmpleadoControlador")
public class EmpleadoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmpleadosDao dao = new EmpleadosDao();
    /**
     * Default constructor. 
     */
    public EmpleadoControlador() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Integer cedula = Integer.parseInt(request.getParameter("cedula"));
		String nombre = request.getParameter("nombre");

		Date fechaNacimiento = null;
        String fechaNacimientoString = request.getParameter("fecha_nacimiento");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
			fechaNacimiento = dateFormat.parse(fechaNacimientoString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Integer sueldo = Integer.parseInt(request.getParameter("sueldo"));

        Empleados empleado = new Empleados(cedula,nombre,fechaNacimiento,sueldo,null);
        dao.Registrar_Empleado(empleado);
        response.sendRedirect("index.jsp");
	}

}
