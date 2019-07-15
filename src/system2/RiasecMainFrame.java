package system2;


public class RiasecMainFrame extends javax.swing.JFrame {
       int r[] = new int[42];
       int i[] = new int[42];
       int a[] = new int[42];
       int s[] = new int[42];
       int e[] = new int[42];
       int c[] = new int[42];
       int sum = 0;
      
   
    public RiasecMainFrame() {
        initComponents();
    }
      public RiasecMainFrame(String _name) {
        initComponents();
        lbl_name.setText(_name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton70 = new javax.swing.JRadioButton();
        jRadioButton76 = new javax.swing.JRadioButton();
        jRadioButton79 = new javax.swing.JRadioButton();
        jRadioButton90 = new javax.swing.JRadioButton();
        jRadioButton95 = new javax.swing.JRadioButton();
        jRadioButton99 = new javax.swing.JRadioButton();
        jRadioButton104 = new javax.swing.JRadioButton();
        jRadioButton113 = new javax.swing.JRadioButton();
        jRadioButton118 = new javax.swing.JRadioButton();
        jRadioButton122 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jRadioButton127 = new javax.swing.JRadioButton();
        jRadioButton135 = new javax.swing.JRadioButton();
        jRadioButton144 = new javax.swing.JRadioButton();
        jRadioButton150 = new javax.swing.JRadioButton();
        jRadioButton152 = new javax.swing.JRadioButton();
        jRadioButton159 = new javax.swing.JRadioButton();
        jRadioButton166 = new javax.swing.JRadioButton();
        jRadioButton173 = new javax.swing.JRadioButton();
        jRadioButton175 = new javax.swing.JRadioButton();
        jRadioButton183 = new javax.swing.JRadioButton();
        jRadioButton187 = new javax.swing.JRadioButton();
        jRadioButton194 = new javax.swing.JRadioButton();
        jRadioButton202 = new javax.swing.JRadioButton();
        jRadioButton210 = new javax.swing.JRadioButton();
        jRadioButton215 = new javax.swing.JRadioButton();
        jRadioButton217 = new javax.swing.JRadioButton();
        jRadioButton228 = new javax.swing.JRadioButton();
        jRadioButton230 = new javax.swing.JRadioButton();
        jRadioButton238 = new javax.swing.JRadioButton();
        jRadioButton243 = new javax.swing.JRadioButton();
        jRadioButton251 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btn_proceed = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RIASEC");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1500, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 1000));

        jRadioButton16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton16.setText("A");

        jRadioButton36.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton36.setText("C");

        jRadioButton29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton29.setText("E");

        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton1.setText("R");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton21.setText("S");

        jRadioButton8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton8.setText("I");

        jRadioButton37.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton37.setText("R");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("1. I like to work on cars");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("2. I like to do puzzles");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("3. I am good at working independently");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("4. I like to work in teams");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("<html>5. I am an ambitious person,<br>          I set goals for myself</html>");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("6. I like to organize things,(files,desk/offices)");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("7. I like to build things");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("8. I like to read about art and music");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("<html>9. I like to have clear instructions<br>     to follow</html>");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("<html>10. I like to try to influence or<br>         persuade people</html>");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("11. I like to do experiments");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("12. I like to teach or  train people");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("<html>13. I like trying to help people solve<br>        their problems</html>");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("14. I like to take care of animals");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("<html>15. I wouldn't wind working 8 hours<br>       per day in an office</html>");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("16. I like selling things");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("17. I enjoy creative writing");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("18. I enjoy science");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("<html>19. I am quick to take on new<br>        responsibilites</html>");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("20. I am interested in healing people");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("<html>21. I enjoy trying to figure out how<br>       things work</html>");

        jRadioButton45.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton45.setText("A");

        jRadioButton54.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton54.setText("C");

        jRadioButton59.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton59.setText("E");

        jRadioButton62.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton62.setText("I");

        jRadioButton70.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton70.setText("S");

        jRadioButton76.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton76.setText("S");

        jRadioButton79.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton79.setText("R");

        jRadioButton90.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton90.setText("C");

        jRadioButton95.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton95.setText("E");

        jRadioButton99.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton99.setText("A");

        jRadioButton104.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton104.setText("I");

        jRadioButton113.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton113.setText("E");

        jRadioButton118.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton118.setText("S");

        jRadioButton122.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton122.setText("I");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jRadioButton122)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jRadioButton37)
                                            .addGap(187, 187, 187))
                                        .addComponent(jRadioButton1)
                                        .addComponent(jRadioButton21)
                                        .addComponent(jRadioButton8)
                                        .addComponent(jRadioButton16)
                                        .addComponent(jRadioButton29)
                                        .addComponent(jRadioButton36))
                                    .addComponent(jRadioButton54)
                                    .addComponent(jRadioButton45)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jRadioButton59)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton76)
                            .addComponent(jRadioButton62)
                            .addComponent(jRadioButton70))
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton113)
                            .addComponent(jRadioButton104)
                            .addComponent(jRadioButton99)
                            .addComponent(jRadioButton90)
                            .addComponent(jRadioButton79)
                            .addComponent(jRadioButton95))
                        .addGap(190, 190, 190))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton118)
                        .addGap(192, 192, 192))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton8)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton16)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton21)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton29)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton36)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton37)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton45)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jRadioButton62))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jRadioButton70))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jRadioButton79))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton90))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addComponent(jRadioButton95))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jRadioButton99))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jRadioButton104))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton113))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jRadioButton118))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton122)))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(557, 833));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("<html>22. I like putting things together or<br>         assembling things</html>");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setText("23. I am a creative person");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setText("24. I pay attention to details");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setText("25. I like to do filing or typing");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("<html>26. I like to analyze things (problems/<br>        situations)</html>");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("27. I like to play instruments or sing");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel28.setText("<html>28. I enjoy learning about other<br>        cultures</html>");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel29.setText("<html>29. I would like to start my own<br>         business</html>");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("30. I like to cook");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setText("31. I like to acting in plays");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel32.setText("32. I am a practical person");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel33.setText("<html>33. I like working with numbers<br>        or charts</html>");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel34.setText("<html>34. I like to get into discussions about<br>        issues</html>");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel35.setText("<html>35. I am good at keeping records of<br>        my work</html>");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel36.setText("36. I like to lead");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel37.setText("37. I like working outdoors");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel38.setText("38. I would like to work in an office");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel39.setText("39. I'm good at math");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel40.setText("40. I like helping people");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel41.setText("41. I like to draw");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel42.setText("42. I like to give speeches");

        jRadioButton127.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton127.setText("R");

        jRadioButton135.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton135.setText("A");

        jRadioButton144.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton144.setText("C");

        jRadioButton150.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton150.setText("C");

        jRadioButton152.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton152.setText("I");

        jRadioButton159.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton159.setText("A");

        jRadioButton166.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton166.setText("S");

        jRadioButton173.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton173.setText("E");

        jRadioButton175.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton175.setText("R");

        jRadioButton183.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton183.setText("A");

        jRadioButton187.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton187.setText("R");

        jRadioButton194.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton194.setText("I");

        jRadioButton202.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton202.setText("S");

        jRadioButton210.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton210.setText("C");

        jRadioButton215.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton215.setText("E");

        jRadioButton217.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton217.setText("R");

        jRadioButton228.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton228.setText("C");

        jRadioButton230.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton230.setText("I");

        jRadioButton238.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton238.setText("S");

        jRadioButton243.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton243.setText("A");

        jRadioButton251.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton251.setText("E");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton183)
                                    .addComponent(jRadioButton187)
                                    .addComponent(jRadioButton194)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton175))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton173)
                                    .addComponent(jRadioButton159)
                                    .addComponent(jRadioButton166)
                                    .addComponent(jRadioButton152))))
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton202)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton210)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton215))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton135)
                                    .addComponent(jRadioButton127)
                                    .addComponent(jRadioButton144)
                                    .addComponent(jRadioButton150))))
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton251)
                                            .addComponent(jRadioButton243)
                                            .addComponent(jRadioButton238)
                                            .addComponent(jRadioButton230)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButton228))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton217)))
                        .addGap(181, 181, 181))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton127))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23))
                    .addComponent(jRadioButton135))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jRadioButton144))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jRadioButton150))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton152))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jRadioButton159))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton166))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton173))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jRadioButton175))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jRadioButton183))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jRadioButton187))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton194))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton202))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton210))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jRadioButton215))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jRadioButton217))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jRadioButton228))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jRadioButton230))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jRadioButton238))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jRadioButton243))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jRadioButton251))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btn_proceed.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_proceed.setText("Proceed");
        btn_proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proceedActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel44.setText("Name");

        lbl_name.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lbl_name.setText("...........");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 268, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(579, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btn_proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proceedActionPerformed
        try{
            Question1();
            Question2();
            Question3();
            Question4();
            Question5();
            Question6();
            Question7();
            Question8();
            Question9();
            Question10();
            Question11();
            Question12();
            Question13();
            Question14();
            Question15();
            Question16();
            Question17();
            Question18();
            Question19();
            Question20();
            Question21();
            Question22();
            Question23();
            Question24();
            Question25();
            Question26();
            Question27();
            Question28();
            Question29();
            Question30();
            Question31();
            Question32();
            Question33();
            Question34();
            Question35();
            Question36();
            Question37();
            Question38();
            Question39();
            Question40();
            Question41();
            Question42();
            ResultRiasecFrame _rs = new ResultRiasecFrame(sumR(),sumI(),sumA(),sumS(),sumE(),sumC(),lbl_name.getText());
            _rs.show();
            this.dispose();
        }catch(Exception er){
            System.out.println(er);
        }
       
    }//GEN-LAST:event_btn_proceedActionPerformed
