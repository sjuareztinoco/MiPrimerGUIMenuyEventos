package formas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventoMouse extends JFrame
        implements MouseListener, MouseMotionListener {
    private JLabel barraEstado;

    public EventoMouse(){
        super("Demostrador de los eventos de ratón");

        barraEstado = new JLabel();
        getContentPane().add(barraEstado, BorderLayout.SOUTH);

        addMouseListener(this); //escucha sus propios eventos de ratón
        addMouseMotionListener(this); // y de movimientos de ratón

        setSize(500,400);
        setLocation(300,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        barraEstado.setText("Se hizo click en ("+e.getX()+
                ", "+e.getY()+")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        barraEstado.setText("Se oprimió en ("+e.getX()+
                ", "+e.getY()+")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        barraEstado.setText("Se soltó en ("+e.getX()+
                ", "+e.getY()+")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        barraEstado.setText("El ratón entró en ("+e.getX()+
                ", "+e.getY()+")");
        getContentPane().setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        barraEstado.setText("Ratón fuera de la ventana");
        getContentPane().setBackground(Color.WHITE);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        barraEstado.setText("Se arrastró en ("+e.getX()+", "+e.getY()+")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        barraEstado.setText("Se movió en ("+e.getX()+", "+e.getY()+")");
    }
}

