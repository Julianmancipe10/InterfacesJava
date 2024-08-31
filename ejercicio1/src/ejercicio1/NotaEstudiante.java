package ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotaEstudiante {

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Calcular Nota Final");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Crear los cuadros de texto para las notas de los trimestres
        JTextField txtPrimerTrimestre = new JTextField();
        txtPrimerTrimestre.setBounds(150, 30, 100, 25);
        frame.add(txtPrimerTrimestre);

        JTextField txtSegundoTrimestre = new JTextField();
        txtSegundoTrimestre.setBounds(150, 70, 100, 25);
        frame.add(txtSegundoTrimestre);

        JTextField txtTercerTrimestre = new JTextField();
        txtTercerTrimestre.setBounds(150, 110, 100, 25);
        frame.add(txtTercerTrimestre);

        // Crear las etiquetas para mostrar la nota final y el resultado
        JLabel etiNotaFinal = new JLabel("Nota Final:", SwingConstants.CENTER);
        etiNotaFinal.setBounds(50, 150, 100, 25);
        frame.add(etiNotaFinal);

        JLabel etiResultado = new JLabel("", SwingConstants.CENTER);
        etiResultado.setBounds(150, 150, 100, 25);
        frame.add(etiResultado);

        // Crear el botón para calcular la nota final
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 200, 100, 30);
        frame.add(btnCalcular);

        // Acción para calcular la nota final y determinar el resultado
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener las notas de los cuadros de texto
                    double nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
                    double nota2 = Double.parseDouble(txtSegundoTrimestre.getText());
                    double nota3 = Double.parseDouble(txtTercerTrimestre.getText());

                    // Calcular la nota final
                    double notaFinal = (nota1 + nota2 + nota3) / 3;

                    // Mostrar la nota final en la etiqueta correspondiente
                    etiNotaFinal.setText(String.format("Nota Final: %.2f", notaFinal));

                    // Determinar si es APROBADO o SUSPENSO y cambiar colores
                    if (notaFinal < 5) {
                        etiResultado.setText("SUSPENSO");
                        etiNotaFinal.setForeground(Color.RED);
                        etiResultado.setForeground(Color.RED);
                    } else {
                        etiResultado.setText("APROBADO");
                        etiNotaFinal.setForeground(Color.BLACK);
                        etiResultado.setForeground(Color.BLACK);
                    }
                } catch (NumberFormatException ex) {
                    // Manejar el caso en que no se pueda convertir alguna nota a número
                    JOptionPane.showMessageDialog(frame, "Por favor, introduce notas válidas.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
