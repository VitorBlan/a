import java.util.Scanner;

public class cesar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        var texto = sc.nextLine();
        var chave = 3;
        
        sc.close();
        
        var cifrado = cifrar(texto, chave);
        var decifrado = decifrar(cifrado, chave);

        System.out.println("Texto cifrado: " + cifrado);
        System.out.println("Texto decifrado: " + decifrado);
    }

    static boolean ehMaiuscula(char c) {
        return c >= 'A' && c <= 'Z';
    }

    static boolean ehMinuscula(char c) {
        return c >= 'a' && c <= 'z';
    }

    static char deslocar(char c, int senha) {
        if (ehMaiuscula(c)) {
            int posicao = c - 'A';
            posicao = ((posicao + senha) % 26 + 26) % 26;
            return (char) ('A' + posicao);
        } else if (ehMinuscula(c)) {
            int posicao = c - 'a';
            posicao = ((posicao + senha) % 26 + 26) % 26;
            return (char) ('a' + posicao);
        } else {
            return c;
        }
    }

    static String cifrar(String texto, int senha) {
        var resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            resultado.append(deslocar(c, senha));
        }
        return resultado.toString();
    }

    static String decifrar(String texto, int senha) {
        return cifrar(texto, -senha);
    }




    
}

