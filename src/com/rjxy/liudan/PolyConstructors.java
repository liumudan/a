package com.rjxy.liudan;

public class PolyConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoundGlyph(5);
	}

}

abstract class Glyph{
	abstract void draw();
	
	Glyph(){
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph{

	int radius = 1;
	
	RoundGlyph(int r){
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(),radius="+radius);
	}
	
	@Override
	void draw() {
		System.out.println("RoundGlyph.draw(), radius = "+radius);
	}
	
}
