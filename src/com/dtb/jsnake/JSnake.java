package com.dtb.jsnake;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * This is the main class, where everything is created and started.
 *
 * @author otavio.krambeck
 *
 */
public class JSnake implements ActionListener {
	public static final int SIZE = 15;

	private JFrame jFrame;
	private RenderingPanel renderingPanel;
	private Point position;
	private Timer timer;
	private int delay = 0;

	public static JSnake jSnake;

	/**
	 * Mandatory main method.
	 *
	 * @param args Nothing is really expected; just ignore it.
	 */
	public static void main(String[] args) {
		jSnake = new JSnake();
	}

	/**
	 * Ordinary constructor. Nothing unusual here...
	 */
	public JSnake() {
		position = new Point(0, 0);

		renderingPanel = new RenderingPanel();

		jFrame = new JFrame("JSnake!!!");
		jFrame.setSize(350, 350);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.add(renderingPanel);
		jFrame.setVisible(true);

		timer = new Timer(10, this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		renderingPanel.repaint();

		delay++;

		if (delay % 20 == 0) {
			position = new Point(position.x + SIZE, position.y + SIZE);
		}

	}

	public Point getPosition() {
		return position;
	}
}
