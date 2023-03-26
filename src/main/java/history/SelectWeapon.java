/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package history;

import dices.Row10;
import java.util.Scanner;
import weapons.*;
import weapons.axes.BasicAx;
import weapons.axes.SpecialAx;
import weapons.bows.BasicBow;
import weapons.bows.SpecialBow;
import weapons.swords.BasicSword;
import weapons.swords.SpecialSword;

/**
 *
 * @author sardemberg
 */
public class SelectWeapon implements HistoryStep {

    @Override
    public Object execute() {
        System.out.println("Chegou a hora de você selecionar a sua arma, temos três opções:");
        Weapon weapon = select_weapon();
        weapon = is_especial(weapon);
        return weapon;
    }

    private Weapon select_weapon() {
        System.out.println("1 - Arco");
        System.out.println("2 - Espada");
        System.out.println("3 - Machado");

        Scanner scn = new Scanner(System.in);

        int escolha = scn.nextInt();

        switch (escolha) {
            case 1:
                return new BasicBow();
            case 2:
                return new BasicSword();
            case 3:
                return new BasicAx();
            default:
                System.out.println("Escolha inválida, selecione uma das três opções");
                select_weapon();
        }

        return null;
    }

    private Weapon is_especial(Weapon baseWeapon) {
        System.out.println("Se você tiver sorte, ou seja, tirar um número maior que 7 no row 10, sua arma recebe um boost");
        int valor_sorteio = Row10.sortear();
        System.out.println("O sorteio deu: " + valor_sorteio + (valor_sorteio > 7 ? ". Parabéns!" : ". É uma pena!"));
        
        if(valor_sorteio <= 7) return baseWeapon;

        switch (baseWeapon.getClass().getSimpleName()) {
            case "BasicAx":
                System.out.println("Você recebeu um machado especial!");
                System.out.println("Seu dado adicional é de: " + String.valueOf(
                        new SpecialAx(baseWeapon).getDamage()- baseWeapon.getDamage())
                );
                return new SpecialAx(baseWeapon);
            case "BasicBow":
                System.out.println("Você recebeu um arco especial!");
                System.out.println("Seu dado adicional é de: " + String.valueOf(
                        new SpecialBow(baseWeapon).getDamage()- baseWeapon.getDamage())
                );
                return new SpecialBow(baseWeapon);
            case "BasicSword":
                System.out.println("Você recebeu uma espada especial!");
                System.out.println("Seu dado adicional é de: " + String.valueOf(
                        new SpecialSword(baseWeapon).getDamage()- baseWeapon.getDamage())
                );
                return new SpecialSword(baseWeapon);
        }
        
        return null;
    }

}
