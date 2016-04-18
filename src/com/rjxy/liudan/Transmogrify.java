package com.rjxy.liudan;

public class Transmogrify {

	public static void main(String[] args) {
		Stage s = new Stage();
		s.go();
		s.change();
		s.go();
	}
	asdfasdfasdfasjlkdfh
	asdfasdfasdfasdfasdf
}asdffffsdfasdfasd
interface Actor{
	void act();
	void adaa();
	
	
	asdfasdf
	asdfasdfa
	asdfasdfsda

adsfasdfasdfasdfasd
asdfasdf
asdfas
dfasdfa
asdfa
asdfa
}

class HappyActor implements Actor{

	@Override
	public void act() {
		System.out.println("HappyActor");
	}

	@Override
	public void adaa() {
		
	}
}

class SadActor implements Actor{

	@Override
	public void act() {
		System.out.println("SadActor");
	}

	@Override
	public void adaa() {
		
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
