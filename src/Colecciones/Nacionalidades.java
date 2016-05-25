/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import bean.ConexionRRHHBD;
import bean.nacionalidad;
import bean.pais;
import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public class Nacionalidades extends ArrayList<nacionalidad> {

    public Nacionalidades() {
        actualizar();
    }

    public void actualizar() {
        this.clear();
        try {
            java.sql.ResultSet rs = ConexionRRHHBD.con.createStatement().executeQuery("select* from "
                    + "catnacionalidad x,catpais pa "
                    + "where pa.id_pais= x.id_pais");
            while (rs.next()) {
                pais p = new pais(rs.getInt(4), rs.getString(5));
                add(new nacionalidad(rs.getInt(1), rs.getString(2), p));
            }
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
         try {
         try (java.sql.ResultSet rs = ConexionRRHHBD.con.createStatement().executeQuery("select* from "
         + "RRHHBD.catnacionalidad na,catpais pa "
         + "where na.id_pais= pa.id_pais")) {
         while (rs.next()) {
         pais p = new pais(rs.getInt(4), rs.getString(5));
         add(new nacionalidad(rs.getInt(1), rs.getString(2), p));
         System.out.println("www");
         }
         }
         } catch (Exception e) {
         }*/
    }

    public int getmaxID() {
        int i = 0;
        for (nacionalidad obj : this) {
            if (obj.getId() > i) {
                i = obj.getId();
            }
        }
        return i;
    }

    public nacionalidad getnacionalidad(int id) {
        nacionalidad objnacionalidad = null;
        for (nacionalidad obj : this) {
            if (obj.getId() == id) {
                objnacionalidad = obj;
            }
        }
        return objnacionalidad;
    }
}
