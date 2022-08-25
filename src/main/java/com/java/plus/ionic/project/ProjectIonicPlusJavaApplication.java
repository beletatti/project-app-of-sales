package com.java.plus.ionic.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.plus.ionic.project.service.S3Service;

@SpringBootApplication
public class ProjectIonicPlusJavaApplication implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;

	
	public static void main(String[] args) {
		SpringApplication.run(ProjectIonicPlusJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		s3Service.uploadFile("C:\\Users\\PC\\OneDrive\\Imagens\\Capturas de tela\\mc.jpg");
	}	
}