package com.vquochuy.decorator2;

public class DecoratorPatternDemo {
	public static void main(String[] args) {

		Shape circle = new RedShapeDecorator(new Circle());

		circle = new GreenShapeDecorator(circle);
		circle = new GreenShapeDecorator(circle);
		
		System.out.println("\nCircle of red and green border");
		
		circle.draw();

	}
}
