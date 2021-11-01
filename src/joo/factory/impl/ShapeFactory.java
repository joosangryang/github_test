package joo.factory.impl;

import joo.factory.inf.ShapeInf;

public class ShapeFactory {
	
	public ShapeInf getShape(String shape) {
		
		if(shape == null) {
			return null;
		}else if(shape == "Circle") {
			
			return new CircleImpl();
		}else if(shape == "Rectangle") {
			
			return new RectangleImpl();
		}else if(shape == "Square"){
			return new SquareImpl();
		}
		
		return null; 
	}

}
