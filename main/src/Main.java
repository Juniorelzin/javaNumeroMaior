import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int num;
        int maior = 0;

        for(int i = 0; i < 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Número:"));

            if(num > maior){
                maior = num;
            }

        }
        JOptionPane.showMessageDialog(null,"Número maior: " + maior);

    }
}