/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prydibujo;

import java.awt.Graphics2D;

/**
 *
 * @author victo
 */
public class Camion extends ObjetoADibujar{
    private Graphics2D g;

    public Camion(Graphics2D g, int w, int h) {
        super(w, h);
        this.g = g;
    } 
    @Override
    public void dibujar() {
       g.drawRect((int) (super.getW()*.1), (int) (super.getH()*.4), (int)(super.getW()*.6), (int)(super.getH()*.4));
       g.drawOval((int) (super.getW()*.15), (int) (super.getH()*.8), (int)(super.getW()*.15), (int)(super.getH()*.15));
       g.drawOval((int) (super.getW()*.45), (int) (super.getH()*.8), (int)(super.getW()*.15), (int)(super.getH()*.15));
       g.drawRect((int) (super.getW()*.7), (int) (super.getH()*.28), (int)(super.getW()*.25), (int)(super.getH()*.48));
    }
    
}
