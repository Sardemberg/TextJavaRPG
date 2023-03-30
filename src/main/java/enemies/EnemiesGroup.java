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
public class EnemiesGroup {
    private List<Enemy> enemies;
    
    public EnemiesGroup(List<Enemy> enemies){
        this.enemies = enemies;
    }
    
    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }
    
    public int atacar(){
        System.out.println("Os "+this.enemies.size()+" estão se preparando para atacar");
        int ataque = 0;
        
        for(Enemy e: enemies){
            ataque += e.atacar();
        }
        
        System.out.println("Os "+this.enemies.size()+" deram "+ataque+" de dano");
        return ataque;
    }
    
    public void defender(int dano){
        for(Enemy e: enemies){
            e.defender(dano);
        }
    }
    
}
