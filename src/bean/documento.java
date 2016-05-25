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
public class documento {

    private int id;
    private String nivel;
    private String tipo;

    public documento(String nivel, String tipo) {
        this.nivel = nivel;
        this.tipo = tipo;
    }

    public documento(int id, String nivel, String tipo) {
        super();
        this.id = id;
        this.nivel = nivel;
        this.tipo = tipo;
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

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        if (nivel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe existir una descripcion");
        }
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe existir un tipo");
        }
        this.tipo = tipo;
    }

    public int insertar() {
        int cont = 0;
        try {
            java.sql.PreparedStatement ps = ConexionRRHHBD.getConnection().prepareStatement("insert into"
                    + "tbldocumento(id_documento,nivel_doc,tipo_documento)values(?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, nivel);
            ps.setString(3, tipo);
            cont = ps.executeUpdate();
            ps.close();
            return cont;
        } catch (Exception e) {
        }
        return cont;
    }
    public int actualizar(){
        int cont = 0;
        try {
            java.sql.PreparedStatement ps= ConexionRRHHBD.getConnection().prepareStatement("update tbldocumento"
                    + "set nivel_doc=,tipo_doc=?"
                    + "where id_documento=?");
            ps.setString(1, nivel);
            ps.setString(2, tipo);
            ps.setInt(3, id);
            cont = ps.executeUpdate();
            ps.close();
            return cont;
        } catch (Exception e) {
        }
              return cont;  
    }
    public int eliminar(){
        int cont=0;
        try {
            java.sql.PreparedStatement ps= ConexionRRHHBD.getConnection().prepareStatement("delete tbldocumento"
                    + "where id_documento=?");
            ps.setInt(1, id);
            
            cont= ps.executeUpdate();
            ps.close();
            return cont;
        } catch (Exception e) {
        }
        return cont;
    }
}
