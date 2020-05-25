/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls;

/**
 *
 * @author Alex
 */
public class Home extends javax.swing.JPanel {

    /**
     * Creates new form Inicio
     */
    public Home() {
        initComponents();
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
        Titulo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jbNueva_categoria = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbNuevo_gasto = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1466, 839));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.backgrounds/HomeBack.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1415, 665));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setPreferredSize(new java.awt.Dimension(1466, 120));

        jLabel5.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 50)); // NOI18N
        jLabel5.setText("Mi Negocio");

        jbNueva_categoria.setBackground(new java.awt.Color(14, 21, 30));
        jbNueva_categoria.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbNueva_categoria.setForeground(new java.awt.Color(255, 255, 255));
        jbNueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/add.png"))); // NOI18N
        jbNueva_categoria.setText("Nueva Venta");
        jbNueva_categoria.setBorder(null);
        jbNueva_categoria.setBorderPainted(false);
        jbNueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNueva_categoriaActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Title/HomeR.png"))); // NOI18N
        jLabel6.setText("Imagen");
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 50));

        jbNuevo_gasto.setBackground(new java.awt.Color(14, 21, 30));
        jbNuevo_gasto.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbNuevo_gasto.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo_gasto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/add.png"))); // NOI18N
        jbNuevo_gasto.setText("Nuevo Gasto");
        jbNuevo_gasto.setBorder(null);
        jbNuevo_gasto.setBorderPainted(false);
        jbNuevo_gasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevo_gastoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 658, Short.MAX_VALUE)
                .addComponent(jbNuevo_gasto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbNueva_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbNueva_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNuevo_gasto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbNueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNueva_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbNueva_categoriaActionPerformed

    private void jbNuevo_gastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevo_gastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbNuevo_gastoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbNueva_categoria;
    private javax.swing.JButton jbNuevo_gasto;
    // End of variables declaration//GEN-END:variables
}
