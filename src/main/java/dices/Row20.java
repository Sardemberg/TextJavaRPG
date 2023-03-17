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
public class Row20 {
    private Random dice = new Random();
    
    public int sortear(){
        return dice.nextInt(20) + 1;
    }
}
