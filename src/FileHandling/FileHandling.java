package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileHandling {
//	File myObj = new File("C:\\Users\\MyName\\filename.txt");
	static File newFile = new File("Filename.txt");//location will be the package location by default
	public static void main(String[] args) throws IOException {
//		Create a File
		try {		
			if (newFile.createNewFile()) { //Atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
				System.out.println("File is created");
			}
			else {
				System.out.println("File is already created");
			}
		} catch (IOException e) {
			System.out.println("An error occured");
			e.fillInStackTrace();
		}
		
		writeFile();
		readFile();
		deleteFile();
	}
	
		private static void writeFile() throws IOException {
			try (FileWriter myWriter = new FileWriter(newFile)) {
				myWriter.write("Files in Java might be tricky, but it is fun enough!");
				myWriter.close();//note that when you are done writing to the file, you should close it with the close() method:
			}
			
			catch (IOException e) {
				System.out.println("An error occured");
				e.fillInStackTrace();
			}

		}
		
		private static void readFile() throws NoSuchElementException, IllegalStateException{
			try {
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(newFile);
				if(newFile.exists()) {
					System.out.println("File name " + newFile.getName());
					System.out.println("Absolute Path " + newFile.getAbsolutePath());
					System.out.println("Writable " + newFile.canWrite());
					System.out.println("Readable " + newFile.canRead());
					System.out.println("File Size " + newFile.getTotalSpace());
				}
				while (sc.hasNextLine()) {
					String data =sc.nextLine();
					System.out.println(data);
				}
				sc.close();
			} catch (Exception e) {
				System.out.println("An error occured");
				e.fillInStackTrace();
			}
		}
		
		private static void deleteFile() throws SecurityException{
			try {
				if (newFile.delete()) {
					System.out.println("File is deleted " + newFile.getName());
				}
			} catch (Exception e) {
				System.out.println("Unable to delete the file");
				e.fillInStackTrace();
			}
		}
}
