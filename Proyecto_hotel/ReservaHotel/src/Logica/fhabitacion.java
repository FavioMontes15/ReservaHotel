/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Data.vhabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FAVIO
 */
public class fhabitacion {

    private conexion mysql = new conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Numero", "Piso", "Descripcion", "Caracteristicas", "Precio dia", "Estado", "Tipo habitacion"};

        String[] registro = new String[8];

        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from habitacion where piso like '%" + buscar + "%' order by id_habitacion";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id_habitacion");
                registro[1] = rs.getString("num_habitacion");
                registro[2] = rs.getString("piso");
                registro[3] = rs.getString("descripcion");
                registro[4] = rs.getString("caracteristicas");
                registro[5] = rs.getString("precio_dia");
                registro[6] = rs.getString("estado");
                registro[7] = rs.getString("tipo_habitacion");

                totalRegistros++;
                modelo.addRow((registro));
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);

        }
        return modelo;
    }

    public boolean insertar(vhabitacion dts) {
        sSQL = "insert into habitacion (num_habitacion,piso,descripcion,caracteristicas,precio_dia,estado,tipo_habitacion)" + "values (?,?,?,?,?,?,?)";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNum_habitacion());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecio_dia());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipo_habitacion());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    public boolean editar(vhabitacion dts) {
        sSQL = "update habitacion set num_habitacion=?,piso=?,descripcion=?,caracteristicas=?,precio_dia=?,estado=?,tipo_habitacion=? where id_habitacion=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNum_habitacion());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecio_dia());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipo_habitacion());
            pst.setInt(8, dts.getId_habitacion());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(vhabitacion dts) {
        sSQL = "delete from habitacion where id_habitacion=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getId_habitacion());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
