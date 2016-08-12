package com.dtb.jsnake;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RenderingPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Everything we want to render in the window should be here.

		// Background color
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, super.getWidth(), super.getHeight());

		// This is our snake... and I am serious.
		JSnake snake = JSnake.jSnake;
		g.setColor(Color.GREEN);
		g.fillRect(snake.getPosition().x, snake.getPosition().y, JSnake.SIZE, JSnake.SIZE);
	}
}
