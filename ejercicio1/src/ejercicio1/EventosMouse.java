package ejercicio1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventosMouse {

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Eventos del Mouse");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Crear las etiquetas con palabras
        JLabel etiPal1 = new JLabel("Palabra 1");
        etiPal1.setBounds(20, 20, 100, 25);
        frame.add(etiPal1);

        JLabel etiPal2 = new JLabel("Palabra 2");
        etiPal2.setBounds(20, 50, 100, 25);
        frame.add(etiPal2);

        JLabel etiPal3 = new JLabel("Palabra 3");
        etiPal3.setBounds(20, 80, 100, 25);
        frame.add(etiPal3);

        JLabel etiPal4 = new JLabel("Palabra 4");
        etiPal4.setBounds(20, 110, 100, 25);
        frame.add(etiPal4);

        // Crear la etiqueta "Ocultar" con color de fondo
        JLabel etiOcultar = new JLabel("Ocultar", SwingConstants.CENTER);
        etiOcultar.setBounds(150, 50, 200, 50);
        etiOcultar.setOpaque(true);
        etiOcultar.setBackground(Color.LIGHT_GRAY);
        frame.add(etiOcultar);

        // Añadir eventos del ratón a la etiqueta "Ocultar"
        etiOcultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Ocultar las etiquetas con palabras cuando el ratón entra en "etiOcultar"
                etiPal1.setVisible(false);
                etiPal2.setVisible(false);
                etiPal3.setVisible(false);
                etiPal4.setVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Mostrar las etiquetas con palabras cuando el ratón sale de "etiOcultar"
                etiPal1.setVisible(true);
                etiPal2.setVisible(true);
                etiPal3.setVisible(true);
                etiPal4.setVisible(true);
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