public int sumR(){
        sum= 0;
        for( int i : r) {
            sum += i;
        }
        return sum;
    }
public int sumI(){
        sum= 0;
        for( int i : i) {
            sum += i;
        }
        return sum;
    }
public int sumA(){
        sum= 0;
        for( int i : a) {
            sum += i;
        }
        return sum;
    }
public int sumS(){
        sum= 0;
        for( int i : s) {
            sum += i;
        }
        return sum;
    }
public int sumE(){
        sum= 0;
        for( int i : e) {
            sum += i;
        }
        return sum;
    }
public int sumC(){
        sum= 0;
        for( int i : c) {
            sum += i;
        }
        return sum;
    }
public int Question1(){
        if(jRadioButton1.isSelected()){
            r[0] = 1;
        }else{
            r[0] = 0;
        }
            return r[0];
   
    } 
public int Question2(){
     if(jRadioButton8.isSelected()){
            i[1] = 1;
        }else{
            i[1] = 0;
        }
            return i[1];
    
    }
public int Question3(){
     if(jRadioButton16.isSelected()){
            a[2] = 1;
        }else{
            a[2] = 0;
        }
            return a[2];
    
    } 
public int Question4(){
     if(jRadioButton21.isSelected()){
            s[3] = 1;
        }else{
            s[3] = 0;
        }
            return s[3]; 
    } 
