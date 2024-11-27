package Vista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import Controlador.Inventario;
import Controlador.Venta;
import Modelo.Boleta;
import Modelo.Impuestos;
import Modelo.Producto;
import java.awt.Menu;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akerux
 */
public class Menu_venta extends javax.swing.JFrame {

    /**
     * Creates new form Menu_venta
     */
    public Menu_venta() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtabl_datos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtext_idProducto = new javax.swing.JTextField();
        jbutt_agregarID = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmenu_IngresarProd_OPC = new javax.swing.JMenuItem();
        jmenu_ActualizarProd = new javax.swing.JMenuItem();
        jmenu_ElimarProd = new javax.swing.JMenuItem();
        jmenu_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BOTI donde el pepe");
        setBackground(new java.awt.Color(102, 51, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        jScrollPane1.setBackground(new java.awt.Color(232, 207, 171));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos Registrados "));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtabl_datos.setBackground(new java.awt.Color(246, 236, 204));
        jtabl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Stock", "Nombre Del Producto", "ID", "Tipo De Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtabl_datos);

        jPanel1.setBackground(new java.awt.Color(236, 222, 199));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso ID Producto"));

        jLabel1.setText("ID Producto");

        jtext_idProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_idProductoActionPerformed(evt);
            }
        });

        jbutt_agregarID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos S-R/ingresar.png"))); // NOI18N
        jbutt_agregarID.setText("Agregar");
        jbutt_agregarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutt_agregarIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtext_idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbutt_agregarID)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtext_idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutt_agregarID))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(246, 236, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos S-R/Captura de pantalla 2024-11-26 210341-Photoroom (1).png"))); // NOI18N
        jButton1.setText("Boleta");
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos S-R/pepe.png"))); // NOI18N

        jMenu1.setText("Opciones");

        jmenu_IngresarProd_OPC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenu_IngresarProd_OPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos S-R/ingresar.png"))); // NOI18N
        jmenu_IngresarProd_OPC.setText("Ingresar Producto");
        jmenu_IngresarProd_OPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_IngresarProd_OPCActionPerformed(evt);
            }
        });
        jMenu1.add(jmenu_IngresarProd_OPC);

        jmenu_ActualizarProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenu_ActualizarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos S-R/update_1.png"))); // NOI18N
        jmenu_ActualizarProd.setText("Actualizar Producto");
        jmenu_ActualizarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_ActualizarProdActionPerformed(evt);
            }
        });
        jMenu1.add(jmenu_ActualizarProd);

        jmenu_ElimarProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenu_ElimarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos S-R/eliminar (1)_1.png"))); // NOI18N
        jmenu_ElimarProd.setText("Eliminar Producto");
        jmenu_ElimarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_ElimarProdActionPerformed(evt);
            }
        });
        jMenu1.add(jmenu_ElimarProd);

        jmenu_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenu_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos S-R/exit.png"))); // NOI18N
        jmenu_salir.setText("Salir");
        jmenu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_salirActionPerformed(evt);
            }
        });
        jMenu1.add(jmenu_salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtext_idProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_idProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_idProductoActionPerformed

    private void jbutt_agregarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutt_agregarIDActionPerformed
        
        int idProducto, stock, precioProducto;
        String nombreProducto, tipoProducto;
        
        Inventario inv = new Inventario();
        DefaultTableModel modelo = (DefaultTableModel) this.jtabl_datos.getModel();
        modelo.setRowCount(0);
        try {
            idProducto = Integer.parseInt(this.jtext_idProducto.getText());
            
        } catch (NumberFormatException e) 
        {
             idProducto = 0;
        }

        if (inv.verificarIdProducto(idProducto)){
            
            System.out.println("existe el prodcuto con la id " + idProducto  );
            Producto prod = inv.buscarIdProducto(idProducto);
            idProducto = prod.getIdProducto();
            stock = prod.getStock();
            precioProducto = prod.getPrecioProducto();
            nombreProducto = prod.getNombreProducto();
            tipoProducto = prod.getTipoProducto();

            modelo.addRow(new Object[]{idProducto, nombreProducto, precioProducto, stock, tipoProducto});
        
        } else{
            System.out.println("Error encontrando el producto");
            JOptionPane.showMessageDialog(null, "Error ingresando producto, ingrese una id valida", "IngresoId", 2);
        }
        
    }//GEN-LAST:event_jbutt_agregarIDActionPerformed

    private void jmenu_IngresarProd_OPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_IngresarProd_OPCActionPerformed
        //con el boton de "crear boleta" podremos llamar esta otra ventana
        Ingresar_producto ingresar = new Ingresar_producto();
        ingresar.setVisible(true);
    }//GEN-LAST:event_jmenu_IngresarProd_OPCActionPerformed

    private void jmenu_ActualizarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_ActualizarProdActionPerformed
        Menu_actualizarProd actualizar = new Menu_actualizarProd();
        actualizar.setVisible(true);
    }//GEN-LAST:event_jmenu_ActualizarProdActionPerformed

    private void jmenu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmenu_salirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int neto;
        LocalDate fechaHoy = LocalDate.now();
        Date fechaSql = Date.valueOf(fechaHoy); // pasa la fecha de hoy a una fecha leible por Sql
        double netoIva;
        
        Venta venta = new Venta();
        //inv.verificarIdProducto(1);
        
        neto = 1000;
        
        double DoubleNeto = neto; // pasa el neto (int) a un double
        netoIva = DoubleNeto * Impuestos.IVA; // le agrega al valor neto el iva
        
        int totalBoleta = (int) netoIva; //convierte el double a int con el (int)
        
        Boleta boleta = new Boleta(0, neto, totalBoleta, fechaSql);
        venta.agregarBoleta(boleta);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jmenu_ElimarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_ElimarProdActionPerformed
        Menu_Eliminar elimnar = new Menu_Eliminar();
        elimnar.setVisible(true);
    }//GEN-LAST:event_jmenu_ElimarProdActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ingresar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_venta().setVisible(true);
            }
        });
        Inventario inv = new Inventario();
        inv.verificarIdProducto(1);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbutt_agregarID;
    private javax.swing.JMenuItem jmenu_ActualizarProd;
    private javax.swing.JMenuItem jmenu_ElimarProd;
    private javax.swing.JMenuItem jmenu_IngresarProd_OPC;
    private javax.swing.JMenuItem jmenu_salir;
    private javax.swing.JTable jtabl_datos;
    private javax.swing.JTextField jtext_idProducto;
    // End of variables declaration//GEN-END:variables
}
