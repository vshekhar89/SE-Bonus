package com;

import Interface.ChangeCaseInterface;
import Interface.EncodingInjectorInterface;
import injector.DefaultEncodingInjector;
import utilitiy.EncodeFile;
import utilitiy.MakeLowerCase;
import utilitiy.MakeUpperCase;
import utilitiy.ReadFile;

public class ReaderApp {

	
	public static void ReaderApp(String filepath){
		//String filepath ="//Users//shardendu//test.txt";
		try{
			
			//Readfile uses composition
			ReadFile reader = new ReadFile(filepath);
			String file = reader.readFile();
			EncodingInjectorInterface injector = new DefaultEncodingInjector();
			EncodeFile encoder = injector.getEncoder();
			String encoded = encoder.encodeFile(file);
			ChangeCaseInterface chCase= new MakeUpperCase();
			String upCase;
			upCase = chCase.caseChange(file);
			
			System.out.println("!----------------------Displaying file contents-----------------------!");
			System.out.println(file);
			
			System.out.println("!-----------------Changing to Uppercase and Encrpting-----------------!");
			System.out.println(encoder.encodeFile(upCase));
			
			
			System.out.println("!-----------------Encrypting and changing to uppercase----------------!");
			System.out.println(chCase.caseChange(encoded));
			
			System.out.println("!-----------------------Encrypting and Displaying---------------------!");
			System.out.println(encoded);
			
			System.out.println("!-----------------Converting to uppercase and displaying--------------!");
			System.out.println(upCase);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
