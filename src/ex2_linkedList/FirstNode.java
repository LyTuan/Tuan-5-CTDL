package ex2_linkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstNode {
	private Node firstNode=null;
	public FirstNode(){
		firstNode = null;
	}
	public void newList(String nameFile){
		Scanner scan;
		File reader = new File(nameFile);
		try {
			scan = new Scanner(reader);
			while(scan.hasNextInt()){
				Node temp = new Node(scan.nextInt());
				temp.setNext(firstNode);
				firstNode=temp;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void printList(){
		Node temp =firstNode;
		while(temp.getNext()!=null){
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	public void addFirst(int v){
		Node temp = new Node(v);
		temp.setNext(firstNode);
		firstNode =temp;
	}
	public void addLast(int v){
		Node temp = new Node(v);
		Node travel =firstNode;
		while(travel.getNext()!=null){
			travel=travel.getNext();
		}
		if(travel.getNext()==null){
			temp.setNext(null);
			travel.setNext(temp);
		}
	}
	public void findIndex(int v){
		int pos =0;
		Node travel = firstNode;
		while(travel.getNext()!=null){
			pos++;
			if(pos==v){
				System.out.println("Value Element in index"+v+" is: "+travel.getData());
				break;
			}
			travel= travel.getNext();
			
		}
	}
	public void removeFirst(){
		firstNode = firstNode.getNext();
	}
	public void print(){
		Node temp = firstNode;
		while(temp.getNext()!=null){
			System.out.println(temp.getData());
			temp =temp.getNext();
		}
		System.out.println(temp.getData());
	}
}
