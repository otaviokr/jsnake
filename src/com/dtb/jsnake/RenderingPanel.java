package com.dtb.jsnake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RenderingPanel extends JPanel {

	private BufferedImage snakeHeadTexture, snakeBodyTexture, appleTexture;

	public RenderingPanel() {
		super();

		try {
			snakeHeadTexture = ImageIO.read(new File("resource/head.png"));
			snakeBodyTexture = ImageIO.read(new File("resource/body.png"));
			appleTexture = ImageIO.read(new File("resource/apple.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Everything we want to render in the window should be here.

		// Background color
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, super.getWidth(), super.getHeight());

		JSnake snake = JSnake.jSnake;

		// Look, a square apple!
		//g.setColor(Color.RED);
		//g.fillRect(snake.getApple().x, snake.getApple().y, JSnake.SIZE, JSnake.SIZE);
		if (snake != null) {
			g.drawImage(appleTexture, snake.getApple().x, snake.getApple().y, null);

			// This is our snake... and I am serious.
			//g.setColor(Color.GREEN);
			int i = 0;
			for (Point entry : snake.getPositions()) {
				if (entry != null) {
					//g.fillRect(entry.x, entry.y, JSnake.SIZE, JSnake.SIZE);
					g.drawImage(i++ == snake.getPositions().length - 1 ? snakeHeadTexture : snakeBodyTexture, entry.x, entry.y, null);
				}
			}

			// Score
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Phosphate", Font.PLAIN, 18));
			g.drawString(String.valueOf(snake.getScore()), 10, 20);
		}
	}
}
