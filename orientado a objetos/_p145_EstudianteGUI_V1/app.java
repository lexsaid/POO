import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.util.ArrayList;

public class app extends JFrame implements ActionListener {

    ArrayList<Estudiante> datos;
    JMenuBar mbrEstudiante;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla,pnlDatos;
    JDialog jdlAcercaDe;
    JLabel lblDatos,lblNombre,lblEdad,lblPeso,lblCorreo;
    JTextField txtNombre,txtEdad,txtPeso,txtCorreo;
    JScrollPane spane;
    JTable tblDatos;
    DefaultTableModel modelo;
    
    public app(){
        super("actualizacion de datos de un estudiante");

        mbrEstudiante = new JMenuBar();
        setJMenuBar(mbrEstudiante);

        //////////////////////
        mnuArchivo = new JMenu("Archivo");
        mbrEstudiante.add(mnuArchivo);

        smnAbrir = new JMenuItem("Abrir");
        mnuArchivo.add(smnAbrir);
        smnAbrir.addActionListener(this);

        smnGuardar = new JMenuItem("Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);

        mnuArchivo.add(new JSeparator());
        smnSalir = new JMenuItem("Salir");
        mnuArchivo.add(smnSalir);
        smnSalir.addActionListener(this);
        ///////////////////

        ///////////////////////
        mnuAyuda = new JMenu("Ayuda");
        mbrEstudiante.add(mnuAyuda);

        smnAcercade = new JMenuItem("Acerca de ..");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);

        jdlAcercaDe = new JDialog(this, "Acerca De");
        jdlAcercaDe.setSize(400,250);
        jdlAcercaDe.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>Programación Oriendada a Objetos I<br>Lex Said Garcia Rodriguez</html>",JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman",Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);
        //////////////

        /////////////////////
        setLayout(new GridLayout(2, 1, 0, 0));

        pnlTabla = new JPanel();
        add(pnlTabla);
        spane = new JScrollPane();
        pnlTabla.add(spane);
        tblDatos = new JTable();
        tblDatos.getTableHeader().setBackground(Color.yellow);
        tblDatos.getTableHeader().setForeground(Color.black);
        spane.setViewportView(tblDatos);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre","Edad","Peso","Correo"});
        tblDatos.setModel(modelo);
        /////////////

        //////////////////////
        pnlDatos = new JPanel();
        add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(4, 2, 0, 0));
        lblNombre = new JLabel("Nombre");
        pnlDatos.add(lblNombre);
        txtNombre = new JTextField();
        pnlDatos.add(txtNombre);
        lblEdad = new JLabel("Edad");
        pnlDatos.add(lblEdad);
        txtEdad = new JTextField();
        pnlDatos.add(txtEdad);
        lblPeso = new JLabel("Peso");
        pnlDatos.add(lblPeso);
        txtPeso = new JTextField();
        pnlDatos.add(txtPeso);
        lblCorreo = new JLabel("Correo:");
        pnlDatos.add(lblCorreo);
        txtCorreo = new JTextField();
        pnlDatos.add(txtCorreo);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        
        } else if(e.getSource()== smnAcercade) {
            jdlAcercaDe.setVisible(true);
        
        }
    }

    public void cargarDatos() {
        
        Object[] obj = new Object[4];
        
        for(int i=0; i<datos.size() ; i++) {
            obj[0] = datos.get(i).getNombre();
            obj[1] = datos.get(i).getEdad();
            obj[2] = datos.get(i).getPeso();
            obj[3] = datos.get(i).getCorreo();
            modelo.addRow(obj);
        }

    }

    public static void main(String[] args) {
        
        app ventana = new app();
        ventana.setBounds(10,10,700, 550);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.datos=Util.inicializarDatos();
        ventana.cargarDatos();

    }
}
