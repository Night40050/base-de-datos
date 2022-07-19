package consultoriodemascotas;

import javax.swing.JOptionPane;

public class Servicios4 extends javax.swing.JFrame {
    Operaciones op = new Operaciones();
    public Servicios4() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelG.setVisible(false);
        panelB.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_mascota = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        panelG = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFE = new javax.swing.JTextField();
        txtHE = new javax.swing.JTextField();
        txtFS = new javax.swing.JTextField();
        txtHS = new javax.swing.JTextField();
        panelB = new javax.swing.JPanel();
        jrbCom = new javax.swing.JRadioButton();
        jrbCor = new javax.swing.JRadioButton();
        jrbUñas = new javax.swing.JRadioButton();
        CheckGuarderia = new javax.swing.JCheckBox();
        CheckBaño = new javax.swing.JCheckBox();
        btnBuscar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Servicios");

        txt_mascota.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txt_mascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mascotaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Mascota:");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Servicios que ofrecemos:");

        Guardar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Fecha Entrada");

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Hora Entrada");

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Fecha Salida");

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setText("Hora Salida");

        txtFE.setText("dd/mm/aaaa");
        txtFE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFEMouseClicked(evt);
            }
        });

        txtHE.setText("hh:mm");
        txtHE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHEMouseClicked(evt);
            }
        });

        txtFS.setText("dd/mm/aaaa");
        txtFS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFSMouseClicked(evt);
            }
        });

        txtHS.setText("hh:mm");
        txtHS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelGLayout = new javax.swing.GroupLayout(panelG);
        panelG.setLayout(panelGLayout);
        panelGLayout.setHorizontalGroup(
            panelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGLayout.createSequentialGroup()
                        .addGroup(panelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(panelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFE, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(txtHE)
                            .addComponent(txtFS)
                            .addComponent(txtHS))))
                .addGap(133, 133, 133))
        );
        panelGLayout.setVerticalGroup(
            panelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jrbCom.setText("Completo(desparacitante)");

        jrbCor.setText("Baño y corte");

        jrbUñas.setText("Baño, corte de pelo, uñas");

        javax.swing.GroupLayout panelBLayout = new javax.swing.GroupLayout(panelB);
        panelB.setLayout(panelBLayout);
        panelBLayout.setHorizontalGroup(
            panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBLayout.createSequentialGroup()
                .addGroup(panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jrbCom))
                    .addGroup(panelBLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jrbCor))
                    .addGroup(panelBLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jrbUñas)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelBLayout.setVerticalGroup(
            panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jrbCom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbCor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbUñas)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        CheckGuarderia.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        CheckGuarderia.setText("Guarderia");
        CheckGuarderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckGuarderiaActionPerformed(evt);
            }
        });

        CheckBaño.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        CheckBaño.setText("Baño");
        CheckBaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBañoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(CheckGuarderia)
                        .addGap(189, 189, 189)
                        .addComponent(CheckBaño))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelG, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(panelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(Guardar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckGuarderia)
                    .addComponent(CheckBaño))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Guardar)))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//verificar entrada buscar mascota
    private void txt_mascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mascotaKeyTyped
       char c = evt.getKeyChar();
       if ((c<'a'  ||  c>'z')  &&  (c<'A'  || c>'Z') &&(c<' ' || c>' '))evt.consume();
    }//GEN-LAST:event_txt_mascotaKeyTyped
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    String fE, hE, fS, hS;
    fE=txtFE.getText();
    hE=txtHE.getText();
    fS=txtFS.getText();
    hS=txtHS.getText();
    String comp, pelo, uñas;
 //comprobar selección   
    if (CheckGuarderia.isSelected()){
       // guardar en bd
        int res = op.insertGua(fE, hE, fS, hS);
        if (res>0){
            JOptionPane.showMessageDialog(null, "Dato insertado");
        }  
    }else{
        if (CheckBaño.isSelected()) {
                if(jrbCom.isSelected()){
                    comp="S";
                }else{
                   comp="N";
                }
                if (jrbCor.isSelected()) {
                    pelo="S";
                }else{
                    pelo="N";
                }
                if (jrbUñas.isSelected()) {
                    uñas="S";
                }else{
                    uñas="N";
                }
            // guardar en bd
            int res = op.insertBa(comp, pelo, uñas);
            if (res>0){
            JOptionPane.showMessageDialog(null, "Dato insertado");
        } 
        }
    }
    }//GEN-LAST:event_GuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void CheckGuarderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckGuarderiaActionPerformed
        panelG.setVisible(true);
    }//GEN-LAST:event_CheckGuarderiaActionPerformed
    private void CheckBañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBañoActionPerformed
        panelB.setVisible(true);
    }//GEN-LAST:event_CheckBañoActionPerformed

    private void txtFEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFEMouseClicked
        txtFE.setText("");
    }//GEN-LAST:event_txtFEMouseClicked
    private void txtHEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHEMouseClicked
        txtHE.setText("");
    }//GEN-LAST:event_txtHEMouseClicked
    private void txtFSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFSMouseClicked
        txtFS.setText("");
    }//GEN-LAST:event_txtFSMouseClicked
    private void txtHSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHSMouseClicked
        txtHS.setText("");
    }//GEN-LAST:event_txtHSMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBaño;
    private javax.swing.JCheckBox CheckGuarderia;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jrbCom;
    private javax.swing.JRadioButton jrbCor;
    private javax.swing.JRadioButton jrbUñas;
    private javax.swing.JPanel panelB;
    private javax.swing.JPanel panelG;
    private javax.swing.JTextField txtFE;
    private javax.swing.JTextField txtFS;
    private javax.swing.JTextField txtHE;
    private javax.swing.JTextField txtHS;
    private javax.swing.JTextField txt_mascota;
    // End of variables declaration//GEN-END:variables
}
