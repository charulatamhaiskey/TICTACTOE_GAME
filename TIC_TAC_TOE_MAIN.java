

import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.cyan;
import static java.awt.Color.gray;
import static java.awt.Color.orange;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class TIC_TAC_TOE_MAIN extends javax.swing.JFrame {

     private String turn="O";
     private int xcount = 0;
     private int ocount = 0;
     private int totalCount = 0;


private void ChoosePlayer(){
    if(turn.equalsIgnoreCase("X"))
        turn="O";
    else
        turn="X";
}

private void gameScore(){
    scoreplayer1.setText(String.valueOf(ocount));
    scoreplayer2.setText(String.valueOf(xcount));
}
private void winningGame(){
    
        
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        
        if(b1 != "" && b2 == b1 && b3 == b1)
        {
             String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            
            btn1.setBackground(cyan);
            btn2.setBackground(cyan);
            btn3.setBackground(cyan);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(b4 != "" && b4 == b5 && b4 == b6)
        {
             String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            
            btn4.setBackground(cyan);
            btn5.setBackground(cyan);
            btn6.setBackground(cyan);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            
        }else if(b7 != "" && b8 == b7 && b9 == b7)
        {
             String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            
            btn7.setBackground(cyan);
            btn8.setBackground(cyan);
            btn9.setBackground(cyan);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            
        }else if(b1 != "" && b4 == b1 && b7 == b1)
        {
             String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            
            btn1.setBackground(cyan);
            btn4.setBackground(cyan);
            btn7.setBackground(cyan);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn6.setEnabled(false);
            btn5.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            
        }else if(b2 != "" && b2 == b5 && b2 == b8)
        {
             String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            
            btn2.setBackground(cyan);
            btn5.setBackground(cyan);
            btn8.setBackground(cyan);
            btn1.setEnabled(false);
            btn4.setEnabled(false);
            btn7.setEnabled(false);
            btn3.setEnabled(false);
            btn6.setEnabled(false);
            btn9.setEnabled(false);
            
        }else if(b3 != "" && b3 == b6 && b3 == b9)
        {
             String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            
            btn3.setBackground(cyan);
            btn6.setBackground(cyan);
            btn9.setBackground(cyan);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn8.setEnabled(false);
            btn7.setEnabled(false);
            
        }else if(b1 != "" && b5 == b1 && b9 == b1)
        {
             String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            
            btn1.setBackground(cyan);
            btn5.setBackground(cyan);
            btn9.setBackground(cyan);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn8.setEnabled(false);
            btn7.setEnabled(false);
            
        }
        else if(b3 != "" && b5 == b3 && b3 == b7)
        {
             String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            
            btn3.setBackground(cyan);
            btn5.setBackground(cyan);
            btn7.setBackground(cyan);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn6.setEnabled(false);
            btn4.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            
        }
        
        
        
        else if(totalCount==9){
            JOptionPane.showMessageDialog(this, "No one Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
        
}
private void ResetGame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
      btn1.setBackground(gray);
      btn2.setBackground(gray);
      btn3.setBackground(gray); 
      btn4.setBackground(gray); 
      btn5.setBackground(gray); 
      btn6.setBackground(gray); 
      btn7.setBackground(gray); 
      btn8.setBackground(gray);
      btn9.setBackground(gray);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
     totalCount=0; 
     xcount=0;
     ocount=0;
     gameScore();


}
    /**
     * Creates new form TIC_TAC_TOE_MAIN
     */
    public TIC_TAC_TOE_MAIN() {
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

        title = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        Panelscore = new javax.swing.JPanel();
        Scorecard = new javax.swing.JPanel();
        scorecard = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        scoreplayer1 = new javax.swing.JLabel();
        scoreplayer2 = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        close = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        title.setBackground(new java.awt.Color(0, 0, 51));
        title.setForeground(new java.awt.Color(0, 0, 51));
        title.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        Title.setBackground(new java.awt.Color(0, 0, 51));
        Title.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(204, 204, 255));
        Title.setText("                 TIC TAC TOE GAME");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Title)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btn1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(204, 204, 255));
        reset.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 0, 51));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(204, 204, 255));
        exit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 51));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        Panelscore.setBackground(new java.awt.Color(204, 204, 255));
        Panelscore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Scorecard.setBackground(new java.awt.Color(0, 0, 51));
        Scorecard.setForeground(new java.awt.Color(0, 0, 51));

        scorecard.setBackground(new java.awt.Color(0, 0, 51));
        scorecard.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        scorecard.setForeground(new java.awt.Color(204, 204, 255));
        scorecard.setText("SCORECARD");

        javax.swing.GroupLayout ScorecardLayout = new javax.swing.GroupLayout(Scorecard);
        Scorecard.setLayout(ScorecardLayout);
        ScorecardLayout.setHorizontalGroup(
            ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScorecardLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(scorecard, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        ScorecardLayout.setVerticalGroup(
            ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScorecardLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(scorecard)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        player1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        player1.setText("Player O:");

        player2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        player2.setText("Player X:");

        scoreplayer1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        scoreplayer1.setText("0");

        scoreplayer2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        scoreplayer2.setText("0");

        javax.swing.GroupLayout PanelscoreLayout = new javax.swing.GroupLayout(Panelscore);
        Panelscore.setLayout(PanelscoreLayout);
        PanelscoreLayout.setHorizontalGroup(
            PanelscoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Scorecard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelscoreLayout.createSequentialGroup()
                .addGroup(PanelscoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelscoreLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(player1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelscoreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(player2)))
                .addGap(18, 18, 18)
                .addGroup(PanelscoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scoreplayer1)
                    .addComponent(scoreplayer2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelscoreLayout.setVerticalGroup(
            PanelscoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelscoreLayout.createSequentialGroup()
                .addComponent(Scorecard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(PanelscoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1)
                    .addComponent(scoreplayer1))
                .addGap(30, 30, 30)
                .addGroup(PanelscoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2)
                    .addComponent(scoreplayer2))
                .addGap(0, 46, Short.MAX_VALUE))
        );

        file.setText("File");

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        file.add(close);

        menubar.add(file);

        help.setText("help");

        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        menubar.add(help);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Panelscore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reset)
                        .addGap(38, 38, 38)
                        .addComponent(exit)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Panelscore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exit)
                            .addComponent(reset))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );

        btn3.getAccessibleContext().setAccessibleName("btn00");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(TIC_TAC_TOE_MAIN.this, "MINOR PROJECT BY CHARU MHAISKEY");
    }//GEN-LAST:event_aboutActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
         if(!"".equals(btn3.getText())){
            return;
        }
          btn3.setText(turn);
          totalCount++;
        if(turn.equalsIgnoreCase("X")){
            btn3.setForeground(blue);
        }else{
            btn3.setForeground(black);
        }
        winningGame();
        ChoosePlayer();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if(!"".equals(btn1.getText())){
            return;
        }
          btn1.setText(turn);
          totalCount++;
        if(turn.equalsIgnoreCase("X")){
            btn1.setForeground(blue);
        }else{
            btn1.setForeground(black);
        }
        winningGame();
        ChoosePlayer();
        //btn0.setEnabled(false);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
         if(!"".equals(btn2.getText())){
            return;
        }
          btn2.setText(turn);
          totalCount++;
        if(turn.equalsIgnoreCase("X")){
            btn2.setForeground(blue);
        }else{
            btn2.setForeground(black);
        }
        winningGame();
        ChoosePlayer();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
         if(!"".equals(btn7.getText())){
            return;
        }
          btn7.setText(turn);
          totalCount++;
        if(turn.equalsIgnoreCase("X")){
            btn7.setForeground(blue);
        }else{
            btn7.setForeground(black);
        }
        winningGame();
        ChoosePlayer();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
         if(!"".equals(btn8.getText())){
            return;
        }
          btn8.setText(turn);
          totalCount++;
        if(turn.equalsIgnoreCase("X")){
            btn8.setForeground(blue);
        }else{
            btn8.setForeground(black);
        }
        winningGame();
        ChoosePlayer();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
         if(!"".equals(btn9.getText())){
            return;
        }
          btn9.setText(turn);
          totalCount++;
        if(turn.equalsIgnoreCase("X")){
            btn9.setForeground(blue);
        }else{
            btn9.setForeground(black);
        }
        winningGame();
        ChoosePlayer();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
         if(!"".equals(btn6.getText())){
            return;
        }
          btn6.setText(turn);
          totalCount++;
        if(turn.equalsIgnoreCase("X")){
            btn6.setForeground(blue);
        }else{
            btn6.setForeground(black);
        }
        winningGame();
        ChoosePlayer();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
         if(!"".equals(btn4.getText())){
            return;
        }
          btn4.setText(turn);
          totalCount++;
        if(turn.equalsIgnoreCase("X")){
            btn4.setForeground(blue);
        }else{
            btn4.setForeground(black);
        }
        winningGame();
        ChoosePlayer();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
         if(!"".equals(btn5.getText())){
            return;
        }
          btn5.setText(turn);
          totalCount++;
        if(turn.equalsIgnoreCase("X")){
            btn5.setForeground(blue);
        }else{
            btn5.setForeground(black);
        }
        winningGame();
        ChoosePlayer();
    }//GEN-LAST:event_btn5ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit?","TIC TAC TOE",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
           System.exit(0); 
        }
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        ResetGame();
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panelscore;
    private javax.swing.JPanel Scorecard;
    private javax.swing.JLabel Title;
    private javax.swing.JMenuItem about;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JMenuItem close;
    private javax.swing.JButton exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenu help;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JButton reset;
    private javax.swing.JLabel scorecard;
    private javax.swing.JLabel scoreplayer1;
    private javax.swing.JLabel scoreplayer2;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
