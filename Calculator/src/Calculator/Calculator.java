/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author HP
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    double NumEnter1;
    double NumEnter2;
    double Result;
    String op;
    
    public Calculator() {
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

        jtxtResult = new javax.swing.JTextField();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnPLUS = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnBS = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnMULTIPLY = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnMINUS = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnPOINT = new javax.swing.JButton();
        jbtnEQUAL = new javax.swing.JButton();
        jbtnDIVIDE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 60));

        jbtnDigit8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 74, 70));

        jbtnDigit9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 74, 70));

        jbtnPLUS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPLUS.setText("+");
        jbtnPLUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPLUSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPLUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 74, 70));

        jbtnDigit7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 74, 70));

        jbtnBS.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jbtnBS.setText("⬅ ");
        jbtnBS.setToolTipText("");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 74, 70));

        jbtnCE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 74, 70));

        jbtnC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 74, 70));

        jbtnPM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPM.setText("±");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 74, 70));

        jbtnDigit2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 74, 70));

        jbtnDigit3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 74, 70));

        jbtnMULTIPLY.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnMULTIPLY.setText("*");
        jbtnMULTIPLY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMULTIPLYActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMULTIPLY, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 74, 70));

        jbtnDigit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 74, 70));

        jbtnDigit4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 74, 70));

        jbtnDigit5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 74, 70));

        jbtnDigit6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 74, 70));

        jbtnMINUS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnMINUS.setText("-");
        jbtnMINUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMINUSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMINUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 74, 70));

        jbtnDigit0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 74, 70));

        jbtnPOINT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPOINT.setText(".");
        jbtnPOINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPOINTActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPOINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 74, 70));

        jbtnEQUAL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnEQUAL.setText("=");
        jbtnEQUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEQUALActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEQUAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 74, 70));

        jbtnDIVIDE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDIVIDE.setText("/");
        jbtnDIVIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDIVIDEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDIVIDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 74, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterNumber(String q) 
    {
        String Nums = jtxtResult.getText()+ q ;
        jtxtResult.setText(Nums);
    }
    
    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
        EnterNumber("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
        // TODO add your handling code here:
         jtxtResult.setText("");
         
         String Fn, Sn;
         
         Fn = String.valueOf(NumEnter1);
         Sn = String.valueOf(NumEnter2);
         
         Fn = "";
         Sn = "";
         
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
        // TODO add your handling code here:
        EnterNumber("2");
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
        // TODO add your handling code here:
        EnterNumber("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnPOINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPOINTActionPerformed
        // TODO add your handling code here:
        if(! jtxtResult.getText().contains("."))
        {
            jtxtResult.setText(jtxtResult.getText() + jbtnPOINT.getText());   
        }
    }//GEN-LAST:event_jbtnPOINTActionPerformed

    private void jbtnPLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPLUSActionPerformed
        // TODO add your handling code here:
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "+";
        
    }//GEN-LAST:event_jbtnPLUSActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
        // TODO add your handling code here: 
        EnterNumber("0");
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnEQUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEQUALActionPerformed
        // TODO add your handling code here:
        NumEnter2 = Double.parseDouble(jtxtResult.getText());
        if(op == "+")
        {
            Result = NumEnter1 + NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        
         else if(op == "-")
        {
            Result = NumEnter1 - NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        
         
         else if(op == "*")
        {
            Result = NumEnter1 * NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
         
         else if(op == "/")
        {
            Result = NumEnter1 / NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
    }//GEN-LAST:event_jbtnEQUALActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        // TODO add your handling code here:
         jtxtResult.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
         // TODO add your handling code here:
         double nums = Double.parseDouble(String.valueOf(jtxtResult.getText()));
         nums = nums * (-1);
         jtxtResult.setText(String.valueOf(nums));
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
        // add your handling code here:
        EnterNumber("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
        EnterNumber("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
        // TODO add your handling code here:
        EnterNumber("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
        // TODO add your handling code here:
        EnterNumber("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
        // TODO add your handling code here:
        EnterNumber("1");
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
        // TODO add your handling code here:
        EnterNumber("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDIVIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDIVIDEActionPerformed
        // TODO add your handling code here:
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "/";
    }//GEN-LAST:event_jbtnDIVIDEActionPerformed

    private void jbtnMULTIPLYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMULTIPLYActionPerformed
        // TODO add your handling code here:
          NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "*";
    }//GEN-LAST:event_jbtnMULTIPLYActionPerformed

    private void jbtnMINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMINUSActionPerformed
        // TODO add your handling code here:
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "-";
        
    }//GEN-LAST:event_jbtnMINUSActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
        // TODO add your handling code here:
        String backSp = null;
        if(jtxtResult.getText().length()>0)
        {
            StringBuilder sb = new StringBuilder(jtxtResult.getText());
            sb.deleteCharAt(jtxtResult.getText().length()-1);
            backSp = sb.toString();
            jtxtResult.setText(backSp);
        }
    }//GEN-LAST:event_jbtnBSActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDIVIDE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnEQUAL;
    private javax.swing.JButton jbtnMINUS;
    private javax.swing.JButton jbtnMULTIPLY;
    private javax.swing.JButton jbtnPLUS;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPOINT;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
