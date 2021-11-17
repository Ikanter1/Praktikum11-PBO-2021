/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas01;

/**
 *
 * @author LENOVO
 */
public class Zombie01 implements Idestroyable01{
    protected int healt;
    protected int level;

    public void heal() {
    }

    @Override
    public void destroyed() {

    }

    public String getZombieInfo() {
        return "Zombie Data = ";
    }
}
