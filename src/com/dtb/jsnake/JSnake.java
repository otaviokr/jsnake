package com.dtb.jsnake;

import java.awt.Point;
import java.util.Random;

import javax.swing.JFrame;

/**
 * This is the main class, where everything is created and started.
 *
 * @author otavio.krambeck
 *
 */
public class JSnake {
	public static final int SIZE = 15;
	private JFrame jFrame;

	private Random random;
	private Point apple;

	public static JSnake snake;

	/**
	 * Mandatory main method.
	 *
	 * @param args Nothing is really expected; just ignore it.
	 */
	public static void main(String[] args) {
		snake = new JSnake();
	}

	/**
	 * Ordinary constructor. Nothing unusual here...
	 */
	public JSnake() {
		random = new Random(System.currentTimeMillis());

		jFrame = new JFrame("JSnake!!!");
		jFrame.setSize(350, 350);			// Although this is not really mandatory, there's not much to do in a 0x0 window...
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// This is not mandatory, but it is best practice :)
		jFrame.add(new RenderingPanel());

		// A brief explanation in the calculation of X and Y:
		//	The dimension taken in consideration is the size of the frame, minus the size of the apple, otherwise, it could be
		//	placed outside the frame. This value is divided by the size and the result is multiplied, so we can put it in a
		// "fake grid", to be perfectly aligned with the snake when it eats the apple.
		apple = new Point(random.nextInt((jFrame.getWidth() - SIZE) / SIZE) * SIZE,
				random.nextInt((jFrame.getHeight() - SIZE) / SIZE) * SIZE);

		jFrame.setVisible(true);
	}

	public Point getApple() {
		return apple;
	}
}
