/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import bean.ConexionRRHHBD;
import bean.pais;
import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public final class paises extends ArrayList<pais> {

    public paises() {
        actualizar();
    }

    public void actualizar() {
        this.clear();
        try {
            java.sql.ResultSet rs = ConexionRRHHBD.con.createStatement().executeQuery("select * from catpais");
            while (rs.next()) {
                add(new pais(rs.getInt(1), rs.getString(2)));

            }
            rs.close();
        } catch (Exception e) {
        }
    }

    public pais getpais(int id) {
        pais p = null;
        for (pais obj : this) {
            if (obj.getId() == id) {
                p = obj;
            }
        }
        return p;
    }
}
