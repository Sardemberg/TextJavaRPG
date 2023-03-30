/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weapons.axes;

import weapons.Weapon;

/**
 *
 * @author sardemberg
 */
public class SpecialAx implements Weapon{
    private Weapon basicAx;
    
    public SpecialAx(Weapon basicAx){
        this.basicAx = basicAx;
    }

    @Override
    public int getDamage() {
        return this.basicAx.getDamage() + 7;
    }
    
}
