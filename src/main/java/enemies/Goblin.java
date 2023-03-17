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

    @Override
    public int atacar() {
        return 2;
    }

    @Override
    public int defender() {
        return 2;
    }
    
}
