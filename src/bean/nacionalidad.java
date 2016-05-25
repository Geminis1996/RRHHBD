/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Enrique
 */
public class nacionalidad {
    private int id;
    private String descripcion;
    private pais Pais;

    public nacionalidad() {
    }

    public nacionalidad(int id, String descripcion, pais Pais) {
        this.id = id;
        this.descripcion = descripcion;
        this.Pais = Pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public pais getPais() {
        return Pais;
    }

    public void setPais(pais Pais) {
        this.Pais = Pais;
    }
    
        public int insertar() {
        int cont = 0;
        try {
            java.sql.PreparedStatement ps = ConexionRRHHBD.getConnection().prepareStatement("insert into "
                    + "catnacionalidad(id_nacionalidad,descripcion,id_pais)values(?,?,?)");
                
               
           /* java.sql.PreparedStatement ps= ConexionRRHHBD.getConnection().prepareStatement("execute in_pais");*/
            ps.setInt(1, id);
            ps.setString(2, descripcion);
            ps.setInt(3, Pais.getId());
            
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
            java.sql.PreparedStatement ps = ConexionRRHHBD.getConnection().prepareStatement("update catnacionalidad "
                    + "set descripcion=?,id_pais=? "
                    + "where id_nacionalidad =?");

            ps.setString(1, descripcion);
            ps.setInt(2, Pais.getId());
            ps.setInt(3, id);
            

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
            java.sql.PreparedStatement ps = ConexionRRHHBD.getConnection().prepareStatement("delete from catnacionalidad "
                    + "where id_nacionalidad=?");

            ps.setInt(1, id);

            cont = ps.executeUpdate();
            ps.close();
            return cont;
        } catch (Exception e) {
        }
        return cont;
    }
}
