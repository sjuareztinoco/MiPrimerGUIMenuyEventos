package menus;

import formas.EventoMouse;
import formas.EventoTeclado;
import formas.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {
    private JPanel panelVistas;
    private JMenuBar barraMenu;
    private JMenu menuGUIs;
    private JMenuItem itemGUI;
    private JMenuItem itemEventoMouse;
    private JMenuItem itemEventoTeclado;

    private JMenu menuProcesos;
    private JMenuItem itemBackUp;

    public Principal(){
        super("Muestra de GUIs y Eventos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setLocation(400,250);
        //   setResizable(false);
        //    setContentPane(panelVistas);

        barraMenu = new JMenuBar();
        menuGUIs = new JMenu("Interfaces");
        itemGUI = new JMenuItem("GUI");

        itemEventoMouse = new JMenuItem("Evento Mouse");
        //   itemEventoMouse.setActionCommand("menu-admin-esp");
        itemEventoTeclado = new JMenuItem(("Evento Teclado"));
        //itemEventoTeclado.setActionCommand(" ");

        menuProcesos = new JMenu("Procesos");
        itemBackUp = new JMenuItem("BackUp");


        menuGUIs.add(itemGUI);
        menuGUIs.add(itemEventoMouse);
        menuGUIs.add(itemEventoTeclado);

        barraMenu.add(menuGUIs);
        menuProcesos.add(itemBackUp);
        barraMenu.add(menuProcesos);
        this.setJMenuBar(barraMenu);

        setVisible(true);

        // Evento de llamado a la forma GUI
        itemGUI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI();
            }
        });

        itemEventoTeclado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EventoTeclado();
            }
        });

        itemEventoMouse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EventoMouse();
            }
        });
    }

    // public void agregarEventosDeMenu(ControladorMenu controladorMenu) {
    //    this.itemAgregarEspecialidad.addActionListener(controladorMenu);
    //  this.itemAdministrarEspecialidades.addActionListener(controladorMenu);
    // }


}
