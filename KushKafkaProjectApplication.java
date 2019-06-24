package com.kush.kafka.kushKafkaProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.kush.kafka.kushKafkaProject.Sender;

@SpringBootApplication
public class KushKafkaProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(KushKafkaProjectApplication.class, args);
	}
	
	 	@Autowired
	    private Sender sender;

	    @Override
	    public void run(String... strings) throws Exception {
	    	for(int i=1; i < 5; i++)
	        sender.send("Hi Kush, its hello" +  i);
	    }

}
