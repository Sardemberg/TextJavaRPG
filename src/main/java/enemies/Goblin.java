/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enemies;

/**
 *
 * @author Aluno
 */
public class Goblin implements Enemy{
    private int vida = 25;

    @Override
    public int atacar() {
        return 2;
    }

    @Override
    public void defender(int dano) {
        this.vida -= (dano - 2);
    }

    @Override
    public boolean isDead() {
        return vida <= 0;
    }
}
