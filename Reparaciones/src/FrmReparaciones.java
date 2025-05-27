
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alexis
 */
public class FrmReparaciones extends javax.swing.JFrame {

   /**
    * Creates new form FrmReparaciones
    */
   public FrmReparaciones() {
      initComponents();
      inicializarCombos();
   }
    public void inicializarCombos(){
      cmbMarca.addItem("Audi");
      cmbMarca.addItem("Bmw");
      cmbMarca.addItem("Chevrolet");
      cmbMarca.addItem("Dodge");
      cmbMarca.addItem("Fiat");
      cmbMarca.addItem("Ford");
      cmbMarca.addItem("Honda");
      cmbMarca.addItem("Hyundai");
      cmbMarca.addItem("Jeep");
      cmbMarca.addItem("Kia");
      cmbMarca.addItem("Mazda");
      cmbMarca.addItem("Mercedes Benz");
      cmbMarca.addItem("Mitsubishi");
      cmbMarca.addItem("Nissan");
      cmbMarca.addItem("Subaru");
      cmbMarca.addItem("Toyota");
      cmbMarca.addItem("Volkswagen");
      
       cmbMarca.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        actualizarModelos();
    }
});
    
   
    actualizarModelos();
}
private void actualizarModelos() {
    cmbModelo.removeAllItems(); 
    
    String marcaSeleccionada = (String) cmbMarca.getSelectedItem();
    
    if (marcaSeleccionada != null) {
        switch (marcaSeleccionada) {
    case "Audi":
        String[] audi = {"A1", "A3", "A4", "A5", "A6", "A7", "A8", "Q2", "Q3", "Q4 e-tron", "Q5", "Q6 e-tron", "Q7", "Q8",
            "RS Q8", "RS3", "RS5", "RS6", "RS7", "S3", "S4", "S5", "S6", "S7", "S8", "SQ5", "SQ7", "SQ8",
            "SQ8 e-tron", "e-tron GT", "e-tron Q4", "e-tron Q6", "e-tron Q8"};
        for (String modelo : audi) cmbModelo.addItem(modelo);
        break;
    case "Bmw":
        String[] bmw = {"i4", "i5", "iX", "iX3", "Serie 1", "Serie 2", "Serie 3", "Serie 4", "Serie 5", "Serie 7", "Serie 8",
            "X1", "X2", "X3", "X4", "X5", "X6", "X7", "XM", "M2", "M3", "M4", "M5", "M8", "M240i", "M340i",
            "M440i", "M5 CS", "M8 Competition", "Z4"};
        for (String modelo : bmw) cmbModelo.addItem(modelo);
        break;
    case "Chevrolet":
        String[] chevrolet = {"Aveo", "Bolt EV", "Camaro", "Captiva", "Cheyenne", "Equinox", "Malibu", "Onix", "Sail",
            "Silverado", "Sonic", "Spark", "Tracker", "Trailblazer", "Traverse", "Trax"};
        for (String modelo : chevrolet) cmbModelo.addItem(modelo);
        break;
    case "Dodge":
        String[] dodge = {"Charger", "Challenger", "Durango", "Hornet", "Journey", "Magnum", "Nitro", "Ram", "Rebel", "Viper"};
        for (String modelo : dodge) cmbModelo.addItem(modelo);
        break;
    case "Fiat":
        String[] fiat = {"500", "500L", "500X", "Argo", "Cronos", "Punto", "Tipo"};
        for (String modelo : fiat) cmbModelo.addItem(modelo);
        break;
    case "Ford":
        String[] ford = {"Bronco", "Bronco Sport", "EcoSport", "Edge", "Escape", "Expedition", "Explorer", "F-150", "F-250",
            "F-350", "Fiesta", "Focus", "Fusion", "Maverick", "Mustang", "Ranger", "Super Duty", "Transit", "Transit Connect"};
        for (String modelo : ford) cmbModelo.addItem(modelo);
        break;
    case "Honda":
        String[] honda = {"Accord", "Civic", "CR-V", "CR-V Hybrid", "Fit", "HR-V", "Insight", "Passport", "Pilot", "Ridgeline", "Prologue EV"};
        for (String modelo : honda) cmbModelo.addItem(modelo);
        break;
    case "Hyundai":
        String[] hyundai = {"Accent", "Elantra", "Ioniq 5", "Ioniq 6", "Ioniq 7", "Kona", "Kona EV", "Kona N", "Nexo",
            "Palisade", "Santa Cruz", "Santa Fe", "Sonata", "Tucson", "Tucson Hybrid", "Tucson PHEV", "Veloster", "Venue", "Venue N"};
        for (String modelo : hyundai) cmbModelo.addItem(modelo);
        break;
    case "Jeep":
        String[] jeep = {"Cherokee", "Compass", "Grand Cherokee", "Grand Cherokee L", "Grand Wagoneer", "Gladiator",
            "Renegade", "Recon EV", "Wagoneer", "Wrangler"};
        for (String modelo : jeep) cmbModelo.addItem(modelo);
        break;
    case "Kia":
        String[] kia = {"Carens", "Carnival", "EV6", "EV9", "K3", "K4", "K5", "Niro", "Niro EV", "Niro Hybrid", "Seltos",
            "Sorento", "Sorrento Hybrid", "Soul", "Sportage", "Sportage Hybrid", "Stinger", "Telluride"};
        for (String modelo : kia) cmbModelo.addItem(modelo);
        break;
    case "Mazda":
        String[] mazda = {"CX-3", "CX-30", "CX-50", "CX-60", "CX-70", "CX-90", "Mazda2", "Mazda3", "Mazda6", "MX-5 Miata", "MX-30"};
        for (String modelo : mazda) cmbModelo.addItem(modelo);
        break;
    case "Mercedes Benz":
        String[] mercedes = {"A-Class", "B-Class", "CLA", "CLS", "E-Class", "EQB", "EQC", "EQE", "EQS", "GLA", "GLB", "GLC",
            "GLE", "GLS", "Maybach S-Class", "S-Class", "SL", "SLC", "EQS SUV", "AMG GT", "AMG SL", "AMG SLS"};
        for (String modelo : mercedes) cmbModelo.addItem(modelo);
        break;
    case "Mitsubishi":
        String[] mitsubishi = {"Eclipse Cross", "L200", "Mirage", "Montero Sport", "Outlander", "Outlander PHEV", "Xpander"};
        for (String modelo : mitsubishi) cmbModelo.addItem(modelo);
        break;
    case "Nissan":
        String[] nissan = {"Altima", "Armada", "Frontier", "Kicks", "March", "Maxima", "Murano", "Pathfinder", "Sentra", "Titan", "Versa", "X-Trail", "Z"};
        for (String modelo : nissan) cmbModelo.addItem(modelo);
        break;
    case "Subaru":
        String[] subaru = {"Ascent", "BRZ", "Crosstrek", "Forester", "Impreza", "Legacy", "Outback", "Solterra", "WRX"};
        for (String modelo : subaru) cmbModelo.addItem(modelo);
        break;
    case "Toyota":
        String[] toyota = {"4Runner", "Avalon", "Camry", "Corolla", "Corolla Cross", "GR 86", "GR Corolla", "GR Supra",
            "Highlander", "Hilux", "Prius", "RAV4", "Sequoia", "Sienna", "Tacoma", "Tundra", "Venza", "Yaris"};
        for (String modelo : toyota) cmbModelo.addItem(modelo);
        break;
    case "Volkswagen":
        String[] vw = {"Arteon", "Atlas", "Beetle", "Bora", "Cross Sport", "Golf", "Golf GTI", "ID.4", "ID. Buzz", "Jetta",
            "Passat", "Polo", "Taigun", "Taos", "Tiguan", "Touareg", "Virtus", "Vento"};
        for (String modelo : vw) cmbModelo.addItem(modelo);
        break;
    default:
        cmbModelo.addItem("Selecciona una marca");
        break;


        }
    }
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
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      txtCliente = new javax.swing.JTextField();
      jLabel6 = new javax.swing.JLabel();
      txtTipoReparacion = new javax.swing.JTextField();
      jLabel7 = new javax.swing.JLabel();
      txtFecha = new javax.swing.JTextField();
      jScrollPane1 = new javax.swing.JScrollPane();
      txtArea = new javax.swing.JTextArea();
      btnAceptar = new javax.swing.JButton();
      cmbMarca = new javax.swing.JComboBox<>();
      cmbModelo = new javax.swing.JComboBox<>();
      cmbYear = new javax.swing.JComboBox<>();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
      jLabel1.setText("Reparaciones");

      jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      jLabel2.setText("Cliente");

      jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      jLabel3.setText("Marca");

      jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      jLabel4.setText("Modelo");

      jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      jLabel5.setText("Año");

      txtCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

      jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      jLabel6.setText("Tipo de reparacion");

      txtTipoReparacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

      jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      jLabel7.setText("Fecha");

      txtFecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

      txtArea.setColumns(20);
      txtArea.setRows(5);
      jScrollPane1.setViewportView(txtArea);

      btnAceptar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
      btnAceptar.setText("Aceptar");
      btnAceptar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAceptarActionPerformed(evt);
         }
      });

      cmbModelo.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cmbModeloActionPerformed(evt);
         }
      });

      cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el año", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(285, 285, 285)
                  .addComponent(jLabel1))
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel2)
                     .addComponent(jLabel3))
                  .addGap(124, 124, 124)
                  .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel4)
                     .addComponent(jLabel5)
                     .addComponent(jLabel6)
                     .addComponent(jLabel7))
                  .addGap(38, 38, 38)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(txtTipoReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addGap(4, 4, 4)
                              .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addComponent(cmbModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(cmbYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(133, 133, 133)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(btnAceptar)))
            .addContainerGap(176, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jLabel1)
                  .addGap(34, 34, 34)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel2)
                     .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(37, 37, 37)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel3)
                     .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(40, 40, 40)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel4)
                     .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(36, 36, 36)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel5)
                     .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(layout.createSequentialGroup()
                  .addGap(113, 113, 113)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(26, 26, 26)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel6)
               .addComponent(txtTipoReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(42, 42, 42)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel7))
            .addGap(18, 18, 18)
            .addComponent(btnAceptar)
            .addContainerGap(24, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
      
        String cliente = txtCliente.getText();
        String marca = (String) cmbMarca.getSelectedItem();
        String modelo = (String) cmbModelo.getSelectedItem();
        String year = (String) cmbYear.getSelectedItem();
        String tipo = txtTipoReparacion.getText();
        String fecha = txtFecha.getText();

        String info = "Cliente: " + cliente + "\n"
                    + "Marca: " + marca + "\n"
                    + "Modelo: " + modelo + "\n"
                    + "Año: " + year + "\n"
                    + "Tipo de reparación: " + tipo + "\n"
                    + "Fecha: " + fecha + "\n";

        txtArea.setText(info);
    

   }//GEN-LAST:event_btnAceptarActionPerformed

   private void cmbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbModeloActionPerformed
   
    cmbModelo.removeAllItems(); 
    
    String marcaSeleccionada = (String) cmbMarca.getSelectedItem();
    
    if (marcaSeleccionada != null) {
        switch (marcaSeleccionada) {
    case "Audi":
        String[] audi = {"A1", "A3", "A4", "A5", "A6", "A7", "A8", "Q2", "Q3", "Q4 e-tron", "Q5", "Q6 e-tron", "Q7", "Q8",
            "RS Q8", "RS3", "RS5", "RS6", "RS7", "S3", "S4", "S5", "S6", "S7", "S8", "SQ5", "SQ7", "SQ8",
            "SQ8 e-tron", "e-tron GT", "e-tron Q4", "e-tron Q6", "e-tron Q8"};
        for (String modelo : audi) cmbModelo.addItem(modelo);
        break;
    case "Bmw":
        String[] bmw = {"i4", "i5", "iX", "iX3", "Serie 1", "Serie 2", "Serie 3", "Serie 4", "Serie 5", "Serie 7", "Serie 8",
            "X1", "X2", "X3", "X4", "X5", "X6", "X7", "XM", "M2", "M3", "M4", "M5", "M8", "M240i", "M340i",
            "M440i", "M5 CS", "M8 Competition", "Z4"};
        for (String modelo : bmw) cmbModelo.addItem(modelo);
        break;
    case "Chevrolet":
        String[] chevrolet = {"Aveo", "Bolt EV", "Camaro", "Captiva", "Cheyenne", "Equinox", "Malibu", "Onix", "Sail",
            "Silverado", "Sonic", "Spark", "Tracker", "Trailblazer", "Traverse", "Trax"};
        for (String modelo : chevrolet) cmbModelo.addItem(modelo);
        break;
    case "Dodge":
        String[] dodge = {"Charger", "Challenger", "Durango", "Hornet", "Journey", "Magnum", "Nitro", "Ram", "Rebel", "Viper"};
        for (String modelo : dodge) cmbModelo.addItem(modelo);
        break;
    case "Fiat":
        String[] fiat = {"500", "500L", "500X", "Argo", "Cronos", "Punto", "Tipo"};
        for (String modelo : fiat) cmbModelo.addItem(modelo);
        break;
    case "Ford":
        String[] ford = {"Bronco", "Bronco Sport", "EcoSport", "Edge", "Escape", "Expedition", "Explorer", "F-150", "F-250",
            "F-350", "Fiesta", "Focus", "Fusion", "Maverick", "Mustang", "Ranger", "Super Duty", "Transit", "Transit Connect"};
        for (String modelo : ford) cmbModelo.addItem(modelo);
        break;
    case "Honda":
        String[] honda = {"Accord", "Civic", "CR-V", "CR-V Hybrid", "Fit", "HR-V", "Insight", "Passport", "Pilot", "Ridgeline", "Prologue EV"};
        for (String modelo : honda) cmbModelo.addItem(modelo);
        break;
    case "Hyundai":
        String[] hyundai = {"Accent", "Elantra", "Ioniq 5", "Ioniq 6", "Ioniq 7", "Kona", "Kona EV", "Kona N", "Nexo",
            "Palisade", "Santa Cruz", "Santa Fe", "Sonata", "Tucson", "Tucson Hybrid", "Tucson PHEV", "Veloster", "Venue", "Venue N"};
        for (String modelo : hyundai) cmbModelo.addItem(modelo);
        break;
    case "Jeep":
        String[] jeep = {"Cherokee", "Compass", "Grand Cherokee", "Grand Cherokee L", "Grand Wagoneer", "Gladiator",
            "Renegade", "Recon EV", "Wagoneer", "Wrangler"};
        for (String modelo : jeep) cmbModelo.addItem(modelo);
        break;
    case "Kia":
        String[] kia = {"Carens", "Carnival", "EV6", "EV9", "K3", "K4", "K5", "Niro", "Niro EV", "Niro Hybrid", "Seltos",
            "Sorento", "Sorrento Hybrid", "Soul", "Sportage", "Sportage Hybrid", "Stinger", "Telluride"};
        for (String modelo : kia) cmbModelo.addItem(modelo);
        break;
    case "Mazda":
        String[] mazda = {"CX-3", "CX-30", "CX-50", "CX-60", "CX-70", "CX-90", "Mazda2", "Mazda3", "Mazda6", "MX-5 Miata", "MX-30"};
        for (String modelo : mazda) cmbModelo.addItem(modelo);
        break;
    case "Mercedes Benz":
        String[] mercedes = {"A-Class", "B-Class", "CLA", "CLS", "E-Class", "EQB", "EQC", "EQE", "EQS", "GLA", "GLB", "GLC",
            "GLE", "GLS", "Maybach S-Class", "S-Class", "SL", "SLC", "EQS SUV", "AMG GT", "AMG SL", "AMG SLS"};
        for (String modelo : mercedes) cmbModelo.addItem(modelo);
        break;
    case "Mitsubishi":
        String[] mitsubishi = {"Eclipse Cross", "L200", "Mirage", "Montero Sport", "Outlander", "Outlander PHEV", "Xpander"};
        for (String modelo : mitsubishi) cmbModelo.addItem(modelo);
        break;
    case "Nissan":
        String[] nissan = {"Altima", "Armada", "Frontier", "Kicks", "March", "Maxima", "Murano", "Pathfinder", "Sentra", "Titan", "Versa", "X-Trail", "Z"};
        for (String modelo : nissan) cmbModelo.addItem(modelo);
        break;
    case "Subaru":
        String[] subaru = {"Ascent", "BRZ", "Crosstrek", "Forester", "Impreza", "Legacy", "Outback", "Solterra", "WRX"};
        for (String modelo : subaru) cmbModelo.addItem(modelo);
        break;
    case "Toyota":
        String[] toyota = {"4Runner", "Avalon", "Camry", "Corolla", "Corolla Cross", "GR 86", "GR Corolla", "GR Supra",
            "Highlander", "Hilux", "Prius", "RAV4", "Sequoia", "Sienna", "Tacoma", "Tundra", "Venza", "Yaris"};
        for (String modelo : toyota) cmbModelo.addItem(modelo);
        break;
    case "Volkswagen":
        String[] vw = {"Arteon", "Atlas", "Beetle", "Bora", "Cross Sport", "Golf", "Golf GTI", "ID.4", "ID. Buzz", "Jetta",
            "Passat", "Polo", "Taigun", "Taos", "Tiguan", "Touareg", "Virtus", "Vento"};
        for (String modelo : vw) cmbModelo.addItem(modelo);
        break;
    default:
        cmbModelo.addItem("Selecciona una marca");
        break;


        }
    }

   }//GEN-LAST:event_cmbModeloActionPerformed

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
         java.util.logging.Logger.getLogger(FrmReparaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(FrmReparaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(FrmReparaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(FrmReparaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new FrmReparaciones().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnAceptar;
   private javax.swing.JComboBox<String> cmbMarca;
   private javax.swing.JComboBox<String> cmbModelo;
   private javax.swing.JComboBox<String> cmbYear;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextArea txtArea;
   private javax.swing.JTextField txtCliente;
   private javax.swing.JTextField txtFecha;
   private javax.swing.JTextField txtTipoReparacion;
   // End of variables declaration//GEN-END:variables
}
