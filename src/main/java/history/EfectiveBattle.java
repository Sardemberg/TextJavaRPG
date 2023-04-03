package history;

import enemies.EnemiesGroup;
import player.Jogador;
import dices.Row2;

public class EfectiveBattle implements HistoryStep {
    private final EnemiesGroup enemies;
    private final Jogador player;

    public EfectiveBattle(EnemiesGroup enemies, Jogador player) {
        this.enemies = enemies;
        this.player = player;
    }

    @Override
    public Object execute() {
        int vez = Row2.sortear();

        while (!this.enemies.isDead() && !this.player.isDead()) {
            if (vez == 1) {
                System.out.println(this.player.getNome() + " está atacando...");
                int damage = player.attack();
                enemies.defender(damage);
                System.out.println("Os inimigos tomaram " + damage + " de dano");
                vez = 2;
            } else {
                System.out.println("Os " + this.enemies.getEnemyType() + " estão atacando...");
                int damage = enemies.atacar();
                player.defender(damage);
                vez = 1;
            }
        }

        if(this.enemies.isDead()){
            System.out.println(this.player.getNome() + " venceu a batalha!");
        }else{
            System.out.println(this.enemies.getEnemyType() + " venceram a batalha");
        }

        return null;
    }
}
