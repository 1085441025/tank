package com.hand.tank;

import java.awt.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Frame frame = new TankFrame();

        while (true){
            Thread.sleep(50);
            frame.repaint();
        }

    }
}
