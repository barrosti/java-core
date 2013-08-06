package br.com.javaCore.acessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {

			RandomAccessFile r = new RandomAccessFile(System.getProperty("user.dir") + "\\dataBase\\randomAcess.dat", "rw");

			r.writeBoolean(true); // 1 byte
			r.writeUTF("Barros"); // 8 bytes
			r.writeDouble(12.3);  // 8 bytes
			r.writeInt(5);        // 4 bytes

			r.seek(9);
			double d = r.readDouble();

			r.seek(1);
			String s = r.readUTF();

			r.seek(0);
			boolean b = r.readBoolean();
			
			r.seek(17);
			int i = r.readInt();
			

			System.out.println(b);
			System.out.println(s);
			System.out.println(d);
			System.out.println(i);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
