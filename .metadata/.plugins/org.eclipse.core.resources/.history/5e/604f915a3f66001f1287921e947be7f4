package ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosMouseAsignacion {

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Eventos del Mouse y Asignación de Valores");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Crear un cuadro de texto
        JTextField txtNumero = new JTextField();
        txtNumero.setBounds(50, 200, 300, 30);
        frame.add(txtNumero);

        // Crear las etiquetas con números del 0 al 9
        for (int i = 0; i < 10; i++) {
            JLabel etiqueta = new JLabel(String.valueOf(i), SwingConstants.CENTER);
            etiqueta.setBounds(50 + (i * 30), 50, 30, 30);
            etiqueta.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            frame.add(etiqueta);

            // Añadir evento del mouse a cada etiqueta
            etiqueta.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    // Concatenar el número de la etiqueta al cuadro de texto
                    txtNumero.setText(txtNumero.getText() + etiqueta.getText());
                }
            });
        }

        // Crear un botón para borrar el contenido del cuadro de texto
        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(150, 250, 100, 30);
        frame.add(btnBorrar);

        // Acción para borrar el contenido del cuadro de texto
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumero.setText("");
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
