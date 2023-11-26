package file_handling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingMain {

	public static void main(String[] args) {
		String courseInfo = String.valueOf(args[0]);
		String destinationFile = String.valueOf(args[1]);
		
		try(FileOutputStream fout = new FileOutputStream(courseInfo);
				BufferedOutputStream bout = new BufferedOutputStream(fout);){
			String s ="Hello World";
			byte[] b = s.getBytes();			
			bout.write(b);			
			System.out.println("Success");	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		Read course_info and write it in destination_file		
		try(		
			FileInputStream fin = new FileInputStream(courseInfo);
			BufferedInputStream bin = new BufferedInputStream(fin);
				
			FileOutputStream dFout = new FileOutputStream(destinationFile);
			BufferedOutputStream dBout = new BufferedOutputStream(dFout)
						) {			
			StringBuilder builder = new StringBuilder();
			while(true) {
				int data = bin.read();			
				if(data == -1) 
					break;
				char ch = (char)data;
				builder.append(ch);	
			}	
			String str = builder.toString();
			byte[] b = str.getBytes();
			dBout.write(b);
			System.out.print("File copied Successfully");	
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}	
	}
}
