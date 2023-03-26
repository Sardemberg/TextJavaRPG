/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weapons.swords;

import weapons.Weapon;

/**
 *
 * @author sardemberg
 */
public class SpecialSword implements Weapon{
    private Weapon basicSword;
    
    public SpecialSword(Weapon basicSword){
        this.basicSword = basicSword;
    }
    
    @Override
    public int getDamage() {
        return this.basicSword.getDamage() + 5;
    }
    
}
