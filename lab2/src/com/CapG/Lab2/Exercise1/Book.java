package com.CapG.Lab2.Exercise1;

public class Book extends WrittenItem {
	Book(int idno, String title, int noOfCopies, String authorName){
		super(idno, title, noOfCopies, authorName);
	}
	void checkIn(int noOfCopies, int idno)
			{
		System.out.println(noOfCopies+" copies of idno. "+idno+" have been checkedin");
	        }	
	void checkOut(int noOfCopies, int idno) 
        	{
	    System.out.println(noOfCopies+" copies of idno. "+idno+" have been checkedout");
     	    }
	public static void main(String[] args) {
		Item obj =new Book(123,"Wings",3,"sam");
		obj.checkIn(getNoOfCopies(), getIdno());
	}
}
