package ejercicio1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventosMousePosicionamiento {

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Eventos del Mouse y Posicionamiento");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Crear la etiqueta con el nombre
        JLabel etiNombre = new JLabel("Mi Nombre", SwingConstants.CENTER);
        etiNombre.setBounds(250, 150, 100, 50);
        etiNombre.setOpaque(true);
        etiNombre.setBackground(Color.CYAN);
        frame.add(etiNombre);

        // Crear los botones
        JButton btnEsquina = new JButton("Esquina");
        btnEsquina.setBounds(10, 300, 100, 30);
        frame.add(btnEsquina);

        JButton btnCentro = new JButton("Centro");
        btnCentro.setBounds(120, 300, 100, 30);
        frame.add(btnCentro);

        JButton btnAgrandar = new JButton("Agrandar");
        btnAgrandar.setBounds(230, 300, 100, 30);
        frame.add(btnAgrandar);

        JButton btnAchicar = new JButton("Achicar");
        btnAchicar.setBounds(340, 300, 100, 30);
        frame.add(btnAchicar);

        // Acción para mover la etiqueta a la esquina
        btnEsquina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiNombre.setLocation(0, 0);
            }
        });

        // Acción para mover la etiqueta al centro
        btnCentro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int centerX = (frame.getWidth() - etiNombre.getWidth()) / 2;
                int centerY = (frame.getHeight() - etiNombre.getHeight()) / 2;
                etiNombre.setLocation(centerX, centerY);
            }
        });

        // Acción para agrandar la etiqueta
        btnAgrandar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int width = etiNombre.getWidth() + 20;
                int height = etiNombre.getHeight() + 10;
                etiNombre.setSize(width, height);
            }
        });

        // Acción para achicar la etiqueta
        btnAchicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int width = etiNombre.getWidth() - 20;
                int height = etiNombre.getHeight() - 10;
                if (width > 0 && height > 0) { // Asegurarse de no hacer la etiqueta demasiado pequeña
                    etiNombre.setSize(width, height);
                }
            }
        });

        // Añadir eventos del ratón a los botones para agrandarlos/achicarlos al pasar el ratón
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JButton button = (JButton) e.getSource();
                button.setSize(button.getWidth() + 20, button.getHeight() + 10);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                JButton button = (JButton) e.getSource();
                button.setSize(button.getWidth() - 20, button.getHeight() - 10);
            }
        };

        btnEsquina.addMouseListener(mouseAdapter);
        btnCentro.addMouseListener(mouseAdapter);
        btnAgrandar.addMouseListener(mouseAdapter);
        btnAchicar.addMouseListener(mouseAdapter);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
