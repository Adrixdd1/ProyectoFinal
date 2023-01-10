/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

import java.awt.Graphics2D;

/**
 *
 * @author victo
 */
public class Ventana {
    private int x;
    private int y;
    private int h;
    private int w;

    public Ventana(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
    }
    public void dibujar(Graphics2D g){
        g.drawRect(x, y, w, h);
        g.drawLine(x, y+h/2, x+w, y+h/2);
    }
}
