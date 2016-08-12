package com.dtb.jsnake;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.util.ArrayList;
import java.util.Random;

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
	private Timer timer;
	private int delay = 0;
	private boolean over = false;

	public static JSnake jSnake;
	private int direction = DOWN;
	private ArrayList<Point> positions;
	private int snakeLength = 1;

	private Random random;
	private Point apple;

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
		positions = new ArrayList<Point>();
		positions.add(new Point(0, 0));

		renderingPanel = new RenderingPanel();

		random = new Random(System.currentTimeMillis());

		jFrame = new JFrame("JSnake!!!");
		jFrame.setSize(350, 350);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.add(renderingPanel);
		jFrame.addKeyListener(this);

		// A brief explanation in the calculation of X and Y:
		//	The dimension taken in consideration is the size of the frame, minus the size of the apple, otherwise, it could be
		//	placed outside the frame. This value is divided by the size and the result is multiplied, so we can put it in a
		// "fake grid", to be perfectly aligned with the snake when it eats the apple.
		spawnNewApple();

		jFrame.setVisible(true);

		timer = new Timer(10, this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		renderingPanel.repaint();

		delay++;

		if (delay % 20 == 0) {
			Point position = null;
			Point head = positions.get(positions.size() - 1);

			switch(direction) {
			case UP:
				if (head.y > 0) {
					position = new Point(head.x, head.y - SIZE);
				} else {
					over = true;
				}
				break;

			case DOWN:
				if (head.y + SIZE < jFrame.getHeight() - SIZE) {
					position = new Point(head.x, head.y + SIZE);
				} else {
					over = true;
				}
				break;

			case LEFT:
				if (head.x > 0) {
					position = new Point(head.x - SIZE, head.y);
				} else {
					over = true;
				}
				break;

			case RIGHT:
				if (head.x + SIZE < jFrame.getWidth() - SIZE) {
					position = new Point(head.x + SIZE, head.y);
				} else {
					over = true;
				}
				break;
			}
			
			over = snakeCollided(position);

			if (apple != null) {
				if (head.getLocation().equals(apple.getLocation())) {
					snakeLength++;

					spawnNewApple();
				}
			}

			positions.add(position);
			if (positions.size() > snakeLength) {
				positions.remove(0);
			}
		} else if (over) {
			System.exit(0);
		}
	}

	private void spawnNewApple() {
		apple = new Point(random.nextInt((jFrame.getWidth() - SIZE) / SIZE) * SIZE,
				random.nextInt((jFrame.getHeight() - SIZE) / SIZE) * SIZE);
	}
	
	private boolean snakeCollided(Point p) {
		for (Point body : positions) {
			return p.getLocation().equals(body.getLocation());
		}
		return false;
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

	public Point[] getPositions() {
		return positions.toArray(new Point[]{});
	}

	public Point getApple() {
		return apple;
	}
}

