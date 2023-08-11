package comm.xworkz.development.runner;

import com.xworkz.development.app.ArmyRepository;
import com.xworkz.development.implientation.ArmyRepositoryImpl;

public class ArmyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArmyRepository repository=new ArmyRepositoryImpl();
repository.save("10th Mountain Division");
repository.save("20 Lancers");
repository.save("United States Army Central");
repository.save("1st Infantry Division");
repository.save("11th Gorkha Rifiles");
repository.display();
	}

}
