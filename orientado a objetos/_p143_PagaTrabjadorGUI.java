import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _p143_PagaTrabjadorGUI extends JFrame implements ActionListener {

    JLabel lblpaga, lblhoras, lblResultado, lblnombre, lblimpuestos;
    JTextField txtpaga, txthoras, txtnombre, txtimpuestos;
    JButton btnCalcular, btnSalir;
    JPanel renglon1, renglon2, renglon3, renglon4;
    JPanel p1;

    public _p143_PagaTrabjadorGUI(){
        
        super("paga trabajador");
        setLayout(new FlowLayout());
        p1 = new JPanel();
        p1.setLayout(new GridLayout(7, 2));


        lblnombre = new JLabel("nombre");
        p1.add(lblnombre);
        txtnombre = new JTextField();
        p1.add(txtnombre);

        lblpaga = new JLabel("paga por hora");
        p1.add(lblpaga);
        txtpaga = new JTextField();
        p1.add(txtpaga);

        lblhoras = new JLabel("horas");
        p1.add(lblhoras);
        txthoras = new JTextField();
        p1.add(txthoras);

        // lblimpuestos = new JLabel("tasa");
        // lblimpuestos.setBounds(10, 80, 200, 30);
        // p1.add(lblimpuestos);
        // txtimpuestos = new JTextField();
        // txtimpuestos.setBounds(80, 80, 200, 30);
        // p1.add(txtimpuestos);

        btnCalcular = new JButton("Calcular");
        p1.add(btnCalcular);

        btnSalir = new JButton("Salir");
        p1.add(btnSalir);

        add(p1);

        btnSalir.addActionListener(this);
        btnCalcular.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String nombre, mensaje;
        float horas, paga; 
        float impuesto, pagabruta, paganeta, tasa;

        if (e.getSource() == btnSalir){
            int respuesta = JOptionPane.showConfirmDialog(this, "deseas salir?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION){
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "ok continuemos", "continuar", JOptionPane.INFORMATION_MESSAGE);
            }

        }else if(e.getSource() == btnCalcular){

            nombre = txtnombre.getText().trim(); // Obtener el nombre y quitar espacios en blanco al inicio y al final

            // Validar que el nombre no esté vacío
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa un nombre.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método actionPerformed
            }

            try {
                horas = Float.parseFloat(txthoras.getText());
                paga = Float.parseFloat(txtpaga.getText());

                // Validar que las horas y la paga sean números válidos
                if (horas <= 0 || paga <= 0) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos positivos para horas y paga.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Sale del método actionPerformed
                }

                tasa = 0.03f;

                pagabruta = horas * paga;
                impuesto = pagabruta * tasa;
                paganeta = pagabruta - impuesto;

                mensaje = "Nombre: " + nombre + "\nPago Bruto: " + pagabruta + "\nImpuestos: " + impuesto + "\nPago Neto: " + paganeta;

                JOptionPane.showMessageDialog(this, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);

                // Reiniciar los campos
                txtnombre.setText("");
                txthoras.setText("");
                txtpaga.setText("");
                txtimpuestos.setText("");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingresa valores numéricos válidos para horas y paga.", "Error", JOptionPane.ERROR_MESSAGE);
            
            }

        }
    }

    public static void main(String[] args) {
        
        _p143_PagaTrabjadorGUI ventana = new _p143_PagaTrabjadorGUI();
        ventana.setSize(500, 400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Container cristal = ventana.getContentPane();
		//cristal.setLayout(new BoxLayout(cristal,BoxLayout.PAGE_AXIS));//esto es para ponerlo de arriba hacia abajo el acomodo

    }

}
