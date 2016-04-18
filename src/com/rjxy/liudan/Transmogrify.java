package com.rjxy.liudan;

public class Transmogrify {

	public static void main(String[] args) {
		Stage s = new Stage();
		s.go();
		s.change();
		s.go();
	}

}

interface Actor{
	void act();
}

class HappyActor implements Actor{

	@Override
	public void act() {
		System.out.println("HappyActor");
	}
}

class SadActor implements Actor{

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("SadActor");
	}
}

class Stage{
	Actor a = new HappyActor();
	void change(){
		a = new SadActor();
	}
	void go(){
		a.act();
	}
}
