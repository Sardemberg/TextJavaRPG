/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package history;

import enemies.*;
import java.util.ArrayList;
import java.util.List;
import dices.Row10;
import java.util.HashMap;

/**
 *
 * @author sardemberg
 */
public class EnemiesSummon implements HistoryStep{

    @Override
    public Object execute() {
        String enemy_type = chooseEnemiesType();
        System.out.println("Se prepare, você está prestes a lutar contra um grupo de " + enemy_type);
        System.out.println();
        EnemiesGroup enemies = new EnemiesGroup(summonEnemies(enemy_type, 4), enemy_type);
        System.out.println(enemies.getEnemiesDescription(enemy_type));
        
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
                break;
            case "Trol":
                for (int i = 0; i < quantity; i++){
                    Enemy Trol = new Trol();
                    enemies.add(Trol);
                }
                break;
            case "BigBatOfVindar":
                for (int i = 0; i < quantity; i++){
                    Enemy bigBatOfVindar = new BigBatOfVindar();
                    enemies.add(bigBatOfVindar);
                }
                break;
        }

        return enemies;
    }

    private String chooseEnemiesType() {
        int result = Row10.sortear();

        if (result <= 3) {
            return "Trol";
        } else if (result <= 7) {
            return "Goblin";
        } else {
            return "BigBatOfVindar";
        }
    }
}
