package com.dtb.jsnake;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RenderingPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Look, a square apple!
		g.setColor(Color.RED);
		g.fillRect(50, 50, 10, 10);
	}
}
