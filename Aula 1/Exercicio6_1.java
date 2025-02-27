// Programa que calcula o aumento de 10%
/// A emtrada e saída são por caixa de diálogo com o JOptionPane;
/// Aula1

import javax.swing.JOptionPane;

public class Exercicio6_1 {
    public static void main (String args[]){
        String salario;
        float ordenado;

        salario = JOptionPane.showInputDialog(" Informe seu salário: ");

        ordenado = Float.parseFloat(salario);

        JOptionPane.showMessageDialog(null," Com o aumento de 10% ficou: " + (ordenado * 1.10),"reais", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }    
}
