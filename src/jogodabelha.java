import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class jogodabelha {
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Bem-vindo ao jogo da velha!"); 
    System.out.println("Escolha o símbolo do jogador 1 (X ou O): ");
    String jogador1 = sc.nextLine();
    if (jogador1.equalsIgnoreCase("X")) {
        System.out.println("O jogador 1 escolheu X. O jogador 2 será O.");
    } else if (jogador1.equalsIgnoreCase("O")) {
        System.out.println("O jogador 1 escolheu O. O jogador 2 será X.");
    } else {
        System.out.println("Símbolo inválido. Por favor, escolha X ou O.");
        sc.close();
        return;
    }
    


    sc.close();

    }


}
