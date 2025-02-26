// Programa que calcula o aumento de 10%
/// A emtrada e saída são por caixa de diálogo;
/// Aula1

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main (String args[]){
        String salario;
        float ordenado;
        //Scanner sc = new Scanner(System.in);

        salario = JOptionPane.showInputDialog(" Informe seu salário: ");

        //ordenado = sc.nextFloat();
        ordenado = Float.parseFloat(salario);

        JOptionPane.showMessageDialog(null," Com o aumento de 10% ficou: " + (ordenado * 1.10),"reais", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }    
}
