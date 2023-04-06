package formas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventoTeclado extends JFrame {
    private int iX;
    private int iY;
    private int diametro;
    private Color elColor;

    public EventoTeclado(){
        super("Eventos de teclado");
        setSize(400,400);
        setBackground(Color.cyan);
        elColor=Color.BLACK;
        diametro=50;
        iX=iY=100;

        addEventos();
        setVisible(true);
    }

    public void paint(Graphics g){
        g.setColor(elColor);
        g.fillOval(iX, iY, diametro, diametro);
        if(elColor==Color.BLUE){
            g.fillRect(iX+100, iY+100, diametro, diametro);
        }
    }

    public void addEventos(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
                //        System.exit(0);
            }
        });
        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                int codigo=e.getKeyCode();
                System.out.println("codigo="+codigo+
                        "  x="+iX+"  y="+iY);
                switch(codigo){
                    case KeyEvent.VK_UP:
                        iY-=5;
                        break;
                    case KeyEvent.VK_DOWN:
                        iY+=5;
                        break;
                    case KeyEvent.VK_RIGHT:
                        iX+=5;
                        if(iX>(400-diametro))
                            iX=400-diametro;
                        break;
                    case KeyEvent.VK_LEFT:
                        iX-=5;
                        if(iX<0)
                            iX=0;
                        break;
                    case KeyEvent.VK_PLUS:
                        if(diametro<200)
                            diametro+=5;
                        break;
                    case KeyEvent.VK_MINUS:
                        if(diametro>10)
                            diametro-=5;
                        break;
                    case KeyEvent.VK_B:
                        elColor = Color.WHITE;
                        break;
                    case KeyEvent.VK_A:
                        elColor = Color.BLUE;
                        break;
                    case KeyEvent.VK_V:
                        elColor = Color.GREEN;
                        break;
                    case KeyEvent.VK_L:
                        elColor = Color.yellow;
                        break;

                }
                repaint();
            }
        });
    }

}
