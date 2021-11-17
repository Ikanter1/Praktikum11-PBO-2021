/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas01;

/**
 *
 * @author LENOVO
 */
public class Tester01 {

    public static void main(String[] args) {
        WalkingZombie01 w = new WalkingZombie01(100, 1);
        JumpingZombie01 j = new JumpingZombie01(100, 2);
        
        Barrier01 b = new Barrier01(100);
        Plant01 p = new Plant01();
        
        System.out.println("" + w.getZombieInfo());
        System.out.println("" + j.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
        System.out.println("------------------");
        
        for (int i = 0; i < 4; i++) {
            p.doDestroy(w);
            p.doDestroy(j);
            p.doDestroy(b);
        }
        
        System.out.println("" + w.getZombieInfo());
        System.out.println("" + j.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
    }
}
