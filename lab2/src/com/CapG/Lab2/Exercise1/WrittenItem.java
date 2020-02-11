package com.CapG.Lab2.Exercise1;

public abstract class WrittenItem extends Item {
	private String authorName;
	WrittenItem(int idno, String title, int noOfCopies,String authorName) {
		super(idno, title, noOfCopies);
		this.authorName = authorName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
}
