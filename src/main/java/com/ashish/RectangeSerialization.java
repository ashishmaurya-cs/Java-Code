package com.ashish;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class RectangeSerialization implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;

	public RectangeSerialization(int width, int height) {
		super();
		this.height = height;
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public static void serializeObjectToJson(Object obj, String filename) {

		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream(filename);

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(obj);

			objectOutputStream.close();
			fileOutputStream.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static Object deSerializeObjectToJson(String filename) {

		
		try {
			FileInputStream  inputStream  = new FileInputStream(filename);

			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			Object object=objectInputStream.readObject();

			objectInputStream.close();
			inputStream.close();
			return object;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		RectangeSerialization rec = new RectangeSerialization(2, 5);
		serializeObjectToJson(rec, "src/main/resources/searialize.txt");
		
		RectangeSerialization desRectangeSerialization = (RectangeSerialization) deSerializeObjectToJson("src/main/resources/searialize.txt");
		System.out.println(desRectangeSerialization.getWidth()+": "+desRectangeSerialization.getHeight());
	}
}
