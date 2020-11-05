
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;
import modelo.PersonaDAO;
import vista.Vista;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Mascota;
import modelo.MascotaDAO;
import modelo.Tratamiento;
import modelo.TratamientoDAO;

public class Controlador implements ActionListener {

    PersonaDAO dao = new PersonaDAO();
    MascotaDAO mao = new MascotaDAO();
    TratamientoDAO Tao = new TratamientoDAO();
    Persona p = new Persona();
    Mascota m = new Mascota();
    Tratamiento t = new Tratamiento();
    Vista vista = new Vista();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    DefaultTableModel modelo3 = new DefaultTableModel();

    public Controlador(Vista v) {
        this.vista = v;
        this.vista.btnListar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnEditar.addActionListener(this);
        this.vista.btnOk.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnListar2.addActionListener(this);
        this.vista.btnGuardar2.addActionListener(this);
        this.vista.btnEditar2.addActionListener(this);
        this.vista.btnOk2.addActionListener(this);
        this.vista.btnEliminar2.addActionListener(this);  
        this.vista.btnListar3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnListar) {
            limpiarTabla();
            listar(vista.tabla);
        }
        if (e.getSource() == vista.btnListar2) {
            limpiarTablaMascota();
            listarMascota(vista.tabla2);
        }
     
        if(e.getSource()== vista.btnListar3){
            limpiarTratamiento();
            listarTratamiento(vista.tabla3);
        }
    
