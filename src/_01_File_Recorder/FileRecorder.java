package _01_File_Recorder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
		String message=JOptionPane.showInputDialog("Type something in");{
	try {
		FileWriter FileRecord=new FileWriter(message);
		
	FileRecord.write(message);
	FileRecord.close();
	}catch(IOException e){
		e.printStackTrace();
	}}}   
	}
	

