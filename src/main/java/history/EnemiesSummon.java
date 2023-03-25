/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package history;

import enemies.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sardemberg
 */
public class EnemiesSummon implements HistoryStep{

    @Override
    public Object execute() {
        System.out.println("Se prepare, você está prestes a lutar contra um grupo de trols");
        
        EnemiesGroup enemies = new EnemiesGroup(summonEnemies("Trol", 4));
        
        return enemies;
    }
    
    private List<Enemy> summonEnemies(String type, int quantity) {
        List<Enemy> enemies = new ArrayList<>();

        switch (type) {
            case "Goblin":
                for (int i = 0; i < quantity; i++) {
                    Enemy goblin = new Goblin();
                    enemies.add(goblin);
                }
            case "Trol":
                for (int i = 0; i < quantity; i++){
                    Enemy Trol = new Trol();
                    enemies.add(Trol);
                }
        }

        return enemies;
    }
}
