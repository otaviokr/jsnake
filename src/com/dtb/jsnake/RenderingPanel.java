package com.dtb.jsnake;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RenderingPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		JSnake snake = JSnake.snake;

		// Look, a square apple!
		g.setColor(Color.RED);
		g.fillRect(snake.getApple().x, snake.getApple().y, JSnake.SIZE, JSnake.SIZE);
	}
}
