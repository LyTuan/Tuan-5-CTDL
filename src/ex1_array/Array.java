package ex1_array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array {
	 static final int MAX =100;
	private static int []array=new int [MAX];
	
	private  static int length=0;
	public static  void creatNewArray(String fileName) {
		Scanner scan ;
		try {
			File reader = new File(fileName);
			scan= new Scanner(reader);			
			int pos=0;
//			array= new int[length];
			while(scan.hasNext()){
				array[pos++]=scan.nextInt();
			}
			length=pos-1;
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void removeIndex(int index){
		boolean check =false;
		if(length==0){
			System.out.println("Cannot remove beacause Array do not have element");
		}
		for(int pos =0; pos<length;pos++){
			if(pos==index){
				array[pos]=array[length-pos];
				length-=1;
				check = true;
				break;
			}
		}
		if(check==false){
			System.out.println("Not have index in array");
		}
	}
	public static void insertIndex(int value, int index){
		int temp=0;
		if(index==length-1){
			array[index+1]=array[index];
			array[index]=value;
		}
		length=length+1;
		for(int pos=length;pos>=index; pos--){	
			array[pos]=array[pos--];
			array[index]=value;
		}
	}
	public static int findIndex(int value){
		int pos1 =0;
		boolean check=false;
		for( int pos = 0; pos<length; pos++){
			if(array[pos]==value){
				pos1=pos;
				check =true;
				break;
			}
		}
		if(check==true){
			return pos1;	
		}else{
			return -1;
		}
		
	}
	public static void printArray(){
		for(int pos =0 ;pos<length;pos++){
			System.out.println(array[pos]);
		}
	}
	
}
