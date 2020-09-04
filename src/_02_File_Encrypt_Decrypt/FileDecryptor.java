package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	/*
	 * Decryption is the process of taking encoded or encrypted text or other data
	 * and converting it back into text that you or the computer can read and understand.
	 *
	 * The shift cipher is decrypted by using using the key and shifting back up,
	 * at the end of our encryption example we had our alphabet as:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 *
	 * If we shift it back up by 4 based on the key we used the alphabet is decrypted:
	 *
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 *
	 * "Lipps Asvph" returns to "Hello World"
	 * 
	 * Create a program that opens the file created by FileEncryptor and decrypts
	 * the message, then display it to the user in a JOptionPane.
	 */
	public static void main(String[] args) {
		String newFileContent="";
	try {
		BufferedReader br=new BufferedReader(new FileReader("File Encryptor"));
		String FileContent="";
		String line=br.readLine();
		while(line!=null) {
			FileContent+=line;
			line=br.readLine();
		}
		for (int i = 0; i < FileContent.length(); i++) {
			int keys=FileEncryptor.key;
			char character=FileContent.charAt(i);
			
			if(Character.isAlphabetic(character)) {
				char result=character;
				if(result<'a'+keys) {
					result+=(26 - keys);
				}else {
					result=(char)(character-keys);
				}
				newFileContent+=result;
			}else {
				newFileContent+=character;
			}
			
		}
		JOptionPane.showMessageDialog(null, newFileContent);
	}catch(FileNotFoundException el){
		el.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	
}

}
//Copyright © 2019 Sarika Patil