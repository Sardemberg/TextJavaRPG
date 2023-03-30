/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enemies;

/**
 *
 * @author sardemberg
 */
public class Trol implements Enemy{
    private int vida = 35;

    @Override
    public int atacar() {
        return 8;
    }

    @Override
    public void defender(int dano) {
        this.vida -= (dano - 5);
    }

    @Override
    public boolean isDead() {
        return vida <= 0;
    }
}
