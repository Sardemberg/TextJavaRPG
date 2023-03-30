/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armors;

/**
 *
 * @author gabie
 */
public class SteelArmor extends AbstractArmor{

    public SteelArmor(Armor armor) {
        super(armor);
    }
 
    
    @Override
    public int getDefense() {
        
        return super.concrete_armor.getDefense()+20;
        
    }
    
}