        if (e.getSource() == vista.btnGuardar) {
            agregar();
            limpiarTabla();
            listar(vista.tabla);
        }
        if (e.getSource() == vista.btnGuardar2) {
            agregarMascota();
            limpiarTablaMascota();
            listarMascota(vista.tabla2);
        }
        if (e.getSource() == vista.btnEditar) {
            int fila = vista.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila");
            } else {
                int id = Integer.parseInt((String) vista.tabla.getValueAt(fila, 0).toString());
                String nom = (String) vista.tabla.getValueAt(fila, 1);
                String correo = (String) vista.tabla.getValueAt(fila, 2);
                String tel = (String) vista.tabla.getValueAt(fila, 3);
                vista.txtId.setText("" + id);
                vista.txtNombres.setText(nom);
                vista.txtCorreo.setText(correo);
                vista.txtTelefono.setText(tel);
            }
        }
        if (e.getSource() == vista.btnEditar2) {
            int fila = vista.tabla2.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila");
            } else {
                int id = Integer.parseInt(vista.tabla2.getValueAt(fila, 0).toString());
                String mascota = (String) vista.tabla2.getValueAt(fila, 1);
                String tratamiento = (String)vista.tabla2.getValueAt(fila, 2);
                vista.txtIdMascota.setText("" + id);
                vista.txtMascota.setText(mascota);
                vista.txtTratamiento.setText(tratamiento);
            }
        }
        if (e.getSource() == vista.btnOk) {
            Actualizar();
            limpiarTabla();
            listar(vista.tabla);
        }
        if (e.getSource() == vista.btnOk2) {
            ActualizarMascota();
            limpiarTablaMascota();
            listarMascota(vista.tabla2);
        }
        if (e.getSource() == vista.btnEliminar) {
            delete();

            limpiarTabla();
            listar(vista.tabla);
        }
        if (e.getSource() == vista.btnEliminar2) {
            deleteMascota();

            limpiarTablaMascota();
            listarMascota(vista.tabla2);
        }
    }

    public void listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();
        List<Persona> lista = dao.listar();
        Object[] object = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNom();
            object[2] = lista.get(i).getCorreo();
            object[3] = lista.get(i).getTel();
            modelo.addRow(object);
        }
        vista.tabla.setModel(modelo);
    }
    
    public void listarMascota(JTable tabla2) {
        modelo2 = (DefaultTableModel) tabla2.getModel();
        List<Mascota> lista = mao.listarMascota();
        Object[] object = new Object[3];
        for (int k = 0; k < lista.size(); k++) {
            object[0] = lista.get(k).getIdMascota();
            object[1] = lista.get(k).getMascota();
            object[2] = lista.get(k).getTratamiento();
            modelo2.addRow(object);
        }
        vista.tabla2.setModel(modelo2);
    }
  
    private void listarTratamiento(JTable tabla3) {
        modelo3 = (DefaultTableModel) tabla3.getModel();
        List<Tratamiento> lista = Tao.listarTratamiento();
        List<Tratamiento> lista2 = Tao.listarTratamiento2();
        Object[] object = new Object[6];
        for (int t = 0; t < lista.size(); t++) {
            object[0] = lista.get(t).getIdPropietario();
            object[1] = lista.get(t).getPropietario();
            object[2] = lista.get(t).getCorreo();
            object[3] = lista.get(t).getTelefono();
            object[4] = lista2.get(t).getMascota();
            object[5] = lista2.get(t).getTratamiento();

            modelo3.addRow(object);
        }
        vista.tabla3.setModel(modelo3);
    } 
    
    public void agregar() {
        String nom = vista.txtNombres.getText();
        String correo = vista.txtCorreo.getText();
        String tel = vista.txtTelefono.getText();
        p.setNom(nom);
        p.setCorreo(correo);
        p.setTel(tel);
        int r = dao.agregar(p);

        if (r == 1) {
            JOptionPane.showMessageDialog(vista, "Usuario agregado");
        }else{
            JOptionPane.showMessageDialog(vista, "Error");
        }
    }
    private void agregarMascota() {
        int idMascota = Integer.parseInt((String)vista.txtIdMascota.getText().toString());
        String mascota = vista.txtMascota.getText();
        String tratamiento = ((String)vista.txtTratamiento.getText().toString());
        m.setIdMascota(idMascota);
        m.setMascota(mascota);
        m.setTratamiento(tratamiento);
        int k = mao.agregarMascota(m);

        if (k == 1) {
            JOptionPane.showMessageDialog(vista, "Usuario agregado");
        }else{
            JOptionPane.showMessageDialog(vista, "Error");
        }
    }

    public void Actualizar() {
        int id = Integer.parseInt(vista.txtId.getText());
        String nom = vista.txtNombres.getText();
        String correo = vista.txtCorreo.getText();
        String tel = vista.txtTelefono.getText();
        p.setId(id);
        p.setNom(nom);
        p.setCorreo(correo);
        p.setTel(tel);
        int r = dao.actualizar(p);

        if (r == 1) {
            JOptionPane.showMessageDialog(vista, "Usuario Actualizado");
        } else {
            JOptionPane.showMessageDialog(vista, "Error");
        }
    }
    
    public void ActualizarMascota() {
        int idMascota = Integer.parseInt(vista.txtIdMascota.getText());
        String mascota = vista.txtMascota.getText();
        String tratamiento = vista.txtTratamiento.getText();
        m.setIdMascota(idMascota);
        m.setMascota(mascota);
        m.setTratamiento(tratamiento);
        int k = mao.actualizarMascota(m);

        if (k == 1) {
            JOptionPane.showMessageDialog(vista, "Usuario Actualizado");
        } else {
            JOptionPane.showMessageDialog(vista, "Error");
        }
    }

    public void limpiarTabla() {
        for (int i = 0; i < vista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    public void limpiarTablaMascota() {
        for (int k = 0; k < vista.tabla2.getRowCount(); k++) {
            modelo2.removeRow(k);
            k = k - 1;
        }
    }
    public void limpiarTratamiento() {
        for (int k = 0; k < vista.tabla3.getRowCount(); k++) {
            modelo3.removeRow(k);
            k = k - 1;
        }
    }

    public void delete() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar un Usuario");
        } else {
            int id = Integer.parseInt(vista.tabla.getValueAt(fila, 0).toString());
            dao.delete(id);
            JOptionPane.showMessageDialog(vista, "Usuario eliminado");
        }
    }
    public void deleteMascota() {
        int fila = vista.tabla2.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una Mascota");
        } else {
            int id = Integer.parseInt(vista.tabla2.getValueAt(fila, 0).toString());
            mao.deleteMascota(id);
            JOptionPane.showMessageDialog(vista, "Usuario eliminado");
        }
    }

    
}

