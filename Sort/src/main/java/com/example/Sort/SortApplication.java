package com.example.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SortApplication implements CommandLineRunner{
	@Autowired
	SortingDemo sd;
	public static void main(String[] args) {
		SpringApplication.run(SortApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		sd.add(10);
		sd.add(1);
		sd.add(7);
		sd.add(5);
		sd.BubbleSort();
		sd.QuickSort();
		System.out.println(sd.getL());
	}

}
