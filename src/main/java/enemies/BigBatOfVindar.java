/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enemies;

/**
 *
 * @author gabie
 */
public class BigBatOfVindar implements Enemy{
    
    private int vida = 28;

    @Override
    public int atacar() {
        return 6;
    }

    @Override
    public void defender(int dano) {
        this.vida -=(dano); 
    }

    @Override
    public boolean isDead() {
         return vida <= 0; 
    }
    
    
}
