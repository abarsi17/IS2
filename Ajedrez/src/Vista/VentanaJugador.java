/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import javax.swing.JFrame;

/**
 *
 * @author ivana
 */
public class VentanaJugador extends javax.swing.JFrame
{
    private Usuario_FACADE usuario;
    private Administrador_FACADE admin;

    /**
     * Creates new form VentanaJugador
     */
    public VentanaJugador(Usuario_FACADE usuario, Administrador_FACADE admin)
    {
        initComponents();
        this.usuario = usuario;
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        ReservarSedeEntr = new javax.swing.JButton();
        AsignarResponsable = new javax.swing.JButton();
        InscribirseTorneo = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("JUGADOR");

        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ReservarSedeEntr.setText("Reservar sede para entrenamiento");
        ReservarSedeEntr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarSedeEntrActionPerformed(evt);
            }
        });

        AsignarResponsable.setText("Asignar responsable a los infantiles");
        AsignarResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarResponsableActionPerformed(evt);
            }
        });

        InscribirseTorneo.setText("Inscribirse a un torneo");
        InscribirseTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscribirseTorneoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AsignarResponsable))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ReservarSedeEntr))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(InscribirseTorneo)))
                .addGap(22, 214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(ReservarSedeEntr)
                .addGap(18, 18, 18)
                .addComponent(AsignarResponsable)
                .addGap(18, 18, 18)
                .addComponent(InscribirseTorneo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login log = new Login(usuario);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ReservarSedeEntrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarSedeEntrActionPerformed
        ReservarSedeEntr resSede = new ReservarSedeEntr(this, usuario, admin);
        resSede.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReservarSedeEntrActionPerformed

    private void AsignarResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarResponsableActionPerformed
        ResponsableInfantiles respoInf = new ResponsableInfantiles(this, usuario, admin);
        respoInf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AsignarResponsableActionPerformed

    private void InscribirseTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirseTorneoActionPerformed
        BuscarTorneo insTorneo = new BuscarTorneo(this, usuario, admin);
        insTorneo.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_InscribirseTorneoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AsignarResponsable;
    private javax.swing.JButton InscribirseTorneo;
    private javax.swing.JButton ReservarSedeEntr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
