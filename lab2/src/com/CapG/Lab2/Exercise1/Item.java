package com.CapG.Lab2.Exercise1;

public abstract class Item {
	private static int idno;
	private String  title;
	private static int noOfCopies;
	Item(int idno,String title,int noOfCopies)
	{
		this.idno=idno;
		this.title=title;
		this.noOfCopies=noOfCopies;
	}
	public static int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public static int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	abstract void checkIn(int noOfCopies,int idno);
	abstract void checkOut(int noOfCopies,int idno);
}
