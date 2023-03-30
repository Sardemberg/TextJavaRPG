/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package history;
import com.mycompany.rpg.Utils;
import java.util.Scanner;

/**
 *
 * @author sardemberg
 */
public class Introduction implements HistoryStep{
    private String message = "Olá, seja bem vindo a Belfo Roxo. Aqui você enfrentará muitas aventuras e processos que vão fazer você evoluir e crescer.";
    private Scanner scn = new Scanner(System.in);

    
    @Override
    public Object execute() {
        System.out.println(message);
        System.out.println("Agora, nos diga seu nome para que possamos prosseguir:");
        return scn.nextLine();
    }
}
