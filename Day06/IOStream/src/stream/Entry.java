package stream;

import java.io.File;
import java.io.IOException;

public class Entry {

	public static void main(String[] args) {

		File objFile = new File("C:\\JavaPrograms\\Test.txt");

		try {

			if (objFile.exists()) {

				System.out.println("This file is present.");
			} else {
				System.out.println("No such file.");
				objFile.createNewFile();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		objFile.delete();
	}

}