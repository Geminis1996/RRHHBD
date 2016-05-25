/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import bean.ConexionRRHHBD;

import bean.rol;
import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public final class Roles extends ArrayList<rol> {

    public Roles() {
        actualizar();
    }

    public void actualizar() {
        this.clear();
        try {
            java.sql.ResultSet rs = ConexionRRHHBD.con.createStatement().executeQuery("select * from catrol");
            while (rs.next()) {
                add(new rol(rs.getInt(1), rs.getString(2)));

            }
            rs.close();
        } catch (Exception e) {
        }
    }
}
