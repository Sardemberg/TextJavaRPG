/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rpg;
import history.*;
import player.*;
import weapons.Weapon;
import weapons.axes.BasicAx;
import weapons.bows.BasicBow;
import weapons.swords.BasicSword;

/**
 *
 * @author Aluno
 */
public class RPG {    
    public static void main(String[] args) {
        // Introdução
        HistoryContext context = new HistoryContext(new Introduction());
        String nome = (String) context.executeStep();
        
        // Escolha do tipo de personagem
        context.setStep(new ChoosePlayer());
        Personagem tipo = (Personagem) context.executeStep();
        Jogador jogador = new Jogador(nome, tipo);
        
        // Escolha da arma
        context.setStep(new SelectWeapon());
        Weapon weapon = (Weapon) context.executeStep();
        jogador.setArma(weapon);
        
        // Batalha com um grupo de inimigos
        context.setStep(new EnemiesSummon());
    }
}