import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class DeadlockDetection extends javax.swing.JFrame {

 
   public DeadlockDetection() {
      initComponents();
   }

   @SuppressWarnings("unchecked")
        private void initComponents() {
   
      jPanel1 = new javax.swing.JPanel();
      WDbutton = new javax.swing.JButton();
      WDpanel = new javax.swing.JPanel();
      WD = new javax.swing.JLabel();
      WWpanel = new javax.swing.JPanel();
      WW = new javax.swing.JLabel();
      jButton1 = new javax.swing.JButton();
      textField = new javax.swing.JTextField(20);
   
      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      this.setUndecorated(true);
   
   
      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deadlock Detection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); 
   
   
     
   
      WDbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); 
      WDbutton.setText("Enter the time");
      WDbutton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               try{
                  WDbuttonActionPerformed(evt);
               }
               catch(IOException e)
               {
               }
            }
         });
   
   
      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
             .addContainerGap()
             .addGap(32, 32, 32)
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(WDbutton))
             .addContainerGap(77, Short.MAX_VALUE))
         );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
             .addContainerGap()
             .addGap(100, 100, 100)
             .addComponent(WDbutton)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addContainerGap(77, Short.MAX_VALUE))
         );
   
      WDpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "deadlock detector", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
   
      javax.swing.GroupLayout WDpanelLayout = new javax.swing.GroupLayout(WDpanel);
      WDpanel.setLayout(WDpanelLayout);
      WDpanelLayout.setHorizontalGroup(
         WDpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(WDpanelLayout.createSequentialGroup()
             .addContainerGap()
             .addComponent(WD, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
             .addContainerGap())
         );
      WDpanelLayout.setVerticalGroup(
         WDpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(WD, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
         );
   
      add(textField);
      textField.setBounds(50,100,150,20);  
      textField.setSize(200,30);  
   
     
   
      jButton1.setText("Exit");
      jButton1.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton1ActionPerformed(evt);
            }
         });
   
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
             .addGap(32, 32, 32)
             .addComponent(jButton1)
             .addGap(33, 33, 33))
         .addGroup(layout.createSequentialGroup()
             .addGap(25, 25, 25)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGroup(layout.createSequentialGroup()
                     .addComponent(WDpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(27, 27, 27)
                     .addComponent(WWpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
             .addContainerGap(69, Short.MAX_VALUE))
            
         );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addContainerGap()
             .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addGap(36, 36, 36)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(WDpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addComponent(WWpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jButton1))
                     .addGap(26, 26, 26))
         );
   
      layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {WDpanel, WWpanel});
   
      pack();
   }

   private void WDbuttonActionPerformed(java.awt.event.ActionEvent evt) throws IOException  {      
   
      WD.setText(new WaitForGraphClass().WaitForGraph( textField.getText()));
   
   }


   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
      System.exit(0);
   }
   public static void main(String args[]) {
    
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } 
      catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(DeadlockDetection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } 
      catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(DeadlockDetection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } 
      catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(DeadlockDetection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } 
      catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(DeadlockDetection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
   
      java.awt.EventQueue.invokeLater(
         new Runnable() {
            public void run() {
               DeadlockDetection deadlockDetec= new DeadlockDetection();
               deadlockDetec.setVisible(true);
               deadlockDetec.setExtendedState(deadlockDetec.MAXIMIZED_BOTH);
            
            }
         });
   }

   private javax.swing.JLabel WD;
   private javax.swing.JButton WDbutton;
   private javax.swing.JPanel WDpanel;
   private javax.swing.JLabel WW;
   private javax.swing.JPanel WWpanel;
   private javax.swing.JButton jButton1;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JTextField textField;

}

