/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

/**
 *
 * @author Aluno
 */
public class Jogador {
    private int vida = 100;
    private int ataque;
    private int defesa;
    private Personagem personagem;
    private String nome;
    
    public Jogador(String nome, Personagem tipo){
        this.nome = nome;
        this.personagem = tipo;
    }
    
    public void atacar(){
        System.out.println(this.personagem.atacar(60));
    }
}
