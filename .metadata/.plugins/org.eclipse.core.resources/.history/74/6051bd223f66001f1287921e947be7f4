package ejercicio1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConcatenarDatos {

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Concatenar Palabras");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Crear los cuadros de texto
        JTextField txtPalabra1 = new JTextField();
        txtPalabra1.setBounds(50, 30, 130, 25);
        frame.add(txtPalabra1);

        JTextField txtPalabra2 = new JTextField();
        txtPalabra2.setBounds(200, 30, 130, 25);
        frame.add(txtPalabra2);

        // Crear la etiqueta para mostrar el texto concatenado
        JLabel etiTexto = new JLabel("", SwingConstants.CENTER);
        etiTexto.setBounds(50, 70, 280, 25);
        frame.add(etiTexto);

        // Crear el botón para concatenar las palabras
        JButton btnConcatena = new JButton("Concatena");
        btnConcatena.setBounds(150, 110, 100, 30);
        frame.add(btnConcatena);

        // Acción para concatenar las palabras y mostrar el resultado en la etiqueta
        btnConcatena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener las palabras de los cuadros de texto
                String palabra1 = txtPalabra1.getText();
                String palabra2 = txtPalabra2.getText();

                // Concatenar las palabras
                String resultado = palabra1 + palabra2;

                // Mostrar el resultado en la etiqueta
                etiTexto.setText(resultado);
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
