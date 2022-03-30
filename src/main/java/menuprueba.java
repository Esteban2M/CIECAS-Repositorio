import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class menuprueba extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    
    DefaultTableModel modelo;
    
    public menuprueba() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.lblimagen1, "src\\main\\java\\imagenes\\logo1.png");
        this.pintarImagen(this.lblimagen2, "src\\main\\java\\imagenes\\logo1.png");
        this.pintarImagen(this.lblimagen3, "src\\main\\java\\imagenes\\logo1.png");
        this.pintarImagen(this.lblimagen4, "src\\main\\java\\imagenes\\logo1.png");
        
        //Modelo de la tabla
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Clave");
        modelo.addColumn("Actividad Académica (Curso)");
        modelo.addColumn("Profesor/a");
        modelo.addColumn("Unidad Académica");
        this.tabla.setModel(modelo);
        
        //Icono del jframe
        
       // setIconImage(getIconImage());
    }
 //icono del jframe
   // @Override
     public Image getIconImage(){
         Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes\\logo1.png"));
         return retValue;
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        titulo1 = new javax.swing.JLabel();
        lblimagen1 = new javax.swing.JLabel();
        SUBTITULO = new javax.swing.JLabel();
        SUBTITULO2 = new javax.swing.JLabel();
        SUBTITULO3 = new javax.swing.JLabel();
        tfnom22 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfapep = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfapem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfcalle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfnoext = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfnoint = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfcolonia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfmunicipioalca = new javax.swing.JTextField();
        tfcp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JCestado = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        JCpais = new javax.swing.JComboBox<>();
        tftelcasa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tftelcelular = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rbmasc = new javax.swing.JRadioButton();
        rbfeme = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        tfcorreo2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfcorreo1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnguardarycontinuar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        tfdiscapacidad = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tflenguaext = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tfnomacade = new javax.swing.JTextField();
        jdfechanaci = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        SUBTITULO5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tfprograma1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tfinstituto1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tfestado1 = new javax.swing.JTextField();
        JDfechagraduacion1 = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        rbespecialidad = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        tfprograma2 = new javax.swing.JTextField();
        tfinstituto2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        tfestado2 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        JDfechagraduacion2 = new com.toedter.calendar.JDateChooser();
        jLabel35 = new javax.swing.JLabel();
        rbmaestria = new javax.swing.JRadioButton();
        tfprograma3 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        tfinstituto3 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        tfestado3 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        JDfechagraduacion3 = new com.toedter.calendar.JDateChooser();
        btguardarantecedentes = new javax.swing.JButton();
        btneditarante = new javax.swing.JButton();
        lblimagen2 = new javax.swing.JLabel();
        titulo5 = new javax.swing.JLabel();
        SUBTITULO11 = new javax.swing.JLabel();
        SUBTITULO12 = new javax.swing.JLabel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        lblimagen3 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        SUBTITULO6 = new javax.swing.JLabel();
        SUBTITULO7 = new javax.swing.JLabel();
        SUBTITULO8 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        rbtiemparcial = new javax.swing.JRadioButton();
        rbtiempcompleto = new javax.swing.JRadioButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        tfclave = new javax.swing.JTextField();
        btnagregartabla = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        tfacticade = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        tfprofe = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        tfunidad = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        tfalumno = new javax.swing.JTextField();
        tfasesor = new javax.swing.JTextField();
        tfjefa = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        JDfecha = new com.toedter.calendar.JDateChooser();
        jLabel52 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btneditarinfo = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneliminardatostabla = new javax.swing.JButton();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        lblimagen4 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        SUBTITULO9 = new javax.swing.JLabel();
        SUBTITULO10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel53 = new javax.swing.JLabel();
        rbacepto = new javax.swing.JRadioButton();
        rbnoacepto = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Solicitud de Inscripción");
        setLocation(new java.awt.Point(60, 0));
        setResizable(false);

        titulo1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("INSTITUTO POLITÉCNICO NACIONAL");
        titulo1.setAutoscrolls(true);

        lblimagen1.setText("Logo 1");

        SUBTITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBTITULO.setText("Secretaría de Investigación y Posgrado Dirección de Posgrado ");
        SUBTITULO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SUBTITULO2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        SUBTITULO2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBTITULO2.setText("SOLICITUD DE INSCRIPCIÓN AL PROGRAMA ACADÉMICO DE POSGRADO");
        SUBTITULO2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SUBTITULO3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        SUBTITULO3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBTITULO3.setText("DATOS DEL SOLICITANTE:");
        SUBTITULO3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tfnom22.setToolTipText("Introduce el nombre");
        tfnom22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnom22ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tfapep.setToolTipText("Introduce el Apellido Paterno");
        tfapep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfapepActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Apellido Paterno");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Apellido Materno");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tfapem.setToolTipText("Introduce el Apellido Materno");
        tfapem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfapemActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Domicilio");

        tfcalle.setToolTipText("Introduce la Calle");
        tfcalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcalleActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Calle");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tfnoext.setToolTipText("Introduce el Numero Exterior");
        tfnoext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnoextActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("No. Ext");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tfnoint.setToolTipText("Introduce el Numero Interior");
        tfnoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnointActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("No. Int");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tfcolonia.setToolTipText("Introduce la Colonia");
        tfcolonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcoloniaActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Colonia");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Municipio / Alcandia");

        tfmunicipioalca.setToolTipText("Introduce la Alcandia");
        tfmunicipioalca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmunicipioalcaActionPerformed(evt);
            }
        });

        tfcp.setToolTipText("Introduce el CP");
        tfcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcpActionPerformed(evt);
            }
        });

        jLabel11.setText("Codigo Postal");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Estado");

        JCestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCestado.setToolTipText("Selecciona el Estado");
        JCestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCestadoActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("País");

        JCpais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCpais.setToolTipText("Selecciona el Pais");
        JCpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCpaisActionPerformed(evt);
            }
        });

        tftelcasa.setToolTipText("Introduce el telefono");
        tftelcasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftelcasaActionPerformed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Tel. Casa");

        tftelcelular.setToolTipText("Introduce el Telefono celular");
        tftelcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftelcelularActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Tel. Celular");

        rbmasc.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(rbmasc);
        rbmasc.setText("Hombre");
        rbmasc.setToolTipText("Selecciona el Sexo");
        rbmasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmascActionPerformed(evt);
            }
        });

        rbfeme.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(rbfeme);
        rbfeme.setText("Mujer");
        rbfeme.setToolTipText("Selecciona el Sexo");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Sexo");

        tfcorreo2.setToolTipText("Introduce el correo electrónico opcional");
        tfcorreo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcorreo2ActionPerformed(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Correo electrónico 1");

        tfcorreo1.setToolTipText("Introduce el correo electrónico");
        tfcorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcorreo1ActionPerformed(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Correo electrónico 2");

        btnguardarycontinuar.setText("Guardar y Continuar");
        btnguardarycontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarycontinuarActionPerformed(evt);
            }
        });

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        tfdiscapacidad.setToolTipText("Introduce la discapacidad");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Discapacidad");

        tflenguaext.setToolTipText("Introduce la lengua extranjera");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Lengua Indigena");

        jLabel21.setText("Nombre de la unidad Académica");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("CIECAS");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Nombre del Programa Académico de Posgrado");

        tfnomacade.setToolTipText("Introduce el programa académico");
        tfnomacade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnomacadeActionPerformed(evt);
            }
        });

        jdfechanaci.setToolTipText("Introduce la fecha de nacimiento");
        jdfechanaci.setMinSelectableDate(new java.util.Date(-62135744288000L));

        jLabel24.setText("Fecha de Nacimiento");

        jDesktopPane1.setLayer(titulo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblimagen1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SUBTITULO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SUBTITULO2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SUBTITULO3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfnom22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfapep, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfapem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfcalle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfnoext, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfnoint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfcolonia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfmunicipioalca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfcp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JCestado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JCpais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tftelcasa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tftelcelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rbmasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rbfeme, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfcorreo2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfcorreo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnguardarycontinuar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btneditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfdiscapacidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tflenguaext, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfnomacade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jdfechanaci, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(lblimagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(SUBTITULO2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(SUBTITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(tfcalle, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(111, 111, 111)))
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfnoext)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfnoint)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(tfcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfmunicipioalca, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfnom22, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(jLabel2)
                                                .addGap(57, 57, 57))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfapep, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(tfapem, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jdfechanaci, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(jLabel3)
                                                .addGap(120, 120, 120)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tfcp, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(JCestado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(12, 12, 12)
                                                        .addComponent(JCpais, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                        .addGap(37, 37, 37)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(39, 39, 39)
                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tftelcasa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tftelcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(272, 272, 272)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rbmasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rbfeme, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(148, 148, 148)
                                                .addComponent(tfnomacade, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addGap(98, 98, 98)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(207, 207, 207)
                                                .addComponent(btnguardarycontinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(392, 392, 392)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SUBTITULO3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(tfcorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(71, 71, 71)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tfcorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(405, 405, 405)
                                        .addComponent(tfdiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tflenguaext, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SUBTITULO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SUBTITULO2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblimagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(SUBTITULO3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(tfnom22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfapem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfapep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jdfechanaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel24)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(tfcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(tfcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel12))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JCpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(tftelcasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(tftelcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfnoext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfnoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(tfmunicipioalca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(13, 13, 13)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(rbmasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbfeme))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfcorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfcorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(tflenguaext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(tfnomacade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarycontinuar)
                    .addComponent(btneditar))
                .addGap(51, 51, 51))
        );

        jTabbedPane2.addTab("Datos del Solicitante", jDesktopPane1);

        SUBTITULO5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        SUBTITULO5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBTITULO5.setText("ANTECEDENTES ACADÉMICOS");
        SUBTITULO5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Nivel Licenciatura");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Programa academico");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Institución");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Estado o País");

        jLabel29.setText("Fecha de graduación");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Nivel Especialidad");

        rbespecialidad.setBackground(new java.awt.Color(153, 153, 153));
        rbespecialidad.setText("No Aplicable");
        rbespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbespecialidadActionPerformed(evt);
            }
        });

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Programa academico");

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Institución");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Estado o País");

        jLabel34.setText("Fecha de graduación");

        JDfechagraduacion2.setDoubleBuffered(false);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Nivel Maestría");

        rbmaestria.setBackground(new java.awt.Color(153, 153, 153));
        rbmaestria.setText("No Aplicable");
        rbmaestria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmaestriaActionPerformed(evt);
            }
        });

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Programa academico");

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Institución");

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Estado o País");

        jLabel39.setText("Fecha de graduación");

        btguardarantecedentes.setText("Guardar ");
        btguardarantecedentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarantecedentesActionPerformed(evt);
            }
        });

        btneditarante.setText("Editar");
        btneditarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditaranteActionPerformed(evt);
            }
        });

        lblimagen2.setText("Logo 1");

        titulo5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        titulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo5.setText("INSTITUTO POLITÉCNICO NACIONAL");
        titulo5.setAutoscrolls(true);

        SUBTITULO11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBTITULO11.setText("Secretaría de Investigación y Posgrado Dirección de Posgrado ");
        SUBTITULO11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SUBTITULO12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        SUBTITULO12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBTITULO12.setText("SOLICITUD DE INSCRIPCIÓN AL PROGRAMA ACADÉMICO DE POSGRADO");
        SUBTITULO12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jDesktopPane2.setLayer(SUBTITULO5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfprograma1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfinstituto1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfestado1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(JDfechagraduacion1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(rbespecialidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfprograma2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfinstituto2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfestado2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(JDfechagraduacion2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(rbmaestria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfprograma3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfinstituto3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfestado3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(JDfechagraduacion3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btguardarantecedentes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btneditarante, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblimagen2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(titulo5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(SUBTITULO11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(SUBTITULO12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(401, 401, 401)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(tfprograma1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(SUBTITULO5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(28, 28, 28)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfinstituto1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tfestado1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(lblimagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(titulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(SUBTITULO11, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SUBTITULO12, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel29))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(JDfechagraduacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfprograma3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfinstituto3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tfestado3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel39))
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(JDfechagraduacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(352, 352, 352))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                                        .addComponent(rbmaestria)
                                        .addGap(240, 240, 240)))))
                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfprograma2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(28, 28, 28)
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfinstituto2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(tfestado2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rbespecialidad)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel34))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(JDfechagraduacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(397, 397, 397))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(btneditarante, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)
                        .addComponent(btguardarantecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(titulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SUBTITULO11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SUBTITULO12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblimagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(SUBTITULO5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfprograma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDfechagraduacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfinstituto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfestado1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbespecialidad)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfprograma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDfechagraduacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfinstituto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfestado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbmaestria)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfprograma3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDfechagraduacion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfinstituto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfestado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btguardarantecedentes)
                    .addComponent(btneditarante))
                .addGap(60, 60, 60))
        );

        jTabbedPane2.addTab("Antecedentes Académicos", jDesktopPane2);

        lblimagen3.setText("Logo 1");

        titulo3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo3.setText("INSTITUTO POLITÉCNICO NACIONAL");
        titulo3.setAutoscrolls(true);

        SUBTITULO6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBTITULO6.setText("Secretaría de Investigación y Posgrado Dirección de Posgrado ");
        SUBTITULO6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SUBTITULO7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        SUBTITULO7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBTITULO7.setText("SOLICITUD DE INSCRIPCIÓN AL PROGRAMA ACADÉMICO DE POSGRADO");
        SUBTITULO7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SUBTITULO8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        SUBTITULO8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBTITULO8.setText("PROGRAMA SEMESTRAL");
        SUBTITULO8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Primer semestre");

        rbtiemparcial.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(rbtiemparcial);
        rbtiemparcial.setText("Tiempo Parcial");

        rbtiempcompleto.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(rbtiempcompleto);
        rbtiempcompleto.setText("Tiempo Completo");

        jLabel41.setText("Estatus del Alumno");

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Clave");

        tfclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfclaveActionPerformed(evt);
            }
        });

        btnagregartabla.setText("Agregar uno nuevo");
        btnagregartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregartablaActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText(" Dato indispensable de acuerdo");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("al Art. 13 del Reglamento de Estudios de Posgrado");

        tfacticade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfacticadeActionPerformed(evt);
            }
        });

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Actividad Académica (Curso)");

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Profesor/a");

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Unidad Académica");

        tfunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfunidadActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Clave", "Actividad académica (curso)", "Profesor", "Unidad Académica"
            }
        ));
        tabla.setOpaque(false);
        jScrollPane3.setViewportView(tabla);

        jLabel48.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel48.setText("Manifiesto que la información proporcionada con antelación es verídica.");

        jLabel49.setText("Alumno/a");

        jLabel50.setText("Asesor/a Académico");

        jLabel51.setText("Jefe(a) de la Sección o Director(a) del Centro");

        jLabel52.setText("Fecha:");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btneditarinfo.setText("Editar informacion");
        btneditarinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarinfoActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");

        btneliminardatostabla.setText("Eliminar  un dato de la tabla");
        btneliminardatostabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminardatostablaActionPerformed(evt);
            }
        });

        jDesktopPane4.setLayer(lblimagen3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(titulo3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(SUBTITULO6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(SUBTITULO7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(SUBTITULO8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel40, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(rbtiemparcial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(rbtiempcompleto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel42, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(tfclave, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(btnagregartabla, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel43, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel44, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(tfacticade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel45, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(tfprofe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel46, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel47, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(tfunidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel48, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(tfalumno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(tfasesor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(tfjefa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel49, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel50, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel51, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(JDfecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel52, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(btnguardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(btneditarinfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(btnbuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(btneliminardatostabla, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addComponent(rbtiemparcial, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtiempcompleto)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblimagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SUBTITULO8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(193, 193, 193)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 34, Short.MAX_VALUE))
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SUBTITULO7, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(SUBTITULO6, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfclave)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfacticade, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tfprofe, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel47))))
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btnagregartabla, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btneliminardatostabla, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel48))
                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(tfalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                                .addGap(131, 131, 131)
                                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(45, 45, 45)
                                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfasesor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel50)))
                                        .addGap(28, 28, 28)
                                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(tfjefa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel51)))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(btneditarinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SUBTITULO6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SUBTITULO7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblimagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SUBTITULO8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44))
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtiemparcial)
                            .addComponent(rbtiempcompleto))
                        .addGap(2, 2, 2)))
                .addGap(21, 21, 21)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfacticade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfprofe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregartabla, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminardatostabla, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfasesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfjefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btneditarinfo)
                    .addComponent(btnbuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Programa Semestral", jDesktopPane4);

        lblimagen4.setText("Logo 1");

        titulo4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        titulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo4.setText("INSTITUTO POLITÉCNICO NACIONAL");
        titulo4.setAutoscrolls(true);

        SUBTITULO9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBTITULO9.setText("Secretaría de Investigación y Posgrado Dirección de Posgrado ");
        SUBTITULO9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SUBTITULO10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        SUBTITULO10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBTITULO10.setText("SOLICITUD DE INSCRIPCIÓN AL PROGRAMA ACADÉMICO DE POSGRADO");
        SUBTITULO10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("La Secretaría de Investigación y Posgrado del Instituto Politécnico Nacional a través de la Dirección de Posgrado \ncon su domicilio en el Edificio de la Secretaría Académica, 2do. Piso Av. Luis Enrique Erro s/n, Unidad Profesional \n“Adolfo López Mateos”, Zacatenco. CP 07738, es responsable del resguardo de los datos personales que usted \nproporcione, los cuales serán protegidos conforme a lo dispuesto por la Ley General de Protección de Datos \nPersonales en Posesión de Sujetos Obligados, y demás normatividad que resulte aplicable. \n\nEste aviso tiene como objetivo asegurar la privacidad de los datos personales proporcionados por nuestros alumnos,\negresados, personal docente, de Apoyo y Asistencia a la Educación y alumnos de planteles con RVOE del \nInstituto Politécnico Nacional.\n\nAl usar los servicios o productos brindados por la Secretaría de Investigación  y Posgrado, a través de la Dirección \nde Posgrado usted está de acuerdo con la recopilación, uso, transferencia y almacenamiento de su información \npersonal, lo que significa que ha leído, entendido y aceptado los términos a continuación expuestos. En caso\nde no estar de acuerdo con ellos, el titular no deberá proporcionar ninguna información personal.\nLa recolección de datos personales por parte de la Secretaría de Investigación  y Posgrado a través de\n Dirección de Posgrado se funda en el cumplimiento de las siguientes finalidades:\n\n1.  Para prestarle los servicios y realizar todas las actividades que resulten necesarias para su \ndesarrollo académico y contribuir a su formación integral.\n2.  Apoyar con la realización de los procedimientos de gestión académica y administrativa.\n\nPara los fines antes descritos se pueden solicitar los siguientes datos: nombre completo del solicitante,\nRFC, correo electrónico, teléfono particular o celular, domicilio, entre otros, mismos que podrán ser proporcionados\nen la solicitud del trámite, así como en la documentación que en su caso adjunte, o datos contenidos en los documentos\nque se presenten para acreditar la identidad del titular o de su apoderado.\nFundamento para el tratamiento de datos personales:\n\n\t1. Ley General de Transparencia y Acceso a la información Pública. \n\t2. Ley Federal de Transparencia y Acceso a la Información Pública.\n\t3. Ley General de Protección de Datos Personales en Posesión de Sujetos Obligados.\n\nEn caso de que exista un cambio de este aviso de privacidad, lo haremos de su conocimiento a través de \nla página de la Dirección de Posgrado  http://www.ipn.mx/posgrado/Paginas/inicio.aspx\n"); // NOI18N
        jTextArea1.setCaretPosition(0);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Aviso de Privacidad");

        rbacepto.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(rbacepto);
        rbacepto.setText("Acepto");
        rbacepto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbacepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbaceptoActionPerformed(evt);
            }
        });

        rbnoacepto.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(rbnoacepto);
        rbnoacepto.setText("No Acepto");
        rbnoacepto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton7.setText("Generar PDF");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jDesktopPane3.setLayer(lblimagen4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(titulo4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(SUBTITULO9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(SUBTITULO10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel53, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(rbacepto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(rbnoacepto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lblimagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SUBTITULO10, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(SUBTITULO9, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane3Layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(rbacepto)
                                .addGap(53, 53, 53)
                                .addComponent(rbnoacepto))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(366, 366, 366))))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addComponent(titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SUBTITULO9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SUBTITULO10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblimagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel53)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbacepto)
                    .addComponent(rbnoacepto))
                .addGap(28, 28, 28)
                .addComponent(jButton7)
                .addGap(38, 38, 38))
        );

        jTabbedPane2.addTab("Aviso de privacidad", jDesktopPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbaceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbaceptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbaceptoActionPerformed

    private void btneditarinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarinfoActionPerformed
        tfclave.enable(true);
       tfacticade.enable(true);
       tfprofe.enable(true);
       tfunidad.enable(true);
       btnagregartabla.setEnabled(true);
       btneliminardatostabla.setEnabled(true);
       tfasesor.enable(true);
       tfjefa.enable(true);
       JDfecha.setEnabled(true);
       tfalumno.enable(true);
       rbtiemparcial.setEnabled(true);
       rbtiempcompleto.setEnabled(true);
       tabla.setEnabled(true);
    }//GEN-LAST:event_btneditarinfoActionPerformed

    private void tfunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfunidadActionPerformed

    private void tfclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfclaveActionPerformed

    private void btneditaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditaranteActionPerformed
        //nivel licenciatura    
        tfprograma1.enable(true);
            tfinstituto1.enable(true);
            tfestado1.enable(true);
            JDfechagraduacion1.setEnabled(true);
        //nivel especialidad
            tfprograma2.enable(true);
            tfinstituto2.enable(true);
            tfestado2.enable(true);
            JDfechagraduacion2.setEnabled(true);
        //nivel maestria
            tfprograma3.enable(true);
            tfinstituto3.enable(true);
            tfestado3.enable(true);
            JDfechagraduacion3.setEnabled(true);
    }//GEN-LAST:event_btneditaranteActionPerformed

    private void btguardarantecedentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarantecedentesActionPerformed
        //nivel licenciatura    
        tfprograma1.enable(false);
            tfinstituto1.enable(false);
            tfestado1.enable(false);
            JDfechagraduacion1.setEnabled(false);
        //nivel especialidad
            tfprograma2.enable(false);
            tfinstituto2.enable(false);
            tfestado2.enable(false);
            JDfechagraduacion2.setEnabled(false);
        //nivel maestria
            tfprograma3.enable(false);
            tfinstituto3.enable(false);
            tfestado3.enable(false);
            JDfechagraduacion3.setEnabled(false);
            
    }//GEN-LAST:event_btguardarantecedentesActionPerformed

    private void rbmaestriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmaestriaActionPerformed
        if(rbmaestria.isSelected()){

            tfinstituto3.enable(false);
            tfprograma3.enable(false);
            tfestado3.enable(false);
            JDfechagraduacion3.setEnabled(false);

            tfinstituto3.setText("");
            tfprograma3.setText("");
            tfestado3.setText("");
            JDfechagraduacion3.setDate(null);
            //tfestado2.setText(JDfechagraduacion2.getCalendar());

        } else if(rbmaestria.isSelected()==false){
            tfinstituto3.enable(true);
            tfprograma3.enable(true);
            tfestado3.enable(true);
            JDfechagraduacion3.setEnabled(true);;
        }
    }//GEN-LAST:event_rbmaestriaActionPerformed

    private void rbespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbespecialidadActionPerformed
        if(rbespecialidad.isSelected()){

            tfinstituto2.enable(false);
            tfprograma2.enable(false);
            tfestado2.enable(false);
            JDfechagraduacion2.setEnabled(false);

            tfinstituto2.setText("");
            tfprograma2.setText("");
            tfestado2.setText("");
            JDfechagraduacion2.setDate(null);
            //tfestado2.setText(JDfechagraduacion2.getCalendar());

        } else if(rbespecialidad.isSelected()==false){
            tfinstituto2.enable(true);
            tfprograma2.enable(true);
            tfestado2.enable(true);
            JDfechagraduacion2.setEnabled(true);;
        }
    }//GEN-LAST:event_rbespecialidadActionPerformed

    private void tfnomacadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnomacadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnomacadeActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        tfnom22.enable(true);
        tfapep.enable(true);
        tfapem.enable(true);
        tfcalle.enable(true);
        tfnoext.enable(true);
        tfnoint.enable(true);
        tfcolonia.enable(true);
        tfmunicipioalca.enable(true);
        tfcp.enable(true);
        JCestado.enable(true);
        JCpais.enable(true);
        tftelcasa.enable(true);
        tftelcelular.enable(true);
        rbmasc.setEnabled(true);
        rbfeme.setEnabled(true);
        tfcorreo1.enable(true);
        tfcorreo2.enable(true);
        tfdiscapacidad.enable(true);
        tflenguaext.enable(true);
        tfnomacade.enable(true);
        jdfechanaci.setEnabled(true);
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnguardarycontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarycontinuarActionPerformed
        //boton de guardar y continuar

        /* try {
            //Consulta para comprobar que el usuario esta registrado en la libreria
            ps = cn.prepareStatement("Select clv_juguete from juguetes where ((clv_juguete>"+auxclv+")&&(clv_juguete<"+auxclv2+"))");
            ps.setString(1, tfnom.getText());
            ps.setString(2, tfapep.getText());
            ps.setString(3, tfapem.getText());

            rs = ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(datos.class.getName()).log(Level.SEVERE, null, ex);
        } */

        tfnom22.enable(false);
        tfapep.enable(false);
        tfapem.enable(false);
        tfcalle.enable(false);
        tfnoext.enable(false);
        tfnoint.enable(false);
        tfcolonia.enable(false);
        tfmunicipioalca.enable(false);
        tfcp.enable(false);
        JCestado.enable(false);
        JCpais.enable(false);
        tftelcasa.enable(false);
        tftelcelular.enable(false);
        rbmasc.setEnabled(false);
        rbfeme.setEnabled(false);
        tfcorreo1.enable(false);
        tfcorreo2.enable(false);
        tfdiscapacidad.enable(false);
        tflenguaext.enable(false);
        tfnomacade.enable(false);
        jdfechanaci.setEnabled(false);

    }//GEN-LAST:event_btnguardarycontinuarActionPerformed

    private void tfcorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcorreo1ActionPerformed

    private void tfcorreo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcorreo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcorreo2ActionPerformed

    private void rbmascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbmascActionPerformed

    private void tftelcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftelcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftelcelularActionPerformed

    private void tftelcasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftelcasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftelcasaActionPerformed

    private void JCpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCpaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCpaisActionPerformed

    private void JCestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCestadoActionPerformed

    private void tfcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcpActionPerformed

    private void tfmunicipioalcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmunicipioalcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmunicipioalcaActionPerformed

    private void tfcoloniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcoloniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcoloniaActionPerformed

    private void tfnointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnointActionPerformed

    private void tfnoextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnoextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnoextActionPerformed

    private void tfcalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcalleActionPerformed

    private void tfapemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfapemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfapemActionPerformed

    private void tfapepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfapepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfapepActionPerformed

    private void tfnom22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnom22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnom22ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
       tfclave.enable(false);
       tfacticade.enable(false);
       tfprofe.enable(false);
       tfunidad.enable(false);
       btnagregartabla.setEnabled(false);
       btneliminardatostabla.setEnabled(false);
       tfasesor.enable(false);
       tfjefa.enable(false);
       JDfecha.setEnabled(false);
       tfalumno.enable(false);
       rbtiemparcial.setEnabled(false);
       rbtiempcompleto.setEnabled(false);
       tabla.setEnabled(false);
       
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnagregartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregartablaActionPerformed
        //codigo para agregar datos a la tabla
        if(tfclave.getText().isEmpty() || tfacticade.getText().isEmpty() || tfprofe.getText().isEmpty() || tfunidad.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null,"No deje espacios vacios");
        }else 
        {
       String []info = new String[4];
       info[0]=tfclave.getText();
       info[1]=tfacticade.getText();
       info[2]=tfprofe.getText();
       info[3]=tfunidad.getText();
       modelo.addRow(info);
       
       tfclave.setText("");
       tfacticade.setText("");
       tfprofe.setText("");
       tfunidad.setText("");
        }
       
        
    }//GEN-LAST:event_btnagregartablaActionPerformed

    private void tfacticadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfacticadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfacticadeActionPerformed

    private void btneliminardatostablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminardatostablaActionPerformed
       int fila=tabla.getSelectedRow();
       if(fila>=0){
           modelo.removeRow(fila);
       }else {
           JOptionPane.showMessageDialog(null,"Selecciona la fila a eliminar");
       }
    }//GEN-LAST:event_btneliminardatostablaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(menuprueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuprueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuprueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuprueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuprueba().setVisible(true);
            }
        });
    }
 /*Codigo para escalar imagenes*/
    
     private void pintarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(), 
                        lbl.getHeight(), 
                        Image.SCALE_DEFAULT
                )
        );
        lbl.setIcon(this.icono);
        this.repaint();  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCestado;
    private javax.swing.JComboBox<String> JCpais;
    private com.toedter.calendar.JDateChooser JDfecha;
    private com.toedter.calendar.JDateChooser JDfechagraduacion1;
    private com.toedter.calendar.JDateChooser JDfechagraduacion2;
    private com.toedter.calendar.JDateChooser JDfechagraduacion3;
    private javax.swing.JLabel SUBTITULO;
    private javax.swing.JLabel SUBTITULO10;
    private javax.swing.JLabel SUBTITULO11;
    private javax.swing.JLabel SUBTITULO12;
    private javax.swing.JLabel SUBTITULO2;
    private javax.swing.JLabel SUBTITULO3;
    private javax.swing.JLabel SUBTITULO5;
    private javax.swing.JLabel SUBTITULO6;
    private javax.swing.JLabel SUBTITULO7;
    private javax.swing.JLabel SUBTITULO8;
    private javax.swing.JLabel SUBTITULO9;
    private javax.swing.JButton btguardarantecedentes;
    private javax.swing.JButton btnagregartabla;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneditarante;
    private javax.swing.JButton btneditarinfo;
    private javax.swing.JButton btneliminardatostabla;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardarycontinuar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private com.toedter.calendar.JDateChooser jdfechanaci;
    private javax.swing.JLabel lblimagen1;
    private javax.swing.JLabel lblimagen2;
    private javax.swing.JLabel lblimagen3;
    private javax.swing.JLabel lblimagen4;
    private javax.swing.JRadioButton rbacepto;
    private javax.swing.JRadioButton rbespecialidad;
    private javax.swing.JRadioButton rbfeme;
    private javax.swing.JRadioButton rbmaestria;
    private javax.swing.JRadioButton rbmasc;
    private javax.swing.JRadioButton rbnoacepto;
    private javax.swing.JRadioButton rbtiemparcial;
    private javax.swing.JRadioButton rbtiempcompleto;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tfacticade;
    private javax.swing.JTextField tfalumno;
    private javax.swing.JTextField tfapem;
    private javax.swing.JTextField tfapep;
    private javax.swing.JTextField tfasesor;
    private javax.swing.JTextField tfcalle;
    private javax.swing.JTextField tfclave;
    private javax.swing.JTextField tfcolonia;
    private javax.swing.JTextField tfcorreo1;
    private javax.swing.JTextField tfcorreo2;
    private javax.swing.JTextField tfcp;
    private javax.swing.JTextField tfdiscapacidad;
    private javax.swing.JTextField tfestado1;
    private javax.swing.JTextField tfestado2;
    private javax.swing.JTextField tfestado3;
    private javax.swing.JTextField tfinstituto1;
    private javax.swing.JTextField tfinstituto2;
    private javax.swing.JTextField tfinstituto3;
    private javax.swing.JTextField tfjefa;
    private javax.swing.JTextField tflenguaext;
    private javax.swing.JTextField tfmunicipioalca;
    private javax.swing.JTextField tfnoext;
    private javax.swing.JTextField tfnoint;
    private javax.swing.JTextField tfnom22;
    private javax.swing.JTextField tfnomacade;
    private javax.swing.JTextField tfprofe;
    private javax.swing.JTextField tfprograma1;
    private javax.swing.JTextField tfprograma2;
    private javax.swing.JTextField tfprograma3;
    private javax.swing.JTextField tftelcasa;
    private javax.swing.JTextField tftelcelular;
    private javax.swing.JTextField tfunidad;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    // End of variables declaration//GEN-END:variables
}
