package ejercicio1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OcultarVisualizarComponentes extends JFrame {
    private JLabel etiNombre;
    private JLabel etiCiudad;
    private JButton btnOcultarNombre;
    private JButton btnVisuNombre;
    private JButton btnOcultarCiudad;
    private JButton btnVisuCiudad;

    public OcultarVisualizarComponentes() {
        // Configuración de la ventana
        setTitle("Ocultar y Visualizar Componentes");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Crear los componentes
        etiNombre = new JLabel("Tu Nombre");
        etiNombre.setBounds(20, 20, 100, 30);

        etiCiudad = new JLabel("Tu Ciudad");
        etiCiudad.setBounds(20, 60, 100, 30);

        btnOcultarNombre = new JButton("Ocultar Nombre");
        btnOcultarNombre.setBounds(150, 20, 130, 30);

        btnVisuNombre = new JButton("Visualizar Nombre");
        btnVisuNombre.setBounds(150, 60, 130, 30);

        btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnOcultarCiudad.setBounds(150, 100, 130, 30);

        btnVisuCiudad = new JButton("Visualizar Ciudad");
        btnVisuCiudad.setBounds(150, 140, 130, 30);

        // Agregar los componentes a la ventana
        add(etiNombre);
        add(etiCiudad);
        add(btnOcultarNombre);
        add(btnVisuNombre);
        add(btnOcultarCiudad);
        add(btnVisuCiudad);

        // Configurar los eventos de los botones
        btnOcultarNombre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiNombre.setVisible(false);
            }
        });

        btnVisuNombre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiNombre.setVisible(true);
            }
        });

        btnOcultarCiudad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiCiudad.setVisible(false);
            }
        });

        btnVisuCiudad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiCiudad.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        OcultarVisualizarComponentes ventana = new OcultarVisualizarComponentes();
        ventana.setVisible(true);
    }
}
