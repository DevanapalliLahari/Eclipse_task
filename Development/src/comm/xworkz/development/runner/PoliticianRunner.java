package comm.xworkz.development.runner;

import com.xworkz.development.app.PoliticianRepository;
import com.xworkz.development.implientation.PoliticianRepositoryImpl;

public class PoliticianRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PoliticianRepository repository=new PoliticianRepositoryImpl();
repository.save("Jagan Mohan Reddy");
repository.save("Chandra Babu Naidu");
repository.save("Pavan Kalyan");
repository.save("Lokesh");
repository.save("Ambati Rambabu");
repository.display();
	}

}
