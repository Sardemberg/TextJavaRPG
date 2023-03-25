/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package history;

import java.util.Scanner;
import player.Anao;
import player.Elfo;
import player.Humano;
import player.Personagem;

/**
 *
 * @author sardemberg
 */
public class ChoosePlayer implements HistoryStep {

    @Override
    public Object execute() {
        return selecionar_tipo_personagem();
    }
    
    private Personagem selecionar_tipo_personagem() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Selecione seu tipo de personagem: ");
        System.out.println("1 - Anão");
        System.out.println("2 - Elfo");
        System.out.println("3 - Humano");

        int escolha = scn.nextInt();
        String nome = scn.nextLine();

        switch (escolha) {
            case 1:
                System.out.println("Os anões são fortes e leais, é uma ótima escolha para uma batalha arrojada");
                return new Anao();
            case 2:
                System.out.println("Os elfos são leves e destemidos, muito bom para se ter por perto");
                return new Elfo();
            case 3:
                System.out.println("Os humanos são audazes e destemidos, conseguem fazer de tudo");
                return new Humano();
            default:
                System.out.println("Resposta inválida");
                selecionar_tipo_personagem();
        }

        return null;
    }
}
