import javax.swing.*;

public class Exercise2 {

    public static void main(String[] args) {

        int y = 0;

        JTextArea txtArea;
        txtArea = new JTextArea("");

        int i = 0;



        for (i = 1; i <= 10; i++) {

            y = i * 36;
           JOptionPane.showMessageDialog(null,txtArea + "\n" +i + "\n" + y);

        } //end of for
    } //end of main
}
