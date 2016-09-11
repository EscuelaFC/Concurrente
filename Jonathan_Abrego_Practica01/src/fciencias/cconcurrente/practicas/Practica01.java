package fciencias.cconcurrente.practicas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author jonathan
 */
public class Practica01 extends javax.swing.JFrame {

    /**
     * Creates new form Practica01
     */
    public Practica01() {
        COUNT_LIMIT = Integer.MAX_VALUE /112;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaPrincipal = new javax.swing.JPanel();
        barra1 = new ProgressBar();
        barra2 = new ProgressBar();
        barra3 = new ProgressBar();
        barra4 = new ProgressBar();
        barra5 = new ProgressBar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        color = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaPrincipal.setBackground(java.awt.Color.white);
        areaPrincipal.setName(""); // NOI18N

        barra1.setBackground(new java.awt.Color(17, 12, 7));
        barra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barra1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout barra1Layout = new javax.swing.GroupLayout(barra1);
        barra1.setLayout(barra1Layout);
        barra1Layout.setHorizontalGroup(
            barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        barra1Layout.setVerticalGroup(
            barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        barra2.setBackground(new java.awt.Color(1, 1, 1));
        barra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barra2MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout barra2Layout = new javax.swing.GroupLayout(barra2);
        barra2.setLayout(barra2Layout);
        barra2Layout.setHorizontalGroup(
            barra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        barra2Layout.setVerticalGroup(
            barra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        barra3.setBackground(new java.awt.Color(14, 11, 7));
        barra3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barra3MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout barra3Layout = new javax.swing.GroupLayout(barra3);
        barra3.setLayout(barra3Layout);
        barra3Layout.setHorizontalGroup(
            barra3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barra3Layout.setVerticalGroup(
            barra3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        barra4.setBackground(new java.awt.Color(17, 12, 7));
        barra4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barra4MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout barra4Layout = new javax.swing.GroupLayout(barra4);
        barra4.setLayout(barra4Layout);
        barra4Layout.setHorizontalGroup(
            barra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barra4Layout.setVerticalGroup(
            barra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );

        barra5.setBackground(new java.awt.Color(7, 6, 5));
        barra5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barra5MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout barra5Layout = new javax.swing.GroupLayout(barra5);
        barra5.setLayout(barra5Layout);
        barra5Layout.setHorizontalGroup(
            barra5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
        barra5Layout.setVerticalGroup(
            barra5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout areaPrincipalLayout = new javax.swing.GroupLayout(areaPrincipal);
        areaPrincipal.setLayout(areaPrincipalLayout);
        areaPrincipalLayout.setHorizontalGroup(
            areaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barra4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaPrincipalLayout.createSequentialGroup()
                        .addComponent(barra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(barra3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(barra1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrincipalLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(barra5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        areaPrincipalLayout.setVerticalGroup(
            areaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(areaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(barra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barra3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barra4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(barra5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jButton1.setText("START");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               Trabajador t = new Trabajador("nacho", barra1);
                Trabajador t2 = new Trabajador("juan", barra2);
                Trabajador t3 = new Trabajador("pepe", barra3);
                Trabajador t4 = new Trabajador("paco", barra4);
                Trabajador t5 = new Trabajador("luz", barra5);
                t.start();
                t2.start();
                t3.start();
                t4.start();
                t5.start();
            }
        });

        jLabel1.setText("Practica01");

        color.setText("Barras");
        color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorMouseClicked(evt);
            }
        });
        jMenuBar1.add(color);

        jMenu2.setText("Fondo");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(areaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(areaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents    

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        jLabel1.setText("Iniciando");
    }//GEN-LAST:event_jButton1MouseClicked

    private void barra1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra1MouseEntered
        // TODO add your handling code here:
        jLabel1.setText("Barra1");
    }//GEN-LAST:event_barra1MouseEntered

    private void barra2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra2MouseEntered
        // TODO add your handling code here:
        jLabel1.setText("Barra2");
    }//GEN-LAST:event_barra2MouseEntered

    private void barra3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra3MouseEntered
        // TODO add your handling code here:
        jLabel1.setText("Barra3");
    }//GEN-LAST:event_barra3MouseEntered

    private void barra4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra4MouseEntered
        // TODO add your handling code here:
        jLabel1.setText("Barra4");
    }//GEN-LAST:event_barra4MouseEntered

    private void barra5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra5MouseEntered
        // TODO add your handling code here:
        jLabel1.setText("Barra5");
    }//GEN-LAST:event_barra5MouseEntered

    private void colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorMouseClicked
        // TODO add your handling code here:
        barra1.setVisible(false);
        barra2.setVisible(false);
        barra3.setVisible(false);
        barra4.setVisible(false);
        barra5.setVisible(false);
    }//GEN-LAST:event_colorMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        areaPrincipal.setBackground(Color.YELLOW);
    }//GEN-LAST:event_jMenu2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Practica01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaPrincipal;
    private javax.swing.JPanel barra1;
    private javax.swing.JPanel barra2;
    private javax.swing.JPanel barra3;
    private javax.swing.JPanel barra4;
    private javax.swing.JPanel barra5;
    private javax.swing.JMenu color;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private long counter;
    private final long COUNT_LIMIT;

    private class Trabajador extends Thread {

        String nombre; //nombre del animal
        int limite;
        JPanel panel;

        public Trabajador(String nombre, JPanel panel) {
            this.nombre = nombre;
            this.panel = panel;
        }

        @Override
        public void run() {
            for (counter = 0; counter < COUNT_LIMIT; counter++) {
                panel.repaint();
            }
            yield();
        }

    }

    private class ProgressBar extends JPanel {

        @Override
        public void paintComponent(Graphics g) {            
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.GREEN);
            g.fillRect(0, 0,
                    (int) (this.getWidth() * (float) counter / COUNT_LIMIT),
                    this.getHeight());
        }

    }
}
