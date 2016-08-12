package com.dtb.jsnake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RenderingPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Everything we want to render in the window should be here.

		JSnake snake = JSnake.jSnake;

		// Background color
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, super.getWidth(), super.getHeight());

		// Look, a square apple!
		g.setColor(Color.RED);
		g.fillRect(snake.getApple().x, snake.getApple().y, JSnake.SIZE, JSnake.SIZE);

		// This is our snake... and I am serious.
		g.setColor(Color.GREEN);
		for (Point entry : snake.getPositions()) {
			if (entry != null) {
				g.fillRect(entry.x, entry.y, JSnake.SIZE, JSnake.SIZE);
			}
		}
	}
}
