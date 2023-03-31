/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enemies;

/**
 *
 * @author gabie
 */
public class Dragao implements Enemy{
    
    private int vida = 50;
    
    @Override
    public int atacar() {
        return 24;
    }

    @Override
    public void defender(int dano) {
        this.vida -= (dano - 8);
    }

    @Override
    public boolean isDead() {
        return vida <= 0;
    }
    
}
