package comm.xworkz.development.runner;

import com.xworkz.development.app.ApartmentRepository;
import com.xworkz.development.implientation.ApartmentRepositoryImpl;

public class ApartmentRunner {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running main");
		ApartmentRepository repository = new ApartmentRepositoryImpl();
		repository.save("Alakananda");
		repository.save("sunshine");
		repository.save("possionate");
		repository.save("Elite");
		repository.save("Popular");
		repository.display();
		
	}

}
