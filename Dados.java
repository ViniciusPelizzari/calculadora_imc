
//importando método Scanner para leitura de dados
import java.util.Scanner;

/**
 * @author Vinícius Pelizzari
 */
public class Dados {
    public static void main(String[] args) {
        // criando objeto
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua altura em metros (ex: 1,80): ");
        // entrada de dados
        float altura = scanner.nextFloat();
        System.out.print("Digite seu peso (ex: 79,70) ");
        // entrada de dados
        float peso = scanner.nextFloat();

        // cálculo do imc
        float imc = peso / (altura * altura);
        // forçando saída de dados imediatamente
        System.out.flush();

        // condições e apresentação na tela
        if (imc <= 18.4) {
            System.out.println("Seu IMC é de:" + imc);
            System.out.println("Você é classificado como 'MAGRO', com grau de obesidade 0\n");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Seu IMC é de:" + imc);
            System.out.println("Você é classificado como 'NORMAL', com grau de obesidade 0\n");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Seu IMC é de:" + imc);
            System.out.println("Você é classificado como 'ACIMA DO PESO', com grau de obesidade I\n");
        } else if (imc >= 30.0 && imc <= 39.9) {
            System.out.println("Seu IMC é de:" + imc);
            System.out.println("Você é classificado como 'OBESO', com grau de obesidade II\n");
        } else if (imc >= 40.0) {
            System.out.println("Seu IMC é de:" + imc);
            System.out.println("Você é classificado como 'OBESO', com grau de obesidade III\n");
        }
    }
}