/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

/**
 *
 * @author Aluno
 */
public class Humano implements Personagem {

    @Override
    public int atacar(int dano) {
        return dano + 2;
    }

    @Override
    public int defender(int dano) {
        return dano - 2;
    }
    
}
