// Crie um algoritmo para ler o salário de uma pessoa. 
// Calcule e imprima o valor de 10% de aumento que 
// essa pessoa irá receber.

/// A emtrada e saída são por caixa de diálogo com o JOptionPane;
/// Aula1

import javax.swing.JOptionPane;

public class Exercicio6_1 {
    public static void main (String args[]){
        clear.limpar();
        String salario;
        float ordenado;

        salario = JOptionPane.showInputDialog(" Informe seu salário: ");

        ordenado = Float.parseFloat(salario);

        JOptionPane.showMessageDialog(null," Com o aumento de 10% ficou: " + (ordenado * 1.10),"reais", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }    
}
