package com.vquochuy.factory3;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if(color == null){
			return null;
		}
		else if(color.equalsIgnoreCase("RED")){
			return new Red();
		}
		else if(color.equalsIgnoreCase("YELLOW")){
			return new Yellow();
		}
		else if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
