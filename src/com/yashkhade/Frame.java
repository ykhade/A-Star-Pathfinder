package com.yashkhade;

import org.w3c.dom.Node;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*

 */

public class Frame extends JPanel implements ActionListener, MouseListener, MouseMotionListener, MouseWheelListener, KeyListener {

    ControlHandler ch;
    JFrame window;
    APathfinding pathfinding;
    boolean showSteps, btnHover;
    int size;
    double a1, a2;
    char currentKey = (char) 0;
    Node startNode, endNode;
    String mode;


    public static void main(String[] args) {
        new Frame();
    }
    public Frame() {
        ch = new ControlHandler(this);
        size = 25;
        mode = "Map Creation";
        showSteps = true;
        btnHover = false;
        setLayout(null);
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        // Set up pathfinding
        pathfinding = new APathfinding(this, size);
        pathfinding.setDiagonal(true);

        // Calculating value of a in speed function 1
        a1 = (5000.0000 / (Math.pow(25.0000/5000, 1/49)));
        a2 = 625.0000;

        // Set up window
        window = new JFrame();
        window.setContentPane(this);
        window.setTitle("A* Pathfinding Visualization");
        window.getContentPane().setPreferredSize(new Dimension(700, 600));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        // Add all controls
        ch.addAll();

        this.revalidate();
        this.repaint();
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {

    }
}



