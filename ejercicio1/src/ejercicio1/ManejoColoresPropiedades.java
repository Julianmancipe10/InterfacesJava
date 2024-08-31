package ejercicio1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManejoColoresPropiedades {

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Manejo de Colores y Propiedades de Etiquetas");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Crear la etiqueta con texto
        JLabel etiTexto = new JLabel("Texto de Ejemplo", SwingConstants.CENTER);
        etiTexto.setBounds(150, 50, 200, 50);
        etiTexto.setOpaque(true);
        etiTexto.setBackground(Color.LIGHT_GRAY);
        frame.add(etiTexto);

        // Crear los botones
        JButton btnAzul = new JButton("Azul");
        btnAzul.setBounds(10, 150, 100, 30);
        frame.add(btnAzul);

        JButton btnRojo = new JButton("Rojo");
        btnRojo.setBounds(120, 150, 100, 30);
        frame.add(btnRojo);

        JButton btnVerde = new JButton("Verde");
        btnVerde.setBounds(230, 150, 100, 30);
        frame.add(btnVerde);

        JButton btnFondoAzul = new JButton("Fondo Azul");
        btnFondoAzul.setBounds(340, 150, 120, 30);
        frame.add(btnFondoAzul);

        JButton btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoRojo.setBounds(10, 190, 120, 30);
        frame.add(btnFondoRojo);

        JButton btnFondoVerde = new JButton("Fondo Verde");
        btnFondoVerde.setBounds(140, 190, 120, 30);
        frame.add(btnFondoVerde);

        JButton btnTransparente = new JButton("Transparente");
        btnTransparente.setBounds(270, 190, 120, 30);
        frame.add(btnTransparente);

        JButton btnOpaca = new JButton("Opaca");
        btnOpaca.setBounds(400, 190, 80, 30);
        frame.add(btnOpaca);

        // Acción para cambiar el color del texto a azul
        btnAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.BLUE);
            }
        });

        // Acción para cambiar el color del texto a rojo
        btnRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.RED);
            }
        });

        // Acción para cambiar el color del texto a verde
        btnVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.GREEN);
            }
        });

        // Acción para cambiar el color de fondo a azul
        btnFondoAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.BLUE);
            }
        });

        // Acción para cambiar el color de fondo a rojo
        btnFondoRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.RED);
            }
        });

        // Acción para cambiar el color de fondo a verde
        btnFondoVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.GREEN);
            }
        });

        // Acción para hacer la etiqueta transparente
        btnTransparente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(false);
            }
        });

        // Acción para hacer la etiqueta opaca
        btnOpaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(true);
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
