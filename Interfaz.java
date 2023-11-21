/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofiufiu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoContraseña;
    private JButton botonIniciarSesion;
    private MiniSuper miniSuper;

    public Interfaz() {
        miniSuper = new MiniSuper();

        setLayout(new GridLayout(3, 2));

        add(new JLabel("Usuario:"));
        campoUsuario = new JTextField();
        add(campoUsuario);

        add(new JLabel("Contraseña:"));
        campoContraseña = new JPasswordField();
        add(campoContraseña);

        botonIniciarSesion = new JButton("Iniciar sesión");
        botonIniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String contraseña = new String(campoContraseña.getPassword());

                if (miniSuper.autenticarUsuario(usuario, contraseña)) {
                    System.out.println("Inicio de sesión exitoso.");
                } else {
                    System.out.println("Usuario o contraseña incorrectos.");
                }
            }
        });
        add(botonIniciarSesion);
    }

    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interfaz.pack();
        interfaz.setVisible(true);
    }
}
