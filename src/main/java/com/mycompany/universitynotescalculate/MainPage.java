package com.mycompany.universitynotescalculate;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author cihancelik
 */
public class MainPage extends javax.swing.JFrame {
    String sumPercentage;
    
    // pdf degiskenleri
    Cell nameCell;
    Cell vizeCell;
    Cell finalCell;
    Cell hwCell;
    Cell examCell;
    Cell attandanceCell;
    Cell otherCell;
    Cell sumCell;
    Table pTable;
    float sumNotes;
    
    // for update
     // notes
        int vizeN ;
        int finalN;
        int hwN ;
        int examN;
        int attandanceN;
        int otherN;
        // percentages
        int vizeP ;
        int finalP;
        int hwP ;
        int examP ;
        int attandanceP;
        int otherP;
    

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
        setLocationRelativeTo(null);
        closedTextFields();
    }
    public void closedTextFields(){
        textFieldAttandanceNote.setEditable(false);
        textFieldAttandancePercentage.setEditable(false);
        textFieldExamNote.setEditable(false);
        textFieldExamPercentage.setEditable(false);
        textFieldVizeNote.setEditable(false);
        textFieldVizePercentage.setEditable(false);
        textFieldHwNote.setEditable(false);
        textFieldHwPercentage.setEditable(false);
        textFieldOtherNote.setEditable(false);
        textFieldOtherPercentage.setEditable(false);
        textFieldFinalNote.setEditable(false);
        textFieldFinalPercentage.setEditable(false);
        
    }
    public void pdfDocument(){
        String way = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int save = chooser.showOpenDialog(this);
        if(save == JFileChooser.APPROVE_OPTION){
            way = chooser.getSelectedFile().getPath();
        }
        // PDF dosyası oluşturma
    try {
        PdfWriter writer = new PdfWriter(way + "/UniversityNotes.pdf");
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
        
        Paragraph paragraph = new Paragraph("Ders Notes Tables...");
        
        Paragraph space = new Paragraph("");
        
        pTable = new Table(8);
        
        nameCell = new Cell().add(new Paragraph("Lesson Name"));
        vizeCell = new Cell().add(new Paragraph("Vize Note"));
        finalCell = new Cell().add(new Paragraph("Final Note"));
        hwCell = new Cell().add(new Paragraph("Homework Note"));
        examCell = new Cell().add(new Paragraph("Exam Note"));
        attandanceCell = new Cell().add(new Paragraph("Attandance"));
        otherCell = new Cell().add(new Paragraph("Other"));
        sumCell = new Cell().add(new Paragraph("Total Point"));
        
        pTable.addCell(nameCell);
        pTable.addCell(vizeCell);
        pTable.addCell(finalCell);
        pTable.addCell(hwCell);
        pTable.addCell(examCell);
        pTable.addCell(attandanceCell);
        pTable.addCell(otherCell);
        pTable.addCell(sumCell);
        
        // jttable export to pdf
        int a = jTable2.getRowCount();
        for(int i =0; i < a; i++){
            String name = jTable2.getValueAt(i,0).toString();
            String vize = jTable2.getValueAt(i, 1).toString();
            String fnl =  jTable2.getValueAt(i,2).toString();
            String hw = jTable2.getValueAt(i, 3).toString();
            String exam = jTable2.getValueAt(i,4).toString();
            String attandance = jTable2.getValueAt(i,5).toString();
            String other = jTable2.getValueAt(i,6).toString();
            String sum = jTable2.getValueAt(i,7).toString();
            
            pTable.addCell(name);
            pTable.addCell(vize);
            pTable.addCell(fnl);
            pTable.addCell(hw);
            pTable.addCell(exam);
            pTable.addCell(attandance);
            pTable.addCell(other);
            pTable.addCell(sum);           
            
        }document.add(paragraph);
        document.add(space);
        document.add(pTable);
        
        

        document.close(); // Document'i kapatmayı unutmayın
    } catch (Exception e) {
        e.printStackTrace();
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

        jTextField17 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        textFieldAttandancePercentage = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        textFieldExamPercentage = new javax.swing.JTextField();
        jCheckBox5 = new javax.swing.JCheckBox();
        textFieldOtherPercentage = new javax.swing.JTextField();
        textFieldAttandanceNote = new javax.swing.JTextField();
        textFieldExamNote = new javax.swing.JTextField();
        textFieldOtherNote = new javax.swing.JTextField();
        jCheckBox6 = new javax.swing.JCheckBox();
        textFieldFinalPercentage = new javax.swing.JTextField();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        textFieldVizePercentage = new javax.swing.JTextField();
        jCheckBox11 = new javax.swing.JCheckBox();
        textFieldHwPercentage = new javax.swing.JTextField();
        textFieldFinalNote = new javax.swing.JTextField();
        textFieldVizeNote = new javax.swing.JTextField();
        textFieldHwNote = new javax.swing.JTextField();
        lessonName = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTextField17.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jTextField17.setMinimumSize(new java.awt.Dimension(70, 70));
        jTextField17.setPreferredSize(new java.awt.Dimension(70, 70));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("University Note Calculator Program");
        setMinimumSize(new java.awt.Dimension(1194, 655));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1194, 655));

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lesson");

        jLabel5.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Exam:");

        jLabel6.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Attendance:");

        jLabel7.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FinalMust:");

        jLabel10.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Note");

        jLabel11.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("%");

        jButton1.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("Calculate");
        jButton1.setToolTipText("Press button to calculate..");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jSeparator1.setBackground(new java.awt.Color(153, 255, 153));
        jSeparator1.setForeground(new java.awt.Color(204, 255, 153));

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jTable2.setForeground(new java.awt.Color(102, 102, 102));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lesson", "Vize", "Final", "Homework", "Exam", "Attendance", "FinalMust", "Summary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
        }

        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Vize:");

        jLabel15.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Final:");

        jLabel16.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Homework:");

        jButton2.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 153));
        jButton3.setText("Create PDF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        textFieldAttandancePercentage.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        textFieldAttandancePercentage.setForeground(new java.awt.Color(204, 153, 255));
        textFieldAttandancePercentage.setMinimumSize(new java.awt.Dimension(70, 70));
        textFieldAttandancePercentage.setPreferredSize(new java.awt.Dimension(70, 70));

        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });

        textFieldExamPercentage.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        textFieldExamPercentage.setForeground(new java.awt.Color(204, 153, 255));
        textFieldExamPercentage.setMinimumSize(new java.awt.Dimension(70, 70));
        textFieldExamPercentage.setPreferredSize(new java.awt.Dimension(70, 70));

        jCheckBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox5ItemStateChanged(evt);
            }
        });

        textFieldOtherPercentage.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        textFieldOtherPercentage.setForeground(new java.awt.Color(204, 153, 255));
        textFieldOtherPercentage.setMinimumSize(new java.awt.Dimension(70, 70));
        textFieldOtherPercentage.setPreferredSize(new java.awt.Dimension(70, 70));

        textFieldAttandanceNote.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        textFieldAttandanceNote.setForeground(new java.awt.Color(204, 153, 255));
        textFieldAttandanceNote.setMinimumSize(new java.awt.Dimension(70, 70));
        textFieldAttandanceNote.setPreferredSize(new java.awt.Dimension(70, 70));

        textFieldExamNote.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        textFieldExamNote.setForeground(new java.awt.Color(204, 153, 255));
        textFieldExamNote.setMinimumSize(new java.awt.Dimension(70, 70));
        textFieldExamNote.setPreferredSize(new java.awt.Dimension(70, 70));

        textFieldOtherNote.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        textFieldOtherNote.setForeground(new java.awt.Color(204, 153, 255));
        textFieldOtherNote.setMinimumSize(new java.awt.Dimension(70, 70));
        textFieldOtherNote.setPreferredSize(new java.awt.Dimension(70, 70));

        jCheckBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox6ItemStateChanged(evt);
            }
        });

        textFieldFinalPercentage.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        textFieldFinalPercentage.setForeground(new java.awt.Color(204, 153, 255));
        textFieldFinalPercentage.setMinimumSize(new java.awt.Dimension(70, 70));
        textFieldFinalPercentage.setPreferredSize(new java.awt.Dimension(70, 70));

        jCheckBox10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox10ItemStateChanged(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Note");

        jLabel18.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("%");

        textFieldVizePercentage.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        textFieldVizePercentage.setForeground(new java.awt.Color(204, 153, 255));
        textFieldVizePercentage.setMinimumSize(new java.awt.Dimension(70, 70));
        textFieldVizePercentage.setPreferredSize(new java.awt.Dimension(70, 70));

        jCheckBox11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox11ItemStateChanged(evt);
            }
        });

        textFieldHwPercentage.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        textFieldHwPercentage.setForeground(new java.awt.Color(204, 153, 255));
        textFieldHwPercentage.setMinimumSize(new java.awt.Dimension(70, 70));
        textFieldHwPercentage.setPreferredSize(new java.awt.Dimension(70, 70));

        textFieldFinalNote.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        textFieldFinalNote.setForeground(new java.awt.Color(204, 153, 255));
        textFieldFinalNote.setMinimumSize(new java.awt.Dimension(70, 70));
        textFieldFinalNote.setPreferredSize(new java.awt.Dimension(70, 70));

        textFieldVizeNote.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        textFieldVizeNote.setForeground(new java.awt.Color(204, 153, 255));
        textFieldVizeNote.setMinimumSize(new java.awt.Dimension(70, 70));
        textFieldVizeNote.setPreferredSize(new java.awt.Dimension(70, 70));

        textFieldHwNote.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        textFieldHwNote.setForeground(new java.awt.Color(204, 153, 255));
        textFieldHwNote.setMinimumSize(new java.awt.Dimension(70, 70));
        textFieldHwNote.setPreferredSize(new java.awt.Dimension(70, 70));

        lessonName.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        lessonName.setForeground(new java.awt.Color(204, 153, 255));
        lessonName.setMinimumSize(new java.awt.Dimension(70, 70));
        lessonName.setPreferredSize(new java.awt.Dimension(70, 70));

        jButton4.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 153));
        jButton4.setText("Update");
        jButton4.setToolTipText("Press button to calculate..");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 0, 153));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel17)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textFieldVizeNote, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textFieldHwNote, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldFinalNote, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textFieldVizePercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textFieldFinalPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textFieldHwPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox11)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel10)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(24, 24, 24)))
                                        .addGap(47, 47, 47))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addGap(64, 64, 64)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textFieldExamNote, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textFieldOtherNote, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldAttandanceNote, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textFieldExamPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFieldOtherPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFieldAttandancePercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox5)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jCheckBox3)
                                                .addGap(46, 46, 46)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1)
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)))
                            .addComponent(lessonName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textFieldExamPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldExamNote, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jCheckBox4)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(textFieldAttandanceNote, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFieldAttandancePercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(textFieldOtherPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textFieldOtherNote, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jCheckBox5))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jCheckBox6))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textFieldVizePercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldVizeNote, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(textFieldFinalNote, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFieldFinalPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jCheckBox10)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(textFieldHwPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFieldHwNote, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox11)
                                        .addGap(9, 9, 9)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lessonName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if("".equals(lessonName.getText())){
        lessonName.setText("No Lesson Name");
                }     
        
        // vize deger girilmediginde
        if("".equals(textFieldFinalNote.getText())){
            textFieldFinalNote.setText("0");
            textFieldFinalPercentage.setText("0");
              }
        // final deger girilmediginde
        if("".equals(textFieldVizeNote.getText())){
            textFieldVizeNote.setText("0");
            textFieldVizePercentage.setText("0");
        }
        // homework
        if("".equals(textFieldHwNote.getText())){
            textFieldHwNote.setText("0");
            textFieldHwPercentage.setText("0");
        }
        // exam
        if("".equals(textFieldExamNote.getText())){
            textFieldExamNote.setText("0");
            textFieldExamPercentage.setText("0");           
        }
        // attendance
        if("".equals(textFieldAttandanceNote.getText())){
            textFieldAttandanceNote.setText("0");
            textFieldAttandancePercentage.setText("0");
        }
        // other
        if("".equals(textFieldOtherNote.getText())){
            textFieldOtherNote.setText("0");
            textFieldOtherPercentage.setText("0");
        }
        
        // notes
         vizeN = Integer.valueOf(textFieldFinalNote.getText());
         finalN = Integer.valueOf(textFieldVizeNote.getText());
         hwN = Integer.valueOf(textFieldHwNote.getText());
         examN = Integer.valueOf(textFieldExamNote.getText());
         attandanceN = Integer.valueOf(textFieldAttandanceNote.getText());
         otherN = Integer.valueOf(textFieldOtherNote.getText());
        // percentages
         vizeP = Integer.valueOf(textFieldFinalPercentage.getText());
         finalP = Integer.valueOf(textFieldVizePercentage.getText());
         hwP = Integer.valueOf(textFieldHwPercentage.getText());
         examP = Integer.valueOf(textFieldExamPercentage.getText());
         attandanceP = Integer.valueOf(textFieldAttandancePercentage.getText());
         otherP = Integer.valueOf(textFieldOtherPercentage.getText());
        
        float toplam = vizeP + finalP + hwP + examP + attandanceP + otherP;
        if(toplam > 100){
            JOptionPane.showMessageDialog(this, "Can not more than %100","",JOptionPane.ERROR_MESSAGE);
        }else if(toplam<100){
            JOptionPane.showMessageDialog(this, "Can not less than %100","",JOptionPane.ERROR_MESSAGE);
        }
        else if(toplam == 100){
             sumNotes = ((vizeN*vizeP) + (finalN*finalP) + (examN * examP) +(hwN*hwP) + (attandanceN * attandanceP)) / 100;
            sumPercentage = String.valueOf(sumNotes);
            
            // Önce kullanıcının girdiği değerler alınıyor ve sayıya çevriliyor.
float vizeNotu = Float.parseFloat(textFieldVizeNote.getText());
float vizeYuzdesi = Float.parseFloat(textFieldVizePercentage.getText());

// Geçme notu varsayımı, değiştirebilirsiniz.
float gecmeNotu = Float.parseFloat(textFieldOtherNote.getText());

// Finalde alınması gereken minimum notu hesapla (Buradaki formül değişebilir).
float finaldeGerekenNot = (gecmeNotu - (vizeNotu * (vizeYuzdesi / 100))) / (1 - (vizeYuzdesi / 100));

// Sonra hesaplanan final gereken notu 'Other' olarak tabloya ekle
            
            // add to table our values
            DefaultTableModel defaultTableModel = (DefaultTableModel) jTable2.getModel();
            defaultTableModel.addRow(new Object[]{
                lessonName.getText(),
                textFieldVizeNote.getText(),
                textFieldFinalNote.getText(),
                textFieldHwNote.getText(),
                textFieldExamNote.getText(),
                textFieldAttandanceNote.getText(),
                String.format("%.2f", finaldeGerekenNot), // Yeni hesaplanan not buraya ekleniyor
                sumPercentage});
        }
        jTable2.setShowGrid(true);
        jTable2.setGridColor(Color.blue);
        jTable2.setSelectionBackground(Color.BLACK);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Are you sure want to close App?","Close",JOptionPane.INFORMATION_MESSAGE);
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      int a = JOptionPane.showConfirmDialog(this, "Are you sure want to close App?","Close",JOptionPane.INFORMATION_MESSAGE);
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }    
    }//GEN-LAST:event_formWindowClosing

    private void jCheckBox10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox10ItemStateChanged
      if (evt.getStateChange() == 1){
          textFieldFinalNote.setEditable(true);
          textFieldFinalPercentage.setEditable(true);
      }else{
          textFieldFinalNote.setEditable(false);
          textFieldFinalPercentage.setEditable(false);
      }
    }//GEN-LAST:event_jCheckBox10ItemStateChanged

    private void jCheckBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox6ItemStateChanged
      if(evt.getStateChange() ==1){
          textFieldVizeNote.setEditable(true);
          textFieldVizePercentage.setEditable(true);
      }else{
          textFieldVizeNote.setEditable(false);
          textFieldVizePercentage.setEditable(false);
      }
    }//GEN-LAST:event_jCheckBox6ItemStateChanged

    private void jCheckBox11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox11ItemStateChanged
        if(evt.getStateChange()==1){
            textFieldHwNote.setEditable(true);
            textFieldHwPercentage.setEditable(true);
        }else{
            textFieldHwNote.setEditable(false);
            textFieldHwPercentage.setEditable(false);
        }
    }//GEN-LAST:event_jCheckBox11ItemStateChanged

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
        if(evt.getStateChange() == 1){
            textFieldExamNote.setEditable(true);
            textFieldExamPercentage.setEditable(true);          
        }else{
            textFieldExamNote.setEditable(false);
            textFieldExamPercentage.setEditable(false);
        }
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        if(evt.getStateChange() == 1){
            textFieldAttandanceNote.setEditable(true);
            textFieldAttandancePercentage.setEditable(true);
        }else{
            textFieldAttandanceNote.setEditable(false);
            textFieldAttandancePercentage.setEditable(false);
        }
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox5ItemStateChanged
        if(evt.getStateChange()==1){
            textFieldOtherNote.setEditable(true);
            textFieldOtherPercentage.setEditable(true);
        }else{
            textFieldOtherNote.setEditable(false);
            textFieldOtherPercentage.setEditable(false);
        }
    }//GEN-LAST:event_jCheckBox5ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pdfDocument();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int satirlar = jTable2.getSelectedRow();
        
        lessonName.setText(jTable2.getValueAt(satirlar, 0).toString());
        textFieldVizeNote.setText(jTable2.getValueAt(satirlar, 1).toString());
        textFieldFinalNote.setText(jTable2.getValueAt(satirlar, 2).toString());
        textFieldHwNote.setText(jTable2.getValueAt(satirlar, 3).toString());
        textFieldExamNote.setText(jTable2.getValueAt(satirlar,4).toString());
        textFieldAttandanceNote.setText(jTable2.getValueAt(satirlar,5).toString());
        textFieldOtherNote.setText(jTable2.getValueAt(satirlar,6).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int i = jTable2.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
       
       if(i>=0){
           model.setValueAt(lessonName.getText(), i, 0);
           model.setValueAt(textFieldVizeNote.getText(), i, 1);
           model.setValueAt(textFieldFinalNote.getText(), i, 2);
           model.setValueAt(textFieldHwNote.getText(), i, 3);
           model.setValueAt(textFieldExamNote.getText(), i, 4);
           model.setValueAt(textFieldAttandanceNote.getText(), i, 5);
           model.setValueAt(textFieldOtherNote.getText(), i, 6);
           
           // update
            // notes
         vizeN = Integer.valueOf(textFieldFinalNote.getText());
         finalN = Integer.valueOf(textFieldVizeNote.getText());
         hwN = Integer.valueOf(textFieldHwNote.getText());
         examN = Integer.valueOf(textFieldExamNote.getText());
         attandanceN = Integer.valueOf(textFieldAttandanceNote.getText());
         otherN = Integer.valueOf(textFieldOtherNote.getText());
        // percentages
         vizeP = Integer.valueOf(textFieldFinalPercentage.getText());
         finalP = Integer.valueOf(textFieldVizePercentage.getText());
         hwP = Integer.valueOf(textFieldHwPercentage.getText());
         examP = Integer.valueOf(textFieldExamPercentage.getText());
         attandanceP = Integer.valueOf(textFieldAttandancePercentage.getText());
         otherP = Integer.valueOf(textFieldOtherPercentage.getText());
             sumNotes = ((vizeN*vizeP) + (finalN*finalP) + (examN * examP) +(hwN*hwP) + (attandanceN * attandanceP)) / 100;
            sumPercentage = String.valueOf(sumNotes);
           model.setValueAt(sumPercentage, i, 7);   
           
       }else{
           JOptionPane.showMessageDialog(this,"You Should Choose 1 Lesson!!!");
       }
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
         try{
             int selectedRw = jTable2.getSelectedRow();
              int a = JOptionPane.showConfirmDialog(this, "Are you sure want to Delete Lesson?","Delete",JOptionPane.INFORMATION_MESSAGE);
        if(a==JOptionPane.YES_OPTION){
             model.removeRow(selectedRw);
        }   
         }catch(Exception e){
             
             JOptionPane.showMessageDialog(this, "Didn't chose any lesson!!");
             
         }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField lessonName;
    private javax.swing.JTextField textFieldAttandanceNote;
    private javax.swing.JTextField textFieldAttandancePercentage;
    private javax.swing.JTextField textFieldExamNote;
    private javax.swing.JTextField textFieldExamPercentage;
    private javax.swing.JTextField textFieldFinalNote;
    private javax.swing.JTextField textFieldFinalPercentage;
    private javax.swing.JTextField textFieldHwNote;
    private javax.swing.JTextField textFieldHwPercentage;
    private javax.swing.JTextField textFieldOtherNote;
    private javax.swing.JTextField textFieldOtherPercentage;
    private javax.swing.JTextField textFieldVizeNote;
    private javax.swing.JTextField textFieldVizePercentage;
    // End of variables declaration//GEN-END:variables
}
