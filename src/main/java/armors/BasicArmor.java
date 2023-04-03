/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armors;

/**
 *
 * @author Aluno
 */
public class BasicArmor implements Armor {

    @Override
    public int getDefense() {
        return 2;
    }

    @Override
    public int damage_decrement() {
        return 0;
    }
    
    
}
