/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author FAVIO
 */
public class conexion {

    private String url = "jdbc:mysql://localhost:3306/reserva_hotel";
    private String username = "root";
    private String password = "";

    public conexion() {
    }

    public Connection conectar() {
        Connection link = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.username, this.password);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
}
