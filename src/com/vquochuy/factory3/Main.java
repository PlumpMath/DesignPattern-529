package com.vquochuy.factory3;

public class Main {
	public static void main(String[] agrs) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color red = colorFactory.getColor("RED");
		red.fill();
	}
}
