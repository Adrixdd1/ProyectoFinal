/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author victo
 */
public class Casa {
    private int x;
    private int y;
    private int w;
    private int h;
    private Ventana v;
    public Casa(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        v=new Ventana((int)(x+w*.2),(int)(y+h*.2),(int)(w*.2),(int)(h*.2));
    }
    public void dibujar(Graphics2D g){
        dibujarTecho(g);
        dibujarCuerpo(g);
        dibujarPuerta(g);
        v.dibujar(g);
    }
    public void dibujarTecho(Graphics2D g){
        g.fillRect(x, y, w, (int) (h*.1));
    }
    public void dibujarCuerpo(Graphics2D g){
        g.setColor(Color.red);
        g.fillRect((int) (x+w*.1), (int) (y+h*.1), (int) (w*.8), (int) (h*.8));
    }
    public void dibujarPuerta(Graphics2D g){
        g.setColor(Color.GRAY);
        g.fillRect((int) (x+w*.2), (int) (y+h*.55), (int) (w*.2), (int) (h*.35));
    }
}
