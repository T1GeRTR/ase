package ru.aseng.ase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.aseng.ase.exception.ServerException;
import ru.aseng.ase.service.WorkerService;

@SpringBootApplication
public class AseApplication {

	public static void main(String[] args) throws ServerException {
		SpringApplication.run(AseApplication.class, args);
		WorkerService service = new WorkerService();
		service.update();
	}

}
