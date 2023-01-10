/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prydibujo;

import java.awt.Color;
import java.awt.Graphics2D;
/**
 *
 * @author victo
 */
public class Casa extends ObjetoADibujar{
    private Graphics2D g;
    private int[] x=new int[4];
    private int[] y=new int[4];
    public Casa(Graphics2D g, int w, int h) {
        super(w, h);
        this.g=g;
        x[0]=0;
        y[0]=(int) (super.getH()*.1);
        x[1]=(int) (super.getW()*.1);
        y[1]=0;
        x[2]=(int) (super.getW()*.9);
        y[2]=0;
        x[3]=super.getW();
        y[3]=(int) (super.getH()*.1);
    }

    @Override
    public void dibujar() {
       camino();
       g.setColor(Color.BLACK);
       g.drawRect((int) (super.getW()*.15), (int) (super.getH()*.1), (int)(super.getW()*.7), (int)(super.getH()*.8));
       g.drawPolygon(x, y, 4);
       g.drawRect((int) (super.getW()*.25), (int) (super.getH()*.2), (int)(super.getW()*.15), (int)(super.getH()*.20));
       g.drawRect((int) (super.getW()*.60), (int) (super.getH()*.2), (int)(super.getW()*.15), (int)(super.getH()*.20));
       g.drawRect((int) (super.getW()*.40), (int) (super.getH()*.6), (int)(super.getW()*.2), (int)(super.getH()*.3));
       g.drawOval((int) (super.getW()*.56), (int) (super.getH()*.77), (int)(super.getW()*.02), (int)(super.getH()*.02));
       dibujarFlor();

    }
    private void dibujarFlor(){
        g.drawRect((int) (super.getW()*.93), (int) (super.getH()*.85), (int)(super.getW()*.05), (int)(super.getH()*.05));
        g.drawLine((int) (super.getW()*.955), (int) (super.getH()*.85), (int)(super.getW()*.955), (int)(super.getH()*.80));        
        g.setColor(Color.yellow);
        g.fillOval((int) (super.getW()*.94), (int) (super.getH()*.78), (int)(super.getW()*.03), (int)(super.getH()*.03));
    }
        private void camino(){
            Color c=new Color(153,255,153);
            g.setColor(c);
            g.fillRect((int) (super.getW()*0), (int) (super.getH()*.9), (int)(super.getW()*.4), (int)(super.getH()*.1));
            g.fillRect((int) (super.getW()*.6), (int) (super.getH()*.9), (int)(super.getW()*.4), (int)(super.getH()*.1));
            g.setColor(Color.orange);
            g.fillRect((int) (super.getW()*.4), (int) (super.getH()*.9), (int)(super.getW()*.2), (int)(super.getH()*.1));
        }
    private void dibujarTecho(){
        
    }
}