public int Question5(){
    if(jRadioButton29.isSelected()){
            e[4] = 1;
        }else{
            e[4] = 0;
        }
            return e[4]; 
      
    } 
public int Question6(){
      if(jRadioButton36.isSelected()){
            c[5] = 1;
        }else{
            c[5] = 0;
        }
            return c[5]; 
        
    }
public int Question7(){
    if(jRadioButton37.isSelected()){
            r[6] = 1;
        }else{
            r[6] = 0;
        }
            return r[5]; 
       
    }
public int Question8(){
    if(jRadioButton45.isSelected()){
            a[7] = 1;
        }else{
            a[7] = 0;
        }
            return a[7]; 
      
    }
public int Question9(){
        if(jRadioButton54.isSelected()){
            c[8] = 1;
        }else{
            c[8] = 0;
        }
            return c[8]; 
    }
public int Question10(){
     if(jRadioButton59.isSelected()){
            e[9] = 1;
        }else{
            e[9] = 0;
        }
            return e[9]; 
}
public int Question11(){
        if(jRadioButton62.isSelected()){
            i[10] = 1;
        }else{
            i[10] = 0;
        }
            return i[10]; 
    } 
public int Question12(){
        if(jRadioButton70.isSelected()){
            s[11] = 1;
        }else{
            s[11] = 0;
        }
            return s[11]; 
    }
