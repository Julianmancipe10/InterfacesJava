package ejercicio1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EventosTeclado extends JFrame {
    private JTextField txtTexto;
    private JLabel etiTexto;
    private JButton btnVaciar;

    public EventosTeclado() {
        // Configuración de la ventana principal
        setTitle("Eventos del Teclado");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creación de los componentes
        txtTexto = new JTextField();
        txtTexto.setBounds(50, 30, 200, 25);

        etiTexto = new JLabel();
        etiTexto.setBounds(50, 60, 200, 25);

        btnVaciar = new JButton("Vaciar");
        btnVaciar.setBounds(100, 100, 100, 25);

        // Añadir componentes a la ventana
        add(txtTexto);
        add(etiTexto);
        add(btnVaciar);

        // Evento keyPressed del cuadro de texto
        txtTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Copiar el texto del cuadro de texto a la etiqueta en tiempo real
                etiTexto.setText(txtTexto.getText());
            }
        });

        // Evento actionPerformed del botón Vaciar
        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Vaciar el texto del cuadro de texto y la etiqueta
                txtTexto.setText("");
                etiTexto.setText("");
            }
        });
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        EventosTeclado ventana = new EventosTeclado();
        ventana.setVisible(true);
    }
}
