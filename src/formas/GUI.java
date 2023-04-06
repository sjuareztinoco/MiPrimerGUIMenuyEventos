package formas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class GUI {

    public GUI(){
        JFrame ventana =new JFrame();
        ventana.setSize(500,250);
        ventana.setTitle("Clientes");
        ventana.setLocation(250,300);
        //   ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Crear paneles
        JPanel panelGeneral = new JPanel();
        JPanel panelEncabezado = new JPanel();
        JPanel panelBody = new JPanel();
        JPanel panelBotones = new JPanel();

        //Crear los labels (etiquetas)
        JLabel lblEncabezado = new JLabel();
        JLabel lblClave = new JLabel();
        JLabel lblNombre = new JLabel();
        JLabel lblDireccion = new JLabel();
        JLabel lblCiudad = new JLabel();
        JLabel lblEstado = new JLabel();

        //Asignar valores a los labels
        lblEncabezado.setText("ENCABEZADO");
        lblClave.setText("Clave:");
        lblNombre.setText("Nombre:");
        lblDireccion.setText("Direccion:");
        lblCiudad.setText("Ciudad:");
        lblEstado.setText("Estado:");

        //Crear JTextFields
        JTextField jtfClave = new JTextField(5);
        JTextField jtfNombre = new JTextField(30);
        JTextField jtfDireccion = new JTextField(30);

        //Crear ComboBox
        JComboBox cmbCiudad = new JComboBox();

        String [] lista = {"Veracruz","Morelos","Quintana Roo","CdMx"};
        JComboBox cmbEstado = new JComboBox(lista);

        //Asignar items al combobox
        cmbCiudad.addItem("Veracruz");
        cmbCiudad.addItem("Xalapa");
        cmbCiudad.addItem("Cancun");
        cmbCiudad.addItem("Cuautla");
        cmbCiudad.addItem("CdMx");

        //Agregar una JTextArea
        JTextArea jtxaDocumento = new JTextArea();


        //Crear los botones
        JButton jbtnAceptar = new JButton("Aceptar");
        JButton jbtnCancelar = new JButton("Cancelar");
        JButton jbtnSalir = new JButton("Salir");

        //Más componentes
        JCheckBox chkbEstudiante = new JCheckBox();
        chkbEstudiante.setText("Estudiante");
        JCheckBox chkbBecado = new JCheckBox();
        chkbBecado.setText("Becado");

        //Asociar cada componente con su respectivo JPanel
        panelEncabezado.add(lblEncabezado);

        GridBagLayout gbl1 = new GridBagLayout();
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.fill=GridBagConstraints.BOTH;
        panelBody.setLayout(gbl1);
        gbc1.gridheight=1;
        gbc1.gridx = 0;
        gbc1.gridwidth=1;
        panelBody.add(lblClave,gbc1);
        gbc1.gridx = 1;
        gbc1.gridwidth=1;
        panelBody.add(jtfClave,gbc1);
        gbc1.gridx = 0;
        gbc1.gridwidth=1;
        panelBody.add(lblNombre,gbc1);
        gbc1.gridx = 1;
        gbc1.gridwidth=2;
        panelBody.add(jtfNombre,gbc1);
        gbc1.gridx = 0;
        gbc1.gridwidth=1;
        panelBody.add(lblDireccion,gbc1);
        gbc1.gridx = 1;
        gbc1.gridwidth=2;
        panelBody.add(jtfDireccion);
        gbc1.gridx = 0;
        gbc1.gridwidth=1;
        panelBody.add(lblCiudad,gbc1);
        gbc1.gridx = 1;
        gbc1.gridwidth=1;
        panelBody.add(cmbCiudad,gbc1);
        gbc1.gridx = 0;
        gbc1.gridwidth=1;
        panelBody.add(lblEstado,gbc1);
        gbc1.gridx = 1;
        gbc1.gridwidth=1;
        panelBody.add(cmbEstado,gbc1);
        gbc1.gridx = 1;
        gbc1.gridwidth=2;
        panelBody.add(chkbEstudiante,gbc1);
        gbc1.gridx = 1;
        gbc1.gridwidth=2;
        panelBody.add(chkbBecado,gbc1);
        gbc1.gridx = 0;
        gbc1.gridwidth = 2;
        gbc1.gridheight = 2;
        panelBody.add(jtxaDocumento,gbc1);

        panelBotones.setLayout(new GridLayout(1,3));
        panelBotones.add(jbtnAceptar);
        panelBotones.add(jbtnCancelar);
        panelBotones.add(jbtnSalir);

        //Integrar paneles
        panelGeneral.setLayout(new BorderLayout());
        panelGeneral.add(panelEncabezado, BorderLayout.NORTH);
        panelGeneral.add(panelBody, BorderLayout.CENTER);
        panelGeneral.add(panelBotones, BorderLayout.SOUTH);

        //Integral el panel general en el JFrame
        ventana.add(panelGeneral);

        ventana.setVisible(true);


        //Programación de eventos sobre los botones
        jbtnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "El Listener del botón aceptar está trabajando");
            }
        });

        jbtnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "El Listener del botón cancelar está trabajando");
            }
        });

        jbtnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
            }
        });

        jtfNombre.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfNombre.setToolTipText("Teclee nombre");
                jtfNombre.setBackground(Color.pink);
            }

            @Override
            public void focusLost(FocusEvent e) {
                jtfNombre.setBackground(Color.white);
            }
        });

        cmbCiudad.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                cmbCiudad.setBackground(Color.green);
            }

            @Override
            public void focusLost(FocusEvent e) {
                cmbCiudad.setBackground(Color.white);
            }
        });
    }

}
