import javax.swing.*;

public class Exercise2 {

    public static void main(String[] args) {

        int y = 0;
        String yAsString;


        JTextArea txtArea = new JTextArea(10,10);

        int i = 0;

        String format = String.format("%-20s\t%-20s\t",i,y);


        for (i = 1; i <= 10; i++) {

            y = i * 36;

        } //end of for


        JOptionPane.showMessageDialog(null,txtArea + Integer.toString(i) ,"test", JOptionPane.INFORMATION_MESSAGE);
    } //end of main
}
