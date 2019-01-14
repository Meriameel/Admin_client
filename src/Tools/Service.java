package Tools;

import com.meriame.soapservice.Admin;
import com.meriame.soapservice.AdminServiceImplService;


public class Service {

	
	private Admin admin; 
	
	public void init() {
		
		try {
			
			admin = new AdminServiceImplService().getAdminServiceImplPort();
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
	
	public Admin getAdmindb() {
		
		return admin; 
	}
}
