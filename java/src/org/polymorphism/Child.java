package org.polymorphism;

public class Child extends Parent{
	@Override
	 void seen() {
		// TODO Auto-generated method stub
		
		System.out.println("child seen");
		super.seen();
	}
	@Override
	void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("child show");
	}
	
	public static void main(String[] args) {
		Parent ch = new Child();
		ch.show();
		ch.show();
		ch.seen();
		Parent p = new Parent();
		p.show();
		
	}
}
