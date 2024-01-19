package com.prowings.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.prowings.model.Student;


public class FileIOUtil {
	private static final String FILE_PATH = "students.ser";
	
	
	public static void serializeData(Map<Integer, Student> record) {
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
			
			os.writeObject(record);
		}
		catch(IOException e) {
			
		}
	
	}
}
