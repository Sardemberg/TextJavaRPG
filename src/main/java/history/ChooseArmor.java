/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package history;

import armors.*;
import java.util.Scanner;

/**
 *
 * @author sardemberg
 */
public class ChooseArmor implements HistoryStep{

    @Override
    public Object execute() {
        System.out.println("Chegou a hora de selecionar sua armadura!");
        System.out.println("A nível de conhecimento, você possui uma armadura básica(+2 de defesa, -0 de dano)");
        Armor basic_armor = new BasicArmor();
        return choose_armor(basic_armor);
    }
    
    private Armor choose_armor(Armor basic_armor){
        System.out.println("Existem três tipos disponíveis");
        System.out.println("1 - Armadura de cobre (+7 defesa, -2 de ataque)");
        System.out.println("2 - Armadura de ferro (+12 defesa, -4 de ataque)");
        System.out.println("3 - Armadura de aço (+20 de armadura, -10 de ataque)");
        System.out.println("4 - Não escolher armadura");
        Scanner scn = new Scanner(System.in);
        
        switch(scn.nextInt()){
            case 1: 
                return new CopperArmor(basic_armor);
            case 2:
                return new IronArmor(basic_armor);
            case 3:
                return new SteelArmor(basic_armor);
            case 4:
                return basic_armor;
            default:
                choose_armor(basic_armor);
        }
        
        return null;
    }
    
}
