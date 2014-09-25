/*
 * GUI.java
 *
 * Created on 27 de junio de 2007, 11:31 AM
 */

package vista;

import control.*;
import java.awt.Cursor;
import java.awt.GraphicsEnvironment;
import java.io.*;
import java.sql.SQLException;
import javax.swing.*;
import java.util.*;
import modelo.Conectar;
import vista.Filtro;

/**
 *
 * @author  admin
 */
public class GUI extends javax.swing.JFrame  {
    
    private String usuarioDspace;
    private String usuarioOlib;
    private String contraseñaDspace;
    private String contraseñaOlib;
    private List urlDspace;
    private List nomUrlDspace;
    private List urlOlib;
    private List nomUrlOlib;
    private List epersonDspace;
    private List ususDspace;
    public  String [] archivos;
    
    /** Creates new form GUI */
    public GUI(List urlOlib, List urlDspace, List nomUrlOlib, List nomUrlDspace, List epersonDspace, List ususDspace) {
        this.urlOlib = urlOlib;
        this.urlDspace = urlDspace;
        this.nomUrlDspace = nomUrlDspace;
        this.nomUrlOlib = nomUrlOlib;
        this.epersonDspace = epersonDspace;
        this.ususDspace = ususDspace;
      
        initComponents();
        
        //Gavarela: por comodidad, la ventana se pone en el centro
        this.setLocationRelativeTo(null);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idColeccion = new javax.swing.JTextField();
        botonBuscaColeccion = new javax.swing.JButton();
        nombreDSpace = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        idEmision = new javax.swing.JTextField();
        botonBuscarEmision = new javax.swing.JButton();
        nombreOlib = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        rutaCarpeta = new javax.swing.JTextField();
        botonExaminarCarpetas = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        log = new javax.swing.JTextArea();
        botonComenzarImportacion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemSalir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        itemAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sincronización OLIB-DSpace");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 760, 520));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                cerrandoVentana(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Colección en DSpace"));

        botonBuscaColeccion.setText("Buscar");
        botonBuscaColeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscaColeccionActionPerformed(evt);
            }
        });

        nombreDSpace.setEditable(false);
        nombreDSpace.setText("Nombre DSpace");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(idColeccion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(nombreDSpace, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(botonBuscaColeccion))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(botonBuscaColeccion)
                .add(idColeccion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(nombreDSpace, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Titulo en OLIB"));
        jPanel2.setName(""); // NOI18N

        botonBuscarEmision.setText("Buscar");
        botonBuscarEmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarEmisionActionPerformed(evt);
            }
        });

        nombreOlib.setEditable(false);
        nombreOlib.setText("Nombre Olib");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(idEmision, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(nombreOlib, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(botonBuscarEmision))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(botonBuscarEmision)
                .add(idEmision, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(nombreOlib, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Carpeta con PDF's"));

        botonExaminarCarpetas.setText("Examinar");
        botonExaminarCarpetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExaminarCarpetasActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(rutaCarpeta, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
            .add(jPanel3Layout.createSequentialGroup()
                .add(botonExaminarCarpetas)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(rutaCarpeta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(botonExaminarCarpetas))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("LOG de la importación"));

        log.setEditable(false);
        log.setColumns(20);
        log.setRows(5);
        jScrollPane1.setViewportView(log);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );

        botonComenzarImportacion.setText("Enviar archivos");
        botonComenzarImportacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarImportacionActionPerformed(evt);
            }
        });

        menuArchivo.setText("Archivo");

        itemSalir.setText("Salir");
        itemSalir.setToolTipText("Fijar usuario, contraseña y el OLIB a conectarse");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(itemSalir);

        jMenuBar1.add(menuArchivo);

        menuAyuda.setText("Ayuda");

        itemAyuda.setText("Temas de ayuda");
        itemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAyudaActionPerformed(evt);
            }
        });
        menuAyuda.add(itemAyuda);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(botonComenzarImportacion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(botonComenzarImportacion)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleName("ID Titulo OLIB");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAyudaActionPerformed
        new Ayuda().setVisible(true);
    }//GEN-LAST:event_itemAyudaActionPerformed

    private void botonComenzarImportacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarImportacionActionPerformed
        String col = getIdColeccion().getText();
        String em = getIdEmision().getText();
        String rut = getRutaCarpeta().getText();
        int valor = 0;
        
        if(col.equals("") || em.equals("") || rut.equals("")){
            JOptionPane.showMessageDialog(this,"No puede dejar ningún campo en blanco","Campos en blanco",JOptionPane.INFORMATION_MESSAGE);           
        }else{
            //antes que nada validar que los ids existan al igual que la ruta
            
            //Gavarela: las cadenas de conexión se están almacenando en Control.
            //String cadenaOlib = (String)urlOlib.get(comboOlib.getSelectedIndex());
            //String cadenaDspace = (String)urlDspace.get(comboDspace.getSelectedIndex());
            
            String cadenaOlib = Ejecutable.getControl().getConexiónOlib();
            String cadenaDspace = Ejecutable.getControl().getConexiónDSpace();
           
            try {
                valor = Ejecutable.getControl().validarDatos(idColeccion.getText(), idEmision.getText(), rutaCarpeta.getText(), cadenaOlib, cadenaDspace);
                switch (valor) {
                    case 3:
                        JOptionPane.showMessageDialog(this, "El ID de colección ingresada no existe en " + nomUrlDspace.get(urlDspace.indexOf(cadenaDspace)), "Colección no valida", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(this, "El ID del titulo ingresado no existe en " + nomUrlDspace.get(urlDspace.indexOf(cadenaDspace)), "Titulo no valido", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(this, "La ruta de carpeta especificada no es valida", "Ruta no valida", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error de conexión. " + ex.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
                Ejecutable.getControl().imprimirLogFisico("Error de conexión. " + ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Hacen falta controladores de Oracle, favor contéctese con soporte. " + ex.getMessage(), "Error de driver", JOptionPane.ERROR_MESSAGE);
                Ejecutable.getControl().imprimirLogFisico("Hacen falta controladores de Oracle, favor contáctese con soporte" + ex.getMessage());
            }
            
            if(valor == 1){
                /*Gavarela: Ya se está conectado a Samba desde la ventana pasada (AccesoServidores)
                // LOGUEO DE SAMBA
                String dspace = (String)nomUrlDspace.get(urlDspace.indexOf(cadenaDspace));
                dspace = Ejecutable.getControl().cortarCadena(dspace);
                new LogeoSamba(dspace).setVisible(true);
                this.setVisible(false);
                // si todo sale bien en LogueoSamba, entonces se llama el método importacion()*/
                
                importacion();
            }           
        }  
    }//GEN-LAST:event_botonComenzarImportacionActionPerformed

    public void importacion(){
        // la importación corre en un hilo separado para no bloquear la ventana
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        
        // impedir cambios en la interfaz miestras corre la importacion
        getBotonBuscaColeccion().setEnabled(false);
        getBotonBuscarEmision().setEnabled(false);
        getBotonExaminarCarpetas().setEnabled(false);
        getBotonComenzarImportacion().setEnabled(false);
        getIdColeccion().setEditable(false);
        getIdEmision().setEditable(false);
        getRutaCarpeta().setEditable(false);
        
        Hilo hilo = new Hilo();
        hilo.start();
    }
    
    private void botonBuscarEmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarEmisionActionPerformed
        try {
            //Gavarela: El usuario y la contraseña vienen de la ventana anterior
            //new LogeoOlib((String)getUrlOlib().get(getComboOlib().getSelectedIndex()),false).setVisible(true);
            //this.setVisible(false);
            
            new ConsultaOLIB(Ejecutable.getControl().getUsuOlib(), Ejecutable.getControl().getPassOlib(), Ejecutable.getControl().getConexiónOlib()).setVisible(true);
            this.setVisible(false);//GEN-LAST:event_botonBuscarEmisionActionPerformed
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Existe un problema con el Driver de Oracle, favor comunicarse con soporte de Biblioteca", "Error de conexión", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error de conexión: "+ex.getMessage(), "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }                                                  

    private void botonBuscaColeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscaColeccionActionPerformed
        //Gavarela: El usuario y la contraseña vienen de la ventana anterior
        //new LogeoDspace((String)getUrlDspace().get(getComboDspace().getSelectedIndex()),false).setVisible(true);
        //this.setVisible(false);
        try {
            new ConsultaDspace(Ejecutable.getControl().getUsuDspace(), Ejecutable.getControl().getPassDspace(), Ejecutable.getControl().getConexiónDSpace()).setVisible(true);
            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Existe un problema con el Driver de Oracle, favor comunicarse con soporte de Biblioteca", "Error de conexión", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error de conexión: "+ex.getMessage(), "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonBuscaColeccionActionPerformed

    private void botonExaminarCarpetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExaminarCarpetasActionPerformed
        // buscar carpeta de trabajo
	JFileChooser fc = new JFileChooser();
	fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint());
	int returnVal;
	do {
            returnVal = fc.showDialog(null, "Abrir");
            if (returnVal == JFileChooser.APPROVE_OPTION) {
            break;
            }
	} while (returnVal == JFileChooser.CANCEL_OPTION);
        
	// Directorio de trabajo
	File directorio = fc.getSelectedFile();
        getRutaCarpeta().setText(directorio.getAbsolutePath());
        // Se obtiene la lista de archivos del directorio cuya extensión sea pdf
        String[] listaArchivos =directorio.list(new Filtro(".pdf"));
        
        try{
         Conectar.archivos= listaArchivos;
        }catch(NullPointerException ex){
          JOptionPane.showMessageDialog(this, "La carpeta debe contener al menos un archivo pdf", "Error de directorio" ,JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_botonExaminarCarpetasActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        //fin de la aplicacion
        //Gavarela: al salir hay que cerrar las conecciones abiertas con el net use
        String instruccion[] = new String[1];
        instruccion[0] = "net use /y Y: /delete";
        int exitVal = Ejecutable.getControl().correrComando(instruccion);
        if (exitVal != 0) {
            JOptionPane.showMessageDialog(this, "No se pudieron cerrar algunas conexiones", "Error de conexión", JOptionPane.ERROR_MESSAGE);
            Ejecutable.getControl().imprimirLogFisico("No se pudieron cerrar algunas conexiones");
        }
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void cerrandoVentana(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cerrandoVentana
        //Gavarela: al salir hay que cerrar las conecciones abiertas con el net use
        String instruccion[] = new String[1];
        instruccion[0] = "net use /y Y: /delete";
        int exitVal = Ejecutable.getControl().correrComando(instruccion);
        if (exitVal != 0) {
            JOptionPane.showMessageDialog(this, "No se pudieron cerrar algunas conexiones", "Error de conexión", JOptionPane.ERROR_MESSAGE);
            Ejecutable.getControl().imprimirLogFisico("No se pudieron cerrar algunas conexiones");
        }
    }//GEN-LAST:event_cerrandoVentana
    
    public static void setNativeLookAndFeel() {
        try {
	      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch(Exception e) {
	      System.out.println("Error setting native LAF: " + e);
	    }
    }

    public javax.swing.JTextField getIdColeccion() {
        return idColeccion;
    }

    public void setIdColeccion(javax.swing.JTextField idColeccion) {
        this.idColeccion = idColeccion;
    }

    public javax.swing.JTextField getIdEmision() {
        return idEmision;
    }

    public void setIdEmision(javax.swing.JTextField idEmision) {
        this.idEmision = idEmision;
    }

    public javax.swing.JTextArea getLog() {
        return log;
    }

    public void setLog(javax.swing.JTextArea log) {
        this.log = log;
    }
    
    public javax.swing.JTextField getRutaCarpeta() {
        return rutaCarpeta;
    }

    public void setRutaCarpeta(javax.swing.JTextField rutaCarpeta) {
        this.rutaCarpeta = rutaCarpeta;
    }

    public List getUsusDspace() {
        return ususDspace;
    }

    public String getUsuarioDspace() {
        return usuarioDspace;
    }

    public String getUsuarioOlib() {
        return usuarioOlib;
    }

    public String getContraseñaDspace() {
        return contraseñaDspace;
    }

    public String getContraseñaOlib() {
        return contraseñaOlib;
    }

    public List getUrlDspace() {
        return urlDspace;
    }

    public List getNomUrlDspace() {
        return nomUrlDspace;
    }

    public List getUrlOlib() {
        return urlOlib;
    }

    public List getNomUrlOlib() {
        return nomUrlOlib;
    }

    public List getEpersonDspace() {
        return epersonDspace;
    }

    public javax.swing.JButton getBotonBuscaColeccion() {
        return botonBuscaColeccion;
    }

    public javax.swing.JButton getBotonBuscarEmision() {
        return botonBuscarEmision;
    }

    public javax.swing.JButton getBotonComenzarImportacion() {
        return botonComenzarImportacion;
    }

    public javax.swing.JButton getBotonExaminarCarpetas() {
        return botonExaminarCarpetas;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscaColeccion;
    private javax.swing.JButton botonBuscarEmision;
    private javax.swing.JButton botonComenzarImportacion;
    private javax.swing.JButton botonExaminarCarpetas;
    private javax.swing.JTextField idColeccion;
    private javax.swing.JTextField idEmision;
    private javax.swing.JMenuItem itemAyuda;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea log;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JTextField nombreDSpace;
    private javax.swing.JTextField nombreOlib;
    private javax.swing.JTextField rutaCarpeta;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getNombreDSpace() {
        return nombreDSpace;
    }

    public javax.swing.JTextField getNombreOlib() {
        return nombreOlib;
    }

    
    
}
