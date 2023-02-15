
//importando método para entrada e saída de dados
import javax.swing.JOptionPane;

/**
 * @author Vinícius Pelizzari
 */
public class Dados {
    public static void main(String[] args) {
        // forçando saída de dados imediatamente
        System.out.flush();

        /**
         * apresentando tela
         * entrada de dados
         * saída de dados
         */
        String alt = JOptionPane.showInputDialog(null, "Digite a sua altura em metros (ex: 1.80): ");
        float altura = Float.parseFloat(alt);
        String kg = JOptionPane.showInputDialog(null, "Digite seu peso (ex: 79.70): ");
        float peso = Float.parseFloat(kg);

        // cálculo do imc
        float imc = peso / (altura * altura);

        // forçando saída de dados imediatamente
        System.out.flush();

        // condições e apresentação na tela
        if (imc <= 18.4) {
            JOptionPane.showMessageDialog(null, "Você é classificado como 'MAGRO', com grau de obesidade 0",
                    "Seu IMC é de: " + imc, JOptionPane.WARNING_MESSAGE);

        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Você é classificado como 'NORMAL', com grau de obesidade 0",
                    "Seu IMC é de: " + imc, JOptionPane.WARNING_MESSAGE);

        } else if (imc >= 25.0 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Você é classificado como 'ACIMA DO PESO', com grau de obesidade I",
                    "Seu IMC é de: " + imc, JOptionPane.WARNING_MESSAGE);

        } else if (imc >= 30.0 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "Você é classificado como 'OBESO', com grau de obesidade II",
                    "Seu IMC é de: " + imc, JOptionPane.WARNING_MESSAGE);

        } else if (imc >= 40.0) {
            JOptionPane.showMessageDialog(null, "Você é classificado como 'OBESO', com grau de obesidade III",
                    "Seu IMC é de: " + imc, JOptionPane.WARNING_MESSAGE);
        }
    }
}