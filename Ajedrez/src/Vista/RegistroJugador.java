/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JFrame;
import Controlador.Administrador;
import Controlador.Usuario;

/**
 *
 * @author amadeo
 */
public class RegistroJugador extends javax.swing.JFrame {
    
    private String nombre;
    private String apellidos;
    private int elo;
    private int categoria;
    private int edad;
    
    private final int Infantil = 0;
    private final int Junior = 1;
    private final int Senior = 2;
    
    private Usuario usuario;
    private Administrador admin;
    
    /**
     * Creates new form RegistroJugador
     */
    public RegistroJugador(JFrame ventana, Administrador admin, Usuario usuario) {
        initComponents();
        this.admin = admin;
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        JtextFieldNombre = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        CrearJug = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Contraseña");

        JtextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        CrearJug.setText("Crear");
        CrearJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearJugActionPerformed(evt);
            }
        });

        jLabel5.setText("Edad");

        jTextFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Volver)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(JtextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jTextFieldApellidos)
                            .addComponent(jTextFieldEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                        .addContainerGap(100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CrearJug)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver)
                    .addComponent(CrearJug))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearJugActionPerformed
     
        nombre = JtextFieldNombre.getText();
        apellidos = jTextFieldApellidos.getText();
        edad = Integer.parseInt(jTextFieldEdad.getText());
        elo = 0;
        
       if(edad <= 15)
           categoria = 0;
       else if(edad > 15 && edad <=18)
           categoria = 1;
       else if(edad > 18)
           categoria = 2;
        
        admin.crearJugador(nombre, apellidos, elo, categoria, edad);
  
        Login log = new Login(admin, usuario);
        log.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_CrearJugActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Login log = new Login(admin, usuario);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void JtextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextFieldNombreActionPerformed
        
    }//GEN-LAST:event_JtextFieldNombreActionPerformed

    private void jTextFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEdadActionPerformed

    private void jTextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearJug;
    private javax.swing.JTextField JtextFieldNombre;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldEdad;
    // End of variables declaration//GEN-END:variables
}
