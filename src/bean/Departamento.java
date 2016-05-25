
package bean;

import javax.swing.JOptionPane;

public class Departamento {

    private int id;
    private String descripcion;

    public Departamento(String descripcion) {
        this.descripcion = descripcion;
    }

    public Departamento(int id, String descripcion) {
        super();
        this.id = id;
        this.descripcion = descripcion;
    }

    public Departamento() {
   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(String.valueOf(id).isEmpty()){
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
                    + "catdepartamento(id_departamento,descripcion)values(?,?)");
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
            java.sql.PreparedStatement ps = ConexionRRHHBD.getConnection().prepareStatement("update catdepartamento "
                    + "set descripcion=? "
                    + "where id_departamento =?");
         
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
            java.sql.PreparedStatement ps = ConexionRRHHBD.getConnection().prepareStatement("delete from catdepartamento "
                    + "where id_departamento=?");
         
                       ps.setInt(1, id);

            cont = ps.executeUpdate();
            ps.close();
            return cont;
        } catch (Exception e) {
        }
        return cont;}
}
