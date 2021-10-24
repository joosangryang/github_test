package joo.factory.main;

import joo.factory.impl.ShapeFactory;
import joo.factory.inf.ShapeInf;

public class ShapeFactoryMain {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		ShapeInf shape = factory.getShape("Circle");
		shape.draw();
		

	}

}
