/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import bean.ConexionRRHHBD;
import bean.Estado_civil;
import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public final class Estado_civiles extends ArrayList <Estado_civil>{

    public Estado_civiles() {
        actualizar();
    }

   
    public void actualizar(){
        this.clear();
        try {
            java.sql.ResultSet rs= ConexionRRHHBD.con.createStatement().executeQuery("select * from catestado_civil");
            while(rs.next()){
                add(new Estado_civil(rs.getInt(1),rs.getString(2)));
              
            }
              rs.close();
        } catch (Exception e) {
        }
    }
}
