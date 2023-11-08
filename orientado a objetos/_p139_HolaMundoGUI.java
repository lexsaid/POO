import java.awt.Font;
import javax.swing.*;

public class _p139_HolaMundoGUI extends JFrame {

    public _p139_HolaMundoGUI() {

        super("hola mundo en ventana"); // Aquí defines el título que desees

        setLayout(null);
        JLabel lblSaludo=new JLabel("Hola Mundo.");
        lblSaludo.setFont(new Font("Times New Roman",Font.BOLD, 30));
        lblSaludo.setBounds(10,20,300,300);
        add(lblSaludo);
        
    }

    public static void main(String[] args) {

        _p139_HolaMundoGUI ventana = new _p139_HolaMundoGUI();

        ventana.setBounds(100,100,400,300);
        //es para centrar la ventana   ventana.setLocationRelativeTo(true);
        ventana.setSize(720, 720);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
