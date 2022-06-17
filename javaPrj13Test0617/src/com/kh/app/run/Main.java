package com.kh.app.run;

import com.kh.app.model.vo.Circle;

public class Main {

	public static void main(String[] args) {

		Circle c = new Circle(0);	
		c.setRadius(3.1);
		c.draw();
	}

}
