package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarriageSeekar;
import com.nt.service.IMatrimonyServiceMgmt;

@Component
public class LOBsTestRunner implements CommandLineRunner {
	@Autowired
	private IMatrimonyServiceMgmt service;
	
	@Override
	public void run(String... args) throws Exception {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Person Name");
			String name = sc.next();	
			System.out.println("Enter Person Address");
			String address = sc.next();
			System.out.println("Enter Person Photo file Complete path::");
			String photoPath = sc.next();
			System.out.println("Enter Person biodata file complete path::");
			String biodataPath=sc.next();
			System.out.println("Is the Person Indian?");
			boolean indian=sc.nextBoolean();
			// prepare byte[] representing photo file content
			InputStream is= new FileInputStream(photoPath);
			byte[] photoData = new byte[is.available()];
			photoData = is.readAllBytes();
			// prepare for char[] representing biodataPath file content
			File file = new File(biodataPath);
			Reader reader=new FileReader(file);
			char bioDataContent[] = new char[(int) file.length()];
			reader.read(bioDataContent);
			
			// preapare entity class obj
			MarriageSeekar seekar=new MarriageSeekar(name, address, photoData, 
																									LocalDateTime.of(1994,8,10,15, 45),
																									bioDataContent, indian);
			System.out.println(service.registerMarriageSeekar(seekar));
	}

}
