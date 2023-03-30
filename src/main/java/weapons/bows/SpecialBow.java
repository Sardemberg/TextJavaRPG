/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weapons.bows;

import weapons.Weapon;

/**
 *
 * @author sardemberg
 */
public class SpecialBow implements Weapon{
    private Weapon basicBow;
    
    public SpecialBow(Weapon basicBow){
        this.basicBow = basicBow;
    }

    @Override
    public int getDamage() {
        return this.basicBow.getDamage() + 6;
    }
    
}
