package mx.algoritmia.CapituloTres;
import java.io.FileInputStream;
import java.util.Properties;


public class Aplicacion {
	
	public  Usuario login(String usrname, String password) {
		try {
			
			FileInputStream fis = new  FileInputStream("usuario.properties");
			Properties p = new Properties();
			p.load(fis);
			
			String usr = p.getProperty("usrname");
			String pwd = p.getProperty("password");
			
			Usuario u = null;
			
			if(usr.equals(usrname)&& pwd.equals(password)) {
				
				u =  new Usuario();
				u.setUsrname(usr);
				u.setPassword(pwd);
				u.setNombre(p.getProperty("nombre"));
				u.setEmail(p.getProperty("email"));
				
			}
			
			return u;
		}catch(Exception ex) {
			
			throw new RuntimeException ("Error verificando datos",ex);
		}
	}

}