public int Question13(){
       if(jRadioButton76.isSelected()){
            s[12] = 1;
        }else{
            s[12] = 0;
        }
            return s[12]; 
    }
public int Question14(){
      if(jRadioButton79.isSelected()){
            r[13] = 1;
        }else{
            r[13] = 0;
        }
            return r[13]; 
    }
public int Question15(){
         if(jRadioButton90.isSelected()){
            c[14] = 1;
        }else{
            c[14] = 0;
        }
            return c[14]; 
    } 
public int Question16(){
        if(jRadioButton95.isSelected()){
            e[15] = 1;
        }else{
            e[15] = 0;
        }
            return e[15]; 
    }
public int Question17(){
         if(jRadioButton99.isSelected()){
            a[16] = 1;
        }else{
            a[16] = 0;
        }
            return a[16]; 
    } 
public int Question18(){
      if(jRadioButton104.isSelected()){
            i[17] = 1;
        }else{
            i[17] = 0;
        }
            return i[17]; 
    }
public int Question19(){
        if(jRadioButton113.isSelected()){
            e[18] = 1;
        }else{
            e[18] = 0;
        }
            return e[18]; 
    }
public int Question20(){
       if(jRadioButton118.isSelected()){
            s[19] = 1;
        }else{
            s[19] = 0;
        }
            return s[19]; 
    } 
public int Question21(){
        if(jRadioButton122.isSelected()){
            i[20] = 1;
        }else{
            i[20] = 0;
        }
            return i[20]; 
    }
public int Question22(){
        if(jRadioButton127.isSelected()){
            r[21] = 1;
        }else{
            r[21] = 0;
        }
            return r[21]; 
    }
public int Question23(){
        if(jRadioButton135.isSelected()){
            a[22] = 1;
        }else{
            a[22] = 0;
        }
            return a[22]; 
    }
public int Question24(){
        if(jRadioButton144.isSelected()){
            c[23] = 1;
        }else{
            c[23] = 0;
        }
            return c[23]; 
    }
public int Question25(){
        if(jRadioButton150.isSelected()){
            c[24] = 1;
        }else{
            c[24] = 0;
        }
            return c[24]; 
    }
public int Question26(){
         if(jRadioButton152.isSelected()){
            i[25] = 1;
        }else{
            i[25] = 0;
        }
            return i[25]; 
    }
public int Question27(){
        if(jRadioButton159.isSelected()){
            a[26] = 1;
        }else{
            a[26] = 0;
        }
            return a[26]; 
    }
public int Question28(){
        if(jRadioButton166.isSelected()){
            s[27] = 1;
        }else{
            s[27] = 0;
        }
            return s[27]; 
    }
public int Question29(){
       if(jRadioButton173.isSelected()){
            e[28] = 1;
        }else{
            e[28] = 0;
        }
            return e[28]; 
    }
