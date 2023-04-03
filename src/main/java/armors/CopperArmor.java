/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package armors;

/**
 *
 * @author Aluno
 */
public class CopperArmor extends PlayerArmor{
    
    public CopperArmor(Armor armor){
        super(armor);
    } 
    
    @Override
    public int getDefense() {
        return super.concrete_armor.getDefense() + 7;
    }

    @Override
    public int damage_decrement() {
        return super.concrete_armor.damage_decrement() + 2;
    }
}
