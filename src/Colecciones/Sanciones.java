/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import bean.ConexionRRHHBD;
import bean.Sancion;
import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public final class Sanciones extends ArrayList<Sancion> {

    public Sanciones() {
        actualizar();
    }

    public void actualizar() {
        this.clear();
        try {
            java.sql.ResultSet rs = ConexionRRHHBD.con.createStatement().executeQuery("select * from catsancion");
            while (rs.next()) {
                add(new Sancion(rs.getInt(1), rs.getString(2)));

            }
            rs.close();
        } catch (Exception e) {
        }
    }
}
