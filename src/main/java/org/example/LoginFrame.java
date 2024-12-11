package org.example;

// Archivo: LoginFrame.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JLabel lblMensaje;

    public LoginFrame() {
        super("Pantalla de Login");
        initComponents();
    }

    private void initComponents() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        panel.add(new JLabel("Usuario:"));
        txtUsuario = new JTextField();
        panel.add(txtUsuario);

        panel.add(new JLabel("Contraseña:"));
        txtContrasena = new JPasswordField();
        panel.add(txtContrasena);

        JButton btnValidar = new JButton("Validar");
        panel.add(btnValidar);

        lblMensaje = new JLabel("", SwingConstants.CENTER);
        panel.add(lblMensaje);

        add(panel);

        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarCredenciales();
            }
        });
    }

    private void validarCredenciales() {
        String usuario = txtUsuario.getText();
        String contrasena = new String(txtContrasena.getPassword());

        if ("CHACON".equals(usuario) && "CHACON123".equals(contrasena)) {
            lblMensaje.setText("Acceso correcto");
        } else {
            lblMensaje.setText("Datos inválidos");
        }
    }
}
