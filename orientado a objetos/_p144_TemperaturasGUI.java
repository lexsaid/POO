import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _p144_TemperaturasGUI extends JFrame implements ActionListener {
    
    JPanel p1;
    JLabel lblFarenheit, lblCentigrados, mensaje;
    JTextField txtFarenheit, txtCentigrados;
    JRadioButton rbtFarenheit, rbtCentigrados;
    JButton btnCalcular, btnSalir, btnLimpiar;
    ButtonGroup grpOpciones;

    public static void main(String[] args) {
        
        _p144_TemperaturasGUI ventana = new _p144_TemperaturasGUI();
        ventana.setSize(500, 400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public _p144_TemperaturasGUI(){

        super("Calcular Farenheit o Centigrados");
        setLayout(new FlowLayout());

        p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 2));

        mensaje = new JLabel("escoge uno para calcularlo a Farenheit o Centigrados");
        add(mensaje);

        lblFarenheit = new JLabel("Farenheit");
        p1.add(lblFarenheit);
        txtFarenheit = new JTextField();
        p1.add(txtFarenheit);

        lblCentigrados = new JLabel("Centigrados");
        p1.add(lblCentigrados);
        txtCentigrados = new JTextField();
        p1.add(txtCentigrados);

        rbtFarenheit = new JRadioButton("a Farenheit");
        rbtCentigrados = new JRadioButton("a Centigrados");

        grpOpciones = new ButtonGroup();//este es para seleccionar en un grupo los botones y que se active solo uno a la vez
        grpOpciones.add(rbtFarenheit);
        grpOpciones.add(rbtCentigrados);
        p1.add(rbtFarenheit);
        p1.add(rbtCentigrados);
        
        btnCalcular = new JButton("Calcular");
        p1.add(btnCalcular);

        btnSalir = new JButton("Salir");
        p1.add(btnSalir);

        btnLimpiar = new JButton("Limpiar");
        p1.add(btnLimpiar);

        add(p1);

        btnSalir.addActionListener(this);
        btnCalcular.addActionListener(this);
        btnLimpiar.addActionListener(this);
        rbtCentigrados.addActionListener(this);
        rbtFarenheit.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Cuando cambia la selección del radio button, ajusta la habilitación de los campos de texto
        if (rbtCentigrados.isSelected()) {
            txtCentigrados.setEnabled(false);
            txtFarenheit.setEnabled(true);
        } else if (rbtFarenheit.isSelected()) {
            txtFarenheit.setEnabled(false);
            txtCentigrados.setEnabled(true);
        }
        /////////////////////

        float Centigrados, Farenheit;

        if (e.getSource() == btnSalir){
            dispose();

        }else if(e.getSource() == btnCalcular){

            try{

                if(rbtCentigrados.isSelected()) {

                    Farenheit = Float.parseFloat(txtFarenheit.getText());
                    Centigrados = (Farenheit - 32) * 5/9;
                    txtCentigrados.setText(String.format("%.2f", Centigrados));
                    

                } else if (rbtFarenheit.isSelected()) {
                    
                    Centigrados = Float.parseFloat(txtCentigrados.getText());
                    Farenheit = (Centigrados * 9/5) + 32;
                    txtFarenheit.setText(String.format("%.2f", Farenheit));

                }

            }catch(NumberFormatException ex){

                JOptionPane.showMessageDialog(this, "Ingresa valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }else if(e.getSource() == btnLimpiar){

            txtCentigrados.setText("");
            txtFarenheit.setText("");

        }
        
    }

}
