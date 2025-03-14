package stream;

import java.io.File;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Entry2 {

	public static void main(String[] args) {

		System.out.print("Enter the file name to create: ");

		String fileName = "C:\\JavaPrograms\\Test.txt";

		FileInputStream fis = null;
		DataInputStream dis = null;

		try {

			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);

			String name = dis.readUTF();
			int age = dis.readInt();
			float fees = dis.readFloat();
			boolean gender = dis.readBoolean();

			System.out.println(name);
			System.out.println(age);
			System.out.println(fees);
			System.out.println(gender);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (dis != null)
					dis.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void writeDOS(String fileName) {
		DataOutputStream dos = null;
		FileOutputStream fos = null;
		try
			{
			fos = new FileOutputStream(fileName);
			
			dos = new DataOutputStream(fos);
			
			fos.write(int)(99.99f);
			
			dos.writeUTF("Mahesh Joshi");
			dos.writeInt(22);
			dos.writeFloat(29998.99f);
			dos.writeBoolean(true);
			
			System.out.println("Data written");
			}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
			catch (IOException e)
		{	e.printStackTrace();
		}
	finally
	{
		try
		{
			if(dos!=null)
				dos.close();
			if(fos!=null)
				fos.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	}
		private static void readFile(String fileName)
		{
			FileInputStream fileInputStream = null;
			
			try
			{
				File objFile = new File(fileName);
				
				fileInputStream = new
						
						FileInputStream(objFile);
					int size = (int)objFile.length();
					
					byte [] readData = new byte[size];
					System.out.println(size);
					fileInputStream.read(readData);
					
					String data = new String(readData);
					System.out.println(data);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e)  {
				e.printStackTrace();
			}
		finally
		{
			try
			{
				if(fileInputStream!=null)
					fileInputStream.close();
			} catch (IOException e)  {
				e.printStackTrace();
			}
		}
		}
		
		private static void writeTOFile(String fileName)
		{
			System.out.println("Enter the Data to store in file");
			String data = ConsoleInput.getString();
			FileOutputStream fileOutputStream = null;
			
			try {
				fileOutputStream = new
						FileOutput
			}
			}
	}
}