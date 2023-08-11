package comm.xworkz.development.runner;

import com.xworkz.development.app.OlympicRepository;
import com.xworkz.development.implientation.OlympicRepositoryImpl;

public class OlympicRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running main");
		OlympicRepository repository = new OlympicRepositoryImpl();
		repository.save(2022);
		repository.save(2019);
		repository.save(2016);
		repository.save(2007);
		repository.save(2009);
		repository.display();
	}

}
