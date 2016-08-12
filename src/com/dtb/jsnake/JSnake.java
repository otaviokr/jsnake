package com.dtb.jsnake;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * This is the main class, where everything is created and started.
 *
 * @author otavio.krambeck
 *
 */
public class JSnake implements ActionListener, KeyListener {
	private static final int UP = 1, DOWN = 2, LEFT = 3, RIGHT = 4;
	public static final int SIZE = 15;

	private JFrame jFrame;
	private RenderingPanel renderingPanel;
	private Point position;
	private Timer timer;
	private int delay = 0;
	private int direction = DOWN;

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
		jFrame.addKeyListener(this);
		jFrame.setVisible(true);

		timer = new Timer(10, this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		renderingPanel.repaint();

		delay++;

		if (delay % 20 == 0) {
			if (direction == UP) {
				position = new Point(position.x, position.y - SIZE);
			} else if (direction == DOWN) {
				position = new Point(position.x, position.y + SIZE);
			} else if (direction == LEFT) {
				position = new Point(position.x - SIZE, position.y);
			} else if (direction == RIGHT) {
				position = new Point(position.x + SIZE, position.y);
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_W:
			direction = UP;
			break;
		case KeyEvent.VK_S:
			direction = DOWN;
			break;
		case KeyEvent.VK_A:
			direction = LEFT;
			break;
		case KeyEvent.VK_D:
			direction = RIGHT;
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public Point getPosition() {
		return position;
	}
}

