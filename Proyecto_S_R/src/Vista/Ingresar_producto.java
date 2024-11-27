/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Inventario;
import Modelo.Producto;
import Vista.Menu_venta;
import javax.swing.JOptionPane;
import Modelo.Validacion;
/**
 *
 * @author Akerux
 */
public class Ingresar_producto extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar_producto
     */
    public Ingresar_producto() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcomb_tipoProd = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtext_stockProd = new javax.swing.JTextField();
        jtext_precioProd = new javax.swing.JTextField();
        jtext_nombreProd = new javax.swing.JTextField();
        jbutt_ingresarProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 236, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro De Producto\n"));

        jLabel2.setText("Stock");

        jLabel3.setText("Precio");

        jLabel4.setText("Nombre Producto");

        jcomb_tipoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Producto general", "Bebidas", "Vino", "Destilados" }));
        jcomb_tipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomb_tipoProdActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo De Producto");

        jbutt_ingresarProd.setText("Ingresar Producto");
        jbutt_ingresarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutt_ingresarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtext_stockProd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtext_precioProd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtext_nombreProd)
                            .addComponent(jcomb_tipoProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jbutt_ingresarProd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtext_nombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtext_stockProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtext_precioProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcomb_tipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbutt_ingresarProd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbutt_ingresarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutt_ingresarProdActionPerformed
        
        Validacion validar = new Validacion();
        String nombreProducto,tipoProducto;
        int stock,precioProducto;
        int selectedItem; //Tipo de Producto
        
        nombreProducto = this.jtext_nombreProd.getText();
        precioProducto = Integer.parseInt(this.jtext_precioProd.getText());
        stock = Integer.parseInt(this.jtext_stockProd.getText());
        
        selectedItem = jcomb_tipoProd.getSelectedIndex();
        tipoProducto = this.jcomb_tipoProd.getItemAt(selectedItem);
        
        
        
        try {
            if (validar.validarPalabra(nombreProducto)) {
                if (validar.validarCantidad_Mayor_Igual(precioProducto)) {
                    if (validar.validarCantidad_Mayor_Igual(stock)) {
                        
                        Producto prod = new Producto(0, stock, precioProducto, nombreProducto, tipoProducto);
  
                        Inventario inv = new Inventario();
                        inv.agregarProducto(prod);
                        //mensaje para indicar al usuario que la operacion fue exitosa
                        JOptionPane.showMessageDialog(null, "Producto Ingresado con exito", "Ingreso", 1);
               
                    }else{
                        System.out.println("Error ingresando stock");
                        JOptionPane.showMessageDialog(null, "Ingrese una cantidad de stock valida", "Ingreso", 2);
                    }
                }else{
                    System.out.println("Error ingresando precio");
                    JOptionPane.showMessageDialog(null, "Ingrese un precio valido", "Ingreso", 2);
                }
            }else{
                System.out.println("Error ingresando nombre");
                JOptionPane.showMessageDialog(null, "Ingrese un nombre valido", "Ingreso", 2);
            }
        } catch (Exception e) {
        }
        /*
        nombreProducto = this.jtext_nombreProd.getText();
        precioProducto = Integer.parseInt(this.jtext_precioProd.getText());
        stock = Integer.parseInt(this.jtext_stockProd.getText());
        
        selectedItem = jcomb_tipoProd.getSelectedIndex();
        tipoProducto = this.jcomb_tipoProd.getItemAt(selectedItem);
        
        Producto prod = new Producto(0, stock, precioProducto, nombreProducto, tipoProducto);
        
        
        Inventario inv = new Inventario();
        inv.agregarProducto(prod);
        //mensaje para indicar al usuario que la operacion fue exitosa
        JOptionPane.showMessageDialog(null, "Producto Ingresado con exito", "Ingreso", 1);
        */
    }//GEN-LAST:event_jbutt_ingresarProdActionPerformed

    private void jcomb_tipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomb_tipoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomb_tipoProdActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbutt_ingresarProd;
    private javax.swing.JComboBox<String> jcomb_tipoProd;
    private javax.swing.JTextField jtext_nombreProd;
    private javax.swing.JTextField jtext_precioProd;
    private javax.swing.JTextField jtext_stockProd;
    // End of variables declaration//GEN-END:variables
}
