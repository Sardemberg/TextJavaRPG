/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dices;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class Row10 {
    private Random dice = new Random();
    
    public int sortear(){
        return dice.nextInt(10) + 1;
    }
}
