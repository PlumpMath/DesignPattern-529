package com.vquochuy.factory3;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {
		if(shape == null){
			return null;
		}
		else if(shape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
			}
		else if(shape.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		else if(shape.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}

}
