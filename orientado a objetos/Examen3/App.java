package Examen3;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener {
    
    ArrayList<Jugador> datos;
    JMenuBar mbrEstudiante;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla;
    static JPanel pnlDatos;
    JPanel pnlBotones;
    JDialog jdlAcercaDe;
    JLabel lblDatos,lblNombre,lblEdad,lblSexo,lblEstadoCivil,lblDescripcion,lblSalario;
    JTextField txtNombre,txtEdad,txtSexo,txtEstadiCivil,txtDescripcion,txtSalario;
    JScrollPane spane;
    JTable tblDatos;
    DefaultTableModel modelo;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar, btnVermas;

    public App(){
        super("Capturador de datos sobre jugadores");

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
        jdlAcercaDe.setSize(500,250);
        jdlAcercaDe.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>Examen III de Programación Oriendada a Objetos I<br>Lex Said Garcia Rodriguez</html>",JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman",Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);
        //////////////

        /////////////////////
        setLayout(new GridLayout(3, 1, 0, 0));

        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla,BoxLayout.X_AXIS));
        add(pnlTabla);
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);
        tblDatos = new JTable();
        tblDatos.getTableHeader().setBackground(Color.black);
        tblDatos.getTableHeader().setForeground(Color.white);
        spane.setViewportView(tblDatos);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre","Edad","Sexo","Estado Civil", "Descripcion", "Salario"});
        tblDatos.setModel(modelo);
        tblDatos.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
            int ren = tblDatos.rowAtPoint(e.getPoint());
            mostrarDatos(ren);
            }
        });
        /////////////

        //////////////////////
        pnlDatos = new JPanel();
        add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(7, 4, 0, 0));

        lblNombre = new JLabel("Nombre ", SwingConstants.RIGHT);
        pnlDatos.add(lblNombre);
        txtNombre = new JTextField();
        pnlDatos.add(txtNombre);

        lblEdad = new JLabel("Edad ", SwingConstants.RIGHT);
        pnlDatos.add(lblEdad);
        txtEdad = new JTextField();
        pnlDatos.add(txtEdad);

        lblSexo = new JLabel("Sexo (H/M) ", SwingConstants.RIGHT);
        pnlDatos.add(lblSexo);
        txtSexo = new JTextField();
        pnlDatos.add(txtSexo);

        lblEstadoCivil = new JLabel("Estado Civil (Casado/Soltero) ", SwingConstants.RIGHT);
        pnlDatos.add(lblEstadoCivil);
        txtEstadiCivil = new JTextField();
        pnlDatos.add(txtEstadiCivil);

        lblDescripcion = new JLabel("Descripcion ", SwingConstants.RIGHT);
        pnlDatos.add(lblDescripcion);
        txtDescripcion = new JTextField();
        pnlDatos.add(txtDescripcion);

        lblSalario = new JLabel("Salario ", SwingConstants.RIGHT);
        pnlDatos.add(lblSalario);
        txtSalario = new JTextField();
        pnlDatos.add(txtSalario);
        ////////

        /////////////
        pnlBotones = new JPanel();

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);

        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);

        btnVermas = new JButton("Ver mas");
        btnVermas.setEnabled(false);
        btnVermas.addActionListener(this);
        pnlBotones.add(btnVermas);
        btnVermas.setEnabled(true);

        add(pnlBotones);
        ///////
    }

    public void cargarDatos() {
        
        DefaultTableModel dm = (DefaultTableModel)tblDatos.getModel();
        while(dm.getRowCount()>0){ 
            dm.removeRow(0);
        }

        Object[] obj = new Object[6];
        
        for(int i=0; i<datos.size() ; i++) {
            obj[0] = datos.get(i).getNombre();
            obj[1] = datos.get(i).getEdad();
            obj[2] = datos.get(i).getSexo();
            obj[3] = datos.get(i).getEstadoCivil();
            obj[4] = datos.get(i).getDescripcion();
            obj[5] = datos.get(i).getSalario();
            modelo.addRow(obj);
        }

    }

    public void mostrarDatos(int ren) {

        txtNombre.setText(datos.get(ren).getNombre());
        txtEdad.setText(Integer.toString((datos.get(ren).getEdad())));
        txtSexo.setText(Character.toString(datos.get(ren).getSexo()));
        txtEstadiCivil.setText(datos.get(ren).getEstadoCivil());
        txtDescripcion.setText(datos.get(ren).getDescripcion());
        txtSalario.setText(Double.toString(datos.get(ren).getSalario()));

    }

    public static void activarCampos(boolean actdes) {

        for (Component cp : pnlDatos.getComponents())
            if(cp instanceof JTextField)
                cp.setEnabled(actdes);
        
    }
    
    public void limpiarCampos() {

        for (Component cp : pnlDatos.getComponents())
            if(cp instanceof JTextField)
                ((JTextField)cp).setText("");
        
    }

    public void guardarCampos() {

        Jugador est = new Jugador();

        est.setNombre( txtNombre.getText() );
        est.setEdad( Integer.parseInt(txtEdad.getText() ));
        est.setSexo( txtSexo.getText().toUpperCase().charAt(0));
        est.setEstadoCivil( txtEstadiCivil.getText().toUpperCase() );
        est.setDescripcion( txtDescripcion.getText() );
        est.setSalario( Double.parseDouble(txtSalario.getText()) );

        datos.add(est);
        cargarDatos();

    }

    public void totales(){

        double totsalario = 0;
        int hombres= 0, mujeres =0, casados = 0, solteros = 0;

        for (Jugador jugador : datos) {
            totsalario = totsalario+ jugador.getSalario();

            char genero = jugador.getSexo();
            
            if (genero == 'H') {
                hombres++;
            } else if (genero == 'M') {
                mujeres++;
            }

            if(jugador.getEstadoCivil().equals("CASADO")){
                casados++;
            }else if(jugador.getEstadoCivil().equals("SOLTERO")){
                solteros++;
            }

        }

        String mensaje = "salarios totales: "+totsalario+"\nhombres: "+hombres+"\nmujeres: "+mujeres+"\nCasados: "+casados+"\nsolteros: "+solteros;

        JOptionPane.showMessageDialog(null, mensaje, "totales", JOptionPane.INFORMATION_MESSAGE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == smnSalir) {
            dispose();
        
        } else if(e.getSource()== smnAcercade) {
            jdlAcercaDe.setVisible(true);
        
        } else if (e.getSource() == smnAbrir) {

            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[]{"dat"}));
            int res = fchArchivo.showOpenDialog(null);
            File archivo = fchArchivo.getSelectedFile();

            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();

                try {
                    datos = Util.desSerializarDatos(arch.getName());
                    this.cargarDatos();
                
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
                
                }
            }

        } else if(e.getSource()== smnGuardar) {

            fchArchivo = new JFileChooser();
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[]{"dat"}));
            
            fchArchivo.setCurrentDirectory(new File("."));
            int res = fchArchivo.showSaveDialog(this);
            File archivo = fchArchivo.getSelectedFile();

            if (res == JFileChooser.APPROVE_OPTION) {
                
                String nombreArchivo = archivo.getName();
                // Agregar la extensión ".dat" al nombre si no la tiene
                if (!nombreArchivo.toLowerCase().endsWith(".dat")) {
                    nombreArchivo += ".dat";
                }
                // Crear un nuevo archivo con el nombre y la extensión
                File arch = new File(fchArchivo.getCurrentDirectory(), nombreArchivo);

                try {
                    Util.serializarDatos(arch.getName(),datos);
                    JOptionPane.showMessageDialog(this, "Datos Grabados en : " + arch.getAbsolutePath(),"Correcto" ,JOptionPane.INFORMATION_MESSAGE);
                
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
                
                }
            }

        } else if(e.getSource()==btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
    
        } else if(e.getSource()==btnGrabar) {
            //////////
            String estadoCivil = txtEstadiCivil.getText().trim().toUpperCase();
            String sexo = txtSexo.getText().trim().toUpperCase();
            String nombre = txtNombre.getText().trim(); 
            String descripcion = txtDescripcion.getText().trim().toUpperCase();

            // Validar el estado civil y el sexo y nombre
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa un nombre.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método actionPerformed
            }
            
            try {
                Integer.parseInt(txtEdad.getText());
                // Verificar cualquier condición adicional sobre la edad si es necesario
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa un valor numérico válido para la edad.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método actionPerformed si la conversión falla
            }
            
            if (!sexo.equals("H") && !sexo.equals("M")) {
                JOptionPane.showMessageDialog(null, "Escribe el sexo como 'H' o 'M'", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!estadoCivil.equals("CASADO") && !estadoCivil.equals("SOLTERO")) {
                JOptionPane.showMessageDialog(null, "Escribe el estado civil como se pide", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Escribe algo en descripcion", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                Integer.parseInt(txtSalario.getText());
                // Verificar cualquier condición adicional sobre la edad si es necesario
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa un valor numérico válido para el salario.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método actionPerformed si la conversión falla
            }
            ///////////////////

            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
    
        } else if(e.getSource()==btnVermas){
            totales();

        }

    }

    public static void main(String[] args) {
        
        App ventana = new App();
        ventana.setBounds(10,10,700, 550);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.datos=Util.inicializarDatos();
        ventana.cargarDatos();
        App.activarCampos(false);
    }

}
