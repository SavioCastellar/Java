import java.util.Scanner;

public class Console {
    public static void main(String[] args){

        String s = "Bom dia!";
        
        System.out.println(s.toUpperCase());
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();
        
        System.out.printf("%s %s tem %d anos de idade.", nome, sobrenome, idade);

        entrada.close();
        
    }
}
