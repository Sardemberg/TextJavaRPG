/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armors;


public  abstract class PlayerArmor implements Armor{
     
    protected Armor concrete_armor;
    
    public PlayerArmor(Armor armor){
        this.concrete_armor = armor;
    }  

    @Override
    public abstract int getDefense();

    public int damage_decrement(){
        return 0;
    }
}
