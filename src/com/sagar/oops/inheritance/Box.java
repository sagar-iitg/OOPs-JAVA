package com.sagar.oops.inheritance;

public class Box {

	double l;
	double h;
	double w;

	Box() {

		super();
		this.l = -1;
		this.h = -1;
		this.w = -1;
	}

	// cube
	Box(double side) {
		this.w = side;
		this.h = side;
		this.l = side;
	}

	Box(double l, double h, double w) {

		this.l = l;
		this.h = h;
		this.w = w;
	}

	Box(Box old) {
		this.l = old.l;
		this.w = old.w;
		this.h = old.h;

	}

	public void information() {
		System.out.println("Running the box");

	}

}
