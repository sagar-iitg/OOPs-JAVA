package com.sagar.oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		Shapes shapes = new Shapes();
		Circle circle = new Circle();
		Square square = new Square();

		shapes.area();
		circle.area();
	}
}
