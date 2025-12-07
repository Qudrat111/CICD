package org.example;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseCaptureDemo extends JFrame implements MouseMotionListener {
    public JLabel mouseHoverStatus;

    public static void main(String[] args) {
        new MouseCaptureDemo();
    }
    MouseCaptureDemo() {
        setSize(500, 500);
        setTitle("Frame displaying Cordinates of Mouse Motion");

        mouseHoverStatus = new JLabel("No mouse hover detected", JLabel.CENTER);
        add(mouseHoverStatus);
        addMouseMotionListener(this);
        setVisible(true);


    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseHoverStatus.setText("Mouse cursor coordinates  at X" + e.getX() + " Y " + e.getY());
    }
}
