package com.dnapass.training.java.Day8;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIOFilesDemo {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output-bytes.txt");
			int c;
			while ((c= in.read()) != -1) {
				out.write(c);
			}
			FileReader inputStream = new FileReader("input.txt");
			FileWriter outputStream = new FileWriter("output-chars.txt");
			
			BufferedInputStream inputStrem;
			while ((c = inputStrem.read()) != -1) {
				outputStream.write(c);
			}
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStrem, "input.txt"));
		}
	}

}
