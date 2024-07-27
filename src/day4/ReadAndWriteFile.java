package day4;

import java.io.*;

public class ReadAndWriteFile {
	public static void main(String[] args) {
		File file=new File("RWFile.txt");
		
		try(FileWriter fileWrite=new FileWriter(file, true)) {
			if(file.createNewFile()) {
				System.out.println(file.getName()+" created Successfully");
			}else {
				System.out.println(file.getName()+" already exist");
			}
			String data="Hello World!!!";
			
			fileWrite.write(data);
			fileWrite.append("\n New world hii!!");
			fileWrite.close();
			
			System.out.println("Data Written Sucessfully");
			
		} catch (Exception e) {
			System.out.println("Exception occured"+e.getMessage());
		}
	}
}
