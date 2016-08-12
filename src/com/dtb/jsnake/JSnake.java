package com.dtb.jsnake;

import javax.swing.JFrame;

/**
 * This is the main class, where everything is created and started.
 *
 * @author otavio.krambeck
 *
 */
public class JSnake {
	private JFrame jFrame;

	/**
	 * Mandatory main method.
	 *
	 * @param args Nothing is really expected; just ignore it.
	 */
	public static void main(String[] args) {
		new JSnake();
	}

	/**
	 * Ordinary constructor. Nothing unusual here...
	 */
	public JSnake() {
		jFrame = new JFrame("JSnake!!!");
		jFrame.setSize(350, 350);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.add(new RenderingPanel());
		jFrame.setVisible(true);
	}
}