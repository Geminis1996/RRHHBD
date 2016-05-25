/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import bean.ConexionRRHHBD;
import bean.documento;
import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public final class documentos extends ArrayList<documento> {

    public documentos() {
        actualizar();
    }

    public void actualizar() {
        this.clear();
        try {
            java.sql.ResultSet rs = ConexionRRHHBD.con.createStatement().executeQuery("select * from tbldocumento");
            while (rs.next()) {
                add(new documento(rs.getInt(1), rs.getString(2),rs.getString(3)));

            }
            rs.close();
        } catch (Exception e) {
        }
    }
}
