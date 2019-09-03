package animation;

import java.awt.Color;
import java.awt.Graphics;

abstract public class Shape extends Thread {
	Graphics gr;
	int height;
	int x,y;
	int direction;
	
	abstract public void draw(Graphics g);
	public Shape(Graphics g1,int h,int x1,int y1)
	{
		gr=g1;
		height=h;
		y=y1;
		x=x1;
		direction=1;
	}
	@Override
	public void run() {
		
		while(true)
		{
			try {
				gr.setColor(Color.WHITE);
				this.draw(gr);
				y=y+direction*5;
				if(y>height||y<0)
					direction*=-1;				
				gr.setColor(Color.RED);
				this.draw(gr);
				Thread.sleep(100);
				
			}catch(Exception e)
			{
				System.out.println("Error:"+e);
			}
		}
		
	}	
}
