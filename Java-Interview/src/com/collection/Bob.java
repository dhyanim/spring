package com.collection;

public class Bob {

	private String nickName;
	private int shoeSize;
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getShoeSize() {
		return shoeSize;
	}
	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}
	
	public Bob(String nickName, int shoeSize){
		this.nickName = nickName;
		this.shoeSize = shoeSize;
	}
	public String toString(){
		return "nickName "+nickName;
		
	}
	
	public static void main(String[] args) {
		Bob obj = new Bob("mak", 5);
		System.out.println(obj);
	}
}