public int Question30(){
        if(jRadioButton175.isSelected()){
            r[29] = 1;
        }else{
            r[29] = 0;
        }
            return r[29]; 
    }
public int Question31(){
        if(jRadioButton183.isSelected()){
            a[30] = 1;
        }else{
            a[30] = 0;
        }
            return a[30]; 
    }
public int Question32(){
     if(jRadioButton187.isSelected()){
            r[31] = 1;
        }else{
            r[31] = 0;
        }
            return r[31]; 
    }
public int Question33(){
       if(jRadioButton194.isSelected()){
            i[32] = 1;
        }else{
            i[32] = 0;
        }
            return i[32]; 
    }
public int Question34(){
         if(jRadioButton202.isSelected()){
            s[33] = 1;
        }else{
            s[33] = 0;
        }
            return s[33]; 
    }
public int Question35(){
        if(jRadioButton210.isSelected()){
            c[34] = 1;
        }else{
            c[34] = 0;
        }
            return c[34]; 
    }
public int Question36(){
        if(jRadioButton215.isSelected()){
            e[35] = 1;
        }else{
            e[35] = 0;
        }
            return e[35]; 
    }
public int Question37(){
      if(jRadioButton217.isSelected()){
            r[36] = 1;
        }else{
            r[36] = 0;
        }
            return r[36]; 
    }
public int Question38(){
       if(jRadioButton228.isSelected()){
            c[37] = 1;
        }else{
            c[37] = 0;
        }
            return c[37]; 
    }
public int Question39(){
        if(jRadioButton230.isSelected()){
            i[38] = 1;
        }else{
            i[38] = 0;
        }
            return i[38]; 
    }
public int Question40(){
        if(jRadioButton238.isSelected()){
            s[39] = 1;
        }else{
            s[39] = 0;
        }
            return s[39]; 
    }
public int Question41(){
        if(jRadioButton243.isSelected()){
            a[40] = 1;
        }else{
            a[40] = 0;
        }
            return a[40]; 
    }
public int Question42(){
         if(jRadioButton251.isSelected()){
            e[41] = 1;
        }else{
            e[41] = 0;
        }
            return e[41]; 
    }




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
            java.util.logging.Logger.getLogger(RiasecMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiasecMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiasecMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiasecMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiasecMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_proceed;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton104;
    private javax.swing.JRadioButton jRadioButton113;
    private javax.swing.JRadioButton jRadioButton118;
    private javax.swing.JRadioButton jRadioButton122;
    private javax.swing.JRadioButton jRadioButton127;
    private javax.swing.JRadioButton jRadioButton135;
    private javax.swing.JRadioButton jRadioButton144;
    private javax.swing.JRadioButton jRadioButton150;
    private javax.swing.JRadioButton jRadioButton152;
    private javax.swing.JRadioButton jRadioButton159;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton166;
    private javax.swing.JRadioButton jRadioButton173;
    private javax.swing.JRadioButton jRadioButton175;
    private javax.swing.JRadioButton jRadioButton183;
    private javax.swing.JRadioButton jRadioButton187;
    private javax.swing.JRadioButton jRadioButton194;
    private javax.swing.JRadioButton jRadioButton202;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton210;
    private javax.swing.JRadioButton jRadioButton215;
    private javax.swing.JRadioButton jRadioButton217;
    private javax.swing.JRadioButton jRadioButton228;
    private javax.swing.JRadioButton jRadioButton230;
    private javax.swing.JRadioButton jRadioButton238;
    private javax.swing.JRadioButton jRadioButton243;
    private javax.swing.JRadioButton jRadioButton251;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton70;
    private javax.swing.JRadioButton jRadioButton76;
    private javax.swing.JRadioButton jRadioButton79;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton90;
    private javax.swing.JRadioButton jRadioButton95;
    private javax.swing.JRadioButton jRadioButton99;
    private javax.swing.JLabel lbl_name;
    // End of variables declaration//GEN-END:variables
}
