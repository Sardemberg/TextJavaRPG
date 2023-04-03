/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

import weapons.Weapon;
import armors.Armor;

/**
 *
 * @author Aluno
 */
public class Jogador {
    private int vida = 100;
    private Weapon arma;
    private Armor armadura;
    private Personagem personagem;
    private String nome;
    
    public Jogador(String nome, Personagem tipo){
        this.nome = nome;
        this.personagem = tipo;
    }
    
    public int attack(){
        return this.personagem.atacar(this.arma.getDamage() - this.armadura.damage_decrement());
    }

    public void defender(int damage){
        int effective_damage = (damage - this.personagem.defender(this.armadura.getDefense()));
        this.vida -= effective_damage;
        System.out.println(this.getNome() + " tomou " + effective_damage + " de dano");
    }

    public boolean isDead(){
        return this.vida <= 0;
    }
    
    public void setArma(Weapon arma){
        this.arma = arma;
    }
    
    public void setArmadura(Armor armadura){
        this.armadura = armadura;
    }

    public String getNome(){
        return this.nome;
    }
}
