package vista;

import calculos.API_Conversor;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Mariana Toro
 */

public class ConvertidorMonedas extends javax.swing.JPanel {

    /**
     * Creates new form ConvertidorMonedas
     */
    public ConvertidorMonedas() {
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

        tituloM = new javax.swing.JLabel();
        jLabelValor1 = new javax.swing.JLabel();
        valorAConvertir = new javax.swing.JTextField();
        jBoxConvertirDe = new javax.swing.JComboBox<>();
        jLabelValor2 = new javax.swing.JLabel();
        valorConvertido = new javax.swing.JTextField();
        jBoxConvertirA = new javax.swing.JComboBox<>();
        btnConvertir = new javax.swing.JButton();

        setBackground(new java.awt.Color(29, 61, 105));
        setPreferredSize(new java.awt.Dimension(564, 317));

        tituloM.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloM.setForeground(new java.awt.Color(255, 255, 255));
        tituloM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloM.setText("Convertidor De Monedas");

        jLabelValor1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelValor1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor1.setText("Ingrese el valor a convertir");

        valorAConvertir.setBackground(new java.awt.Color(255, 255, 255));
        valorAConvertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorAConvertirKeyTyped(evt);
            }
        });

        jBoxConvertirDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COP", "USD", "EUR", "GBP", "JPY", "KRW" }));

        jLabelValor2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelValor2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor2.setText("Valor convertido");

        valorConvertido.setEditable(false);

        jBoxConvertirA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COP", "USD", "EUR", "GBP", "JPY", "KRW" }));
        jBoxConvertirA.setSelectedIndex(1);
        jBoxConvertirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxConvertirAActionPerformed(evt);
            }
        });

        btnConvertir.setBackground(new java.awt.Color(0, 51, 102));
        btnConvertir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConvertir.setForeground(new java.awt.Color(255, 255, 255));
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValor2)
                    .addComponent(tituloM)
                    .addComponent(jLabelValor1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(valorConvertido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorAConvertir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBoxConvertirDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBoxConvertirA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(tituloM, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelValor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorAConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBoxConvertirDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelValor2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBoxConvertirA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConvertir)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void valorAConvertirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorAConvertirKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_valorAConvertirKeyTyped

    private void jBoxConvertirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxConvertirAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBoxConvertirAActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
     
        if (valorAConvertir.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "No se pueden dejar campos vacios. Por Favor ingresar datos");
        } else {
            try {
                //operción conversión
                API_Conversor operacion = new API_Conversor();
                operacion.sendHttpGETRequest(jBoxConvertirDe.getSelectedItem().toString(), jBoxConvertirA.getSelectedItem().toString(), Double.parseDouble(valorAConvertir.getText()));

                valorConvertido.setText(String.valueOf(operacion.getReq_result()));

            } // por si se  ingresa un valor  no permitido
            catch (NumberFormatException | NullPointerException | IOException exception) {
                JOptionPane.showMessageDialog(null, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnConvertirActionPerformed

//   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JComboBox<String> jBoxConvertirA;
    private javax.swing.JComboBox<String> jBoxConvertirDe;
    private javax.swing.JLabel jLabelValor1;
    private javax.swing.JLabel jLabelValor2;
    private javax.swing.JLabel tituloM;
    private javax.swing.JTextField valorAConvertir;
    private javax.swing.JTextField valorConvertido;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getjBoxConvertirA() {
        return jBoxConvertirA;
    }

    public JComboBox<String> getjBoxConvertirDe() {
        return jBoxConvertirDe;
    }

    public JTextField getValorAConvertir() {
        return valorAConvertir;
    }
    
}
