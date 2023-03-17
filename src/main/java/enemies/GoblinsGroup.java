/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enemies;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class GoblinsGroup {
    private List<Enemy> goblins = new ArrayList<Goblin>();
    private int vida = 25;
    
    public GoblinsGroup(int globlinsNumber){
        
    }
    
    public int atacar(){
        int ataque = 0;
        for(Goblin g: goblins){
            ataque += g.atacar();
        }
        return ataque;
    }
    
    public void defender(int dano){
        int defesa = 0;
        for(Goblin g: goblins){
            defesa += g.defender();
        }
        int realdano = dano - defesa;
        this.vida -= realdano;
    }
    
}
