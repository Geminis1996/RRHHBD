package Colecciones;


import bean.ConexionRRHHBD;
import bean.Departamento;
import java.util.ArrayList;

public final class Departamentos extends ArrayList <Departamento>{

    public Departamentos() {
        actualizar();
    }
    
    
    public void actualizar(){
        this.clear();
        try {
            java.sql.ResultSet rs= ConexionRRHHBD.con.createStatement().executeQuery("select * from catdepartamento");
            while(rs.next()){
                add(new Departamento(rs.getInt(1),rs.getString(2)));
              
            }
              rs.close();
        } catch (Exception e) {
        }
    }
}
