package app;

import java.util.Arrays;

import javax.annotation.PreDestroy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Runs the code inside the run method once the SpringApplication has started
 * @author DIevstratenko
 *
 */
@Component
public class RunComplete implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("==="+Arrays.toString(args));
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("---------------DESTROYING--------------------");
	}

}
