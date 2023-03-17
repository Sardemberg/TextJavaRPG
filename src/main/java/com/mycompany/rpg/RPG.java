/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rpg;

import enemies.Enemy;
import enemies.Goblin;
import enemies.EnemiesGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import player.Anao;
import player.Elfo;
import player.Humano;
import player.Jogador;

/**
 *
 * @author Aluno
 */
public class RPG {

    public static void main(String[] args) {
        EnemiesGroup grupog = new EnemiesGroup(summonEnemies("Goblin", 20));
        grupog.atacar();
    }
    
    public static Jogador selecionar_personagem(){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Selecione seu tipo de personagem: ");
        System.out.println("1 - Anão");
        System.out.println("2 - Elfo");
        System.out.println("3 - Humano");
        
        int escolha = scn.nextInt();
        String nome = scn.nextLine();
        
        switch(escolha){
            case 1 -> {
                return new Jogador(nome, new Anao());
            }
            case 2 -> {
                return new Jogador(nome, new Elfo());
            }
            case 3 -> {
                return new Jogador(nome, new Humano());
            }
            default -> {
                System.out.println("Resposta inválida");
                selecionar_personagem();
            }
        }
        
        return null;
    }
    
    public static List<Enemy> summonEnemies(String type, int quantity){
        List<Enemy> enemies = new ArrayList<>();
        
        switch(type){
            case "Goblin" -> {
                for(int i = 0; i < quantity; i++){
                    Enemy goblin = new Goblin();
                    enemies.add(goblin);
                }
            }
        }
        
        return enemies;
    }
}
