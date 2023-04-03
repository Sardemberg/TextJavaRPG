/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rpg;
import history.*;
import player.*;
import weapons.Weapon;
import armors.Armor;
import enemies.EnemiesGroup;

/**
 *
 * @author Aluno
 */
public class RPG {    
    public static void main(String[] args) {
        // Introdução
        HistoryContext context = new HistoryContext(new Introduction());
        String nome = (String) context.executeStep();

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        // Escolha do tipo de personagem
        context.setStep(new ChoosePlayer());
        Personagem tipo = (Personagem) context.executeStep();
        Jogador jogador = new Jogador(nome, tipo);

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        // Escolha da arma
        context.setStep(new SelectWeapon());
        Weapon weapon = (Weapon) context.executeStep();
        jogador.setArma(weapon);

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        // Escolha do tipo de armadura
        context.setStep(new ChooseArmor());
        Armor player_armor = (Armor) context.executeStep();
        jogador.setArmadura(player_armor);

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();
        
        // Invocação dos inimigos
        context.setStep(new EnemiesSummon());
        EnemiesGroup enemies = (EnemiesGroup) context.executeStep();

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        // Batalha com os inimigos
        context.setStep(new EfectiveBattle(enemies, jogador));
        context.executeStep();
    }
}