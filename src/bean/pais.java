/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.swing.JOptionPane;

/**
 *
 * @author Enrique
 */
public class pais {

    private int id;
    private String descripcion;

    public pais(String descripcion) {
        this.descripcion = descripcion;
    }

    public pais(int id, String descripcion) {
        super();
        this.id = id;
        this.descripcion = descripcion;
    }

    public pais() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (String.valueOf(id).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe existir un codigo");
        }
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe existir una descripcion");
        }
        this.descripcion = descripcion;
    }

    public int insertar() {
        int cont = 0;
        try {
            java.sql.PreparedStatement ps = ConexionRRHHBD.getConnection().prepareStatement("insert into "
                    + "catpais(id_pais,descripcion)values(?,?)");
                
               
           /* java.sql.PreparedStatement ps= ConexionRRHHBD.getConnection().prepareStatement("execute in_pais");*/
            ps.setInt(1, id);
            ps.setString(2, descripcion);

            cont = ps.executeUpdate();
            ps.close();
            return cont;
        } catch (Exception e) {
        }
        return cont;
    }

    public int actualizar() {
        int cont = 0;
        try {
            java.sql.PreparedStatement ps = ConexionRRHHBD.getConnection().prepareStatement("update catpais "
                    + "set descripcion=? "
                    + "where id_pais =?");

            ps.setString(1, descripcion);
            ps.setInt(2, id);

            cont = ps.executeUpdate();
            ps.close();
            return cont;
        } catch (Exception e) {
        }
        return cont;
    }

    public int eliminar() {
        int cont = 0;
        try {
            java.sql.PreparedStatement ps = ConexionRRHHBD.getConnection().prepareStatement("delete from catpais "
                    + "where id_pais=?");

            ps.setInt(1, id);

            cont = ps.executeUpdate();
            ps.close();
            return cont;
        } catch (Exception e) {
        }
        return cont;
    }
}
