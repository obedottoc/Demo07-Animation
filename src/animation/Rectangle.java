package animation;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {


	public Rectangle(Graphics g1,int h,int x1,int y1)
	{
		super(g1,h,x1,y1);
	}
	@Override
	public void draw(Graphics g) {
			
		g.drawRect(x, y, 40, 20);

	}
}
