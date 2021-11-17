/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas01;

/**
 *
 * @author LENOVO
 */
public class Barrier01 implements Idestroyable01{

    private int strength;

    public Barrier01(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= (strength * 0.1);
    }

    public String getBarrierInfo() {
        String info = "";
        info += "Barrier Strength =" + strength;
        return info;
    }
}
