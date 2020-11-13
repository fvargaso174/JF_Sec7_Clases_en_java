package com.polimorfismo;

public class TrianglesApplet extends Applet {
	public void paint(Graphics g) {
		int[] xPoints = { 0, 40, 80 };
		int[] yPoints = { 50, 0, 50 };
		g.setColor(Color.blue);
		g.fillPolygon(xPoints, yPoints, 3);
		int[] x2Points = { 80, 160, 0 };
		int[] y2Points = { 50, 140, 140 };
		g.setColor(Color.black);
		g.fillPolygon(x2Points, y2Points, 3);
	}// end method paint
}// end class TrianglesApplet