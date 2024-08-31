package ejercicio1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponenteGraficos{

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Ejercicio 4");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Crear los componentes
        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(20, 20, 150, 25);
        frame.add(txtNombre);

        JTextField txtCiudad = new JTextField();
        txtCiudad.setBounds(20, 60, 150, 25);
        frame.add(txtCiudad);

        JLabel txtFrase = new JLabel("");
        txtFrase.setBounds(20, 100, 350, 25);
        frame.add(txtFrase);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(200, 20, 150, 25);
        frame.add(btnAceptar);

        JButton btnDesactivar = new JButton("Desactivar");
        btnDesactivar.setBounds(200, 60, 150, 25);
        frame.add(btnDesactivar);

        JButton btnActivar = new JButton("Activar");
        btnActivar.setBounds(200, 100, 150, 25);
        frame.add(btnActivar);

        // Acción del botón "Aceptar"
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String ciudad = txtCiudad.getText();
                txtFrase.setText("Usted se llama " + nombre + " y vive en " + ciudad + ".");
            }
        });

        // Acción del botón "Desactivar"
        btnDesactivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setEnabled(false);
                txtCiudad.setEnabled(false);
            }
        });

        // Acción del botón "Activar"
        btnActivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setEnabled(true);
                txtCiudad.setEnabled(true);
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}

