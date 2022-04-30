/**
 * Esta clase maneja la ventana y la visualización del juego
 * por ahora no se documenta como está realizada pues para realizar un juego con 
 * un tablero bidimensional se puede jugar unicamente con el archivo ControlJuego
 */
package game;

/**
 *
 * @author arlese.rodriguezp
 */
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Vista extends JFrame implements KeyListener {

    BorderLayout borde = new BorderLayout();
    JLabel mensaje = new JLabel(ControlJuego.getNombreJuego());
    JTextArea tecla = new JTextArea("Presione cualquier tecla para iniciar...");
    JLabel puntaje = new JLabel("Puntaje : 0");

    public Vista() {
        super(ControlJuego.getNombreJuego());
        
        setSize(300, 250);
        setResizable(false);
        ControlJuego.initTablero();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        setLayout(borde);
        tecla.addKeyListener(this);
        tecla.setEnabled(false);
        tecla.setSize(250, 230);
        Font font = new Font("Verdana", Font.BOLD, 12);
        tecla.setFont(font);
        tecla.setForeground(Color.RED);
        tecla.setDisabledTextColor(Color.BLUE);
        add(mensaje, BorderLayout.NORTH);
        add(tecla, BorderLayout.CENTER);
        add(puntaje, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] dario) {
        Vista v = new Vista();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        ControlJuego.mover(e.getKeyChar());
        tecla.setText(ControlJuego.mostrarPantalla());
        int puntos = ControlJuego.getPuntaje();
        boolean gameOver = ControlJuego.getGameOver();
        if (gameOver) {
            JOptionPane.showOptionDialog(null, "Game Over", "Puntuación: " + ControlJuego.getPuntaje(), JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
            System.exit(0);
        }

        puntaje.setText("Puntaje : " + puntos);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
