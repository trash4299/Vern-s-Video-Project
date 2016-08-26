import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import java.io.File;
import java.nio.file.Paths;

public class Verns extends javax.swing.JFrame
{
    private JButton jButton1;
    private JButton jButton2;
    private JMenu jMenu1;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JMenuItem jMenuItem7;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JTextArea jTextArea1;
    private JTextArea jTextArea2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextPane jTextPane1;
    private MemberList memList;
    private MovieList movList;
    private final String LOC;
    
    public Verns()
    {
        memList = new MemberList();
        movList = new MovieList();
        LOC = Paths.get(".").toAbsolutePath().normalize().toString();
        initComponents();
        main();
    }
    
    @SuppressWarnings("unchecked")                      
    private void initComponents()
    {
        jScrollPane4 = new JScrollPane();
        jScrollPane1 = new JScrollPane();
        jTextPane1 = new JTextPane();
        jPanel2 = new JPanel();
        jTextField1 = new JTextField();
        jButton1 = new JButton();
        jTextField2 = new JTextField();
        jButton2 = new JButton();
        jPanel1 = new JPanel();
        jScrollPane3 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jPanel3 = new JPanel();
        jScrollPane5 = new JScrollPane();
        jTextArea2 = new JTextArea();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
        jMenuItem5 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenuItem7 = new JMenuItem();
        jTextArea1.setEditable(false);
        jTextArea2.setEditable(false);
        
        jScrollPane1.setViewportView(jTextPane1);
        jTextField1.setText("Customers");
        jButton1.setText("Search");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jTextField2.setText("DVDs");
        jButton2.setText("Search");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(6, 6, 6))
                );
        jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton1)
            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton2)))
            );
        
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);
        jTextArea1.setText(memList.printMems());
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3)
                );
                
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 21, Short.MAX_VALUE)
                );
        jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 324, Short.MAX_VALUE)
                );
                        
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);
        jTextArea2.setText(movList.printDvds());
        
        jMenu1.setText("File");
        jMenuItem1.setText("Import movie list");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        
        jMenuItem2.setText("Import member list");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        
        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        
        jMenuItem4.setText("Add Member");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jMenuItem4ActionPerformed(evt);
           }
        });
        jMenu1.add(jMenuItem4);
        
        jMenuItem5.setText("Remove Member");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);
        
        jMenuItem6.setText("Checkout DVD");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        
        jMenu1.add(jMenuItem6);
        
        jMenuItem7.setText("Return DVD");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);
        
        jMenuBar1.add(jMenu1);
        
        setJMenuBar(jMenuBar1);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
        );
        layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                    .addContainerGap())
        );
        
         addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we)
            {
                String ObjButtons[] = {"Yes","No"};
                int PromptResult = JOptionPane.showOptionDialog(null, "Have you saved?","Are you sure you want to exit?",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
                if(PromptResult==JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }
                else
                {
                    main();
                }
            }
        });
        pack();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
    {
        //Customer Button
        String info = jTextField1.getText();
        if(info.equals(""))
            jTextArea1.setText(memList.printMems());
        else
            jTextArea1.setText(memList.findMem(info));
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
    {
         //"Search Button DVD"
        String info = jTextField2.getText();
        if(info.equals(""))
            jTextArea2.setText(movList.printDvds());
        else
            jTextArea2.setText(movList.findDvd(info));
    }
    
    private void jMenuItem1ActionPerformed(ActionEvent evt)
    {
        jTextArea2.setText(movList.readFile(LOC+"\\movielist2.txt"));
    }
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt)
    {
        //import Member List
        jTextArea1.setText(memList.readFile(LOC+"\\memberlist2.txt"));
    }
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt)
    {
        //Save
        movList.saveFile(LOC+"\\movielist2.txt");
        //memList.saveFile();
    }
    
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt)
    {
        //add mmeber
        memList.addMem(JOptionPane.showInputDialog(null, "Enter Name."));
        jTextArea1.setText(memList.printMems());
    }
    
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt)
    {
        //remove member
        memList.delMem(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter ID.")));
        jTextArea1.setText(memList.printMems());
    }
    
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt)
    {
         //checkout dvd
         movList.checkout(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Movie ID")));
         jTextArea2.setText(movList.printDvds());
    }
    
    private void jMenuItem7ActionPerformed(ActionEvent evt)
    {
         // "return dvd"
         movList.returnMov(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Movie ID")));
         jTextArea2.setText(movList.printDvds());
    }
    
    public void main()
    {
         try 
         {
             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
             {
                 if ("Nimbus".equals(info.getName()))
                 {
                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
                     break;
                 }
             }
         }
         catch (ClassNotFoundException ex)
         {
             java.util.logging.Logger.getLogger(Verns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         catch (InstantiationException ex)
         {
             java.util.logging.Logger.getLogger(Verns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         catch (IllegalAccessException ex)
         {
             java.util.logging.Logger.getLogger(Verns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         catch (javax.swing.UnsupportedLookAndFeelException ex)
         {
             java.util.logging.Logger.getLogger(Verns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         
         EventQueue.invokeLater(new Runnable(){
             public void run()
             {
                 setVisible(true);
             }
         });
    }
}




