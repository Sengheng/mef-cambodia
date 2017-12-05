package com;

/*
 * static poly morphism : 
 * 	-> dession takes at the time of compiling the java program
 */
public class Shape {
	void draw() {

	}

	void draw(int x) {

	}

	void draw(int x, int y) {

	}

	void draw(int x, float y) {

	}
	
	void draw(float x, float y) {

	}


	public static void main(String[] args) {

		Shape s = new Shape();
		s.draw();
		s.draw(23);
		s.draw(10, 20);

	}

}
