package comm.xworkz.development.runner;

import com.xworkz.development.app.HospitalRepository;
import com.xworkz.development.implientation.HospitalRepositoryImpl;

public class HospitalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Running main");
HospitalRepository repository=new HospitalRepositoryImpl();
repository.save("Usmaniya");
repository.save("Yasoda");
repository.save("Apoloo");
repository.save("St.Johns");
repository.save("Rainbow");
repository.display();
	}

}
