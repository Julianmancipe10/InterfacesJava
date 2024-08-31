package ejercicio1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


	
public class TraspasoTexto extends JFrame {
    private JTextField txtTexto;
    private JLabel etiTexto1;
    private JLabel etiTexto2;
    private JButton btnTraspasa1;
    private JButton btnTraspasa2;

    public TraspasoTexto() {
        // Configuración de la ventana principal
        setTitle("Traspaso de Texto");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creación de los componentes
        txtTexto = new JTextField();
        txtTexto.setBounds(50, 30, 200, 25);

        etiTexto1 = new JLabel();
        etiTexto1.setBounds(50, 60, 200, 25);

        etiTexto2 = new JLabel();
        etiTexto2.setBounds(50, 90, 200, 25);

        btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa1.setBounds(50, 120, 100, 25);

        btnTraspasa2 = new JButton("Traspasa 2");
        btnTraspasa2.setBounds(160, 120, 100, 25);

        // Añadir componentes a la ventana
        add(txtTexto);
        add(etiTexto1);
        add(etiTexto2);
        add(btnTraspasa1);
        add(btnTraspasa2);

        // Eventos de los botones
        btnTraspasa1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Copiar el texto del cuadro de texto a la etiqueta 1
                etiTexto1.setText(txtTexto.getText());
            }
        });

        btnTraspasa2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Copiar el texto del cuadro de texto a la etiqueta 2
                etiTexto2.setText(txtTexto.getText());
            }
        });
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        TraspasoTexto ventana = new TraspasoTexto();
        ventana.setVisible(true);
    }
}
