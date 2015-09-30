package ex1_array;

import java.io.File;
import java.io.FileNotFoundException;

public class TestArray {
	public  static void main(String args[]){
		
		Array.creatNewArray("number.txt");
		Array.printArray();
		System.out.println("After remove:");
		Array.removeIndex(3);
		Array.printArray();
		System.out.println("After insert:");
		Array.insertIndex(6, 2);
		Array.printArray();
	}
}
