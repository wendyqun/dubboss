package cn.injava.dubboss.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartServer {
	private final static Logger logger = LoggerFactory.getLogger(StartServer.class);

	public static void main(String[] args) throws Exception {
		SpringApplication application=new SpringApplication(StartServer.class);

		application.run(args);
	}
}
