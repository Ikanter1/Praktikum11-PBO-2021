/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas01;

/**
 *
 * @author LENOVO
 */
public class WalkingZombie01 extends Zombie01 {

    public WalkingZombie01(int heal, int level) {
        this.healt = heal;
        this.level = level;
    }

    public void heal() {
        if (level == 1) {
            healt += (healt * 2 / 100);
        } else if (level == 2) {
            healt += (healt * 3 / 100);
        } else {
            healt += (healt * 4 / 100);
        }
    }

    public void destroyed() {
        healt -= (healt * 20 / 100);
    }

    public String getZombieInfo() {
        String info = "Walking" + super.getZombieInfo() + "\n";
        info += "Health = " + healt + "\n" + "Level = " + level + "\n";
        return info;
    }
}
