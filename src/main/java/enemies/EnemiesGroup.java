/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enemies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class EnemiesGroup {
    private List<Enemy> enemies;

    private String enemy_type;
    
    public EnemiesGroup(List<Enemy> enemies, String enemy_type){
        this.enemies = enemies;
        this.enemy_type = enemy_type;
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

    public String getEnemiesDescription(String enemy_type){
        HashMap<String, String> descriptions = new HashMap<String, String>();

        descriptions.put("Goblin", "Os goblins estavam reunidos em sua caverna, entediados e sem nada para fazer, quando\n" +
                "ouviram um barulho estranho. Curiosos, eles foram investigar e se depararam com um \n" +
                "personagem misterioso, vestido com armadura e portando uma arma. \n" +
                "Os goblins, criaturas sanguinárias e ávidas por luta, atacaram o protagonista sem hesitação,\n" +
                "determinados a mostrar sua força e superioridade.\n");

        descriptions.put("Trol", "Os trols estavam descansando sob a luz da lua, em um vale sombrio, quando ouviram um ruído estranho.\n" +
                "Curiosos, eles foram investigar e encontraram um personagem desconhecido, armado e pronto para a batalha. \n" +
                "Os trols, que normalmente preferiam a paz, sentiram seu instinto de proteção ativado e ficaram em posição de defesa. \n" +
                "Apesar de suas diferenças, o grupo de trols se preparou para o combate contra o protagonista, determinados a proteger sua casa e suas vidas.\n");

        descriptions.put("BigBatOfVindar", "Os grandes morcegos de Vindar estavam descansando em suas tocas no alto das montanhas, quando foram perturbados por um som estranho.\n" +
                "Curiosos, eles voaram para investigar e encontraram um personagem desconhecido, portando uma arma e pronto para a batalha.\n" +
                "Os morcegos, normalmente evitando conflitos, se sentiram ameaçados e prontos para se defender.\n" +
                "Com seus grandes corpos alados, os morcegos se prepararam para enfrentar o protagonista, determinados a proteger sua casa e seus companheiros de espécie.");


        return descriptions.get(enemy_type);
    }

    public boolean isDead(){
        boolean enemies_dead = true;

        for(Enemy e: enemies){
            if(!e.isDead())
                enemies_dead = false;
        }

        return enemies_dead;
    }
    
    public void defender(int dano){
        for(Enemy e: enemies){
            if(!e.isDead())
                e.defender(dano);
        }
    }

    public String getEnemyType(){
        switch (this.enemy_type) {
            case "Goblin":
                return "Goblins";
            case "Trol":
                return "Trols";
            case "BigBatOfVindar":
                return "Morcegos de Vindar";
        }

        return null;
    }
    
}
