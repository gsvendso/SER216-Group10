/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect.four.gui;

import connect.four.Game;


public class MainMenuPanel extends javax.swing.JPanel {

	private String name1, name2;
	GUI gui;
	private boolean isEnabled;
	
	public MainMenuPanel(GUI gui) {
		initComponents();
		setSize(1280,800);
		this.gui = gui;
		isEnabled = false;
		
		setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                title = new javax.swing.JLabel();
                tfplayer1 = new javax.swing.JTextField();
                tfplayer2 = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                butPlay = new javax.swing.JButton();
                jtComputerToggle = new javax.swing.JToggleButton();
                bgImage = new javax.swing.JLabel();

                setBackground(new java.awt.Color(0, 0, 0));

                title.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
                title.setForeground(new java.awt.Color(255, 255, 255));
                title.setText("Connect Four");

                tfplayer1.setText("Player 1");
                tfplayer1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tfplayer1ActionPerformed(evt);
                        }
                });

                tfplayer2.setText("Player 2");
                tfplayer2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tfplayer2ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Player 1:");

                jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Player 2:");

                butPlay.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
                butPlay.setText("PLAY");
                butPlay.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                butPlayActionPerformed(evt);
                        }
                });

                jtComputerToggle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
                jtComputerToggle.setText("Play Against Computer");
                jtComputerToggle.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jtComputerToggleActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(title)
                                .addGap(471, 471, 471))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(378, 378, 378)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(tfplayer1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(tfplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(524, 524, 524)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(butPlay, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                                        .addComponent(jtComputerToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                                .addContainerGap(379, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(title)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtComputerToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(butPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(352, Short.MAX_VALUE))
                );

                bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main_menu.png"))); // NOI18N
                bgImage.setText("jLabel1");
                bgImage.setIgnoreRepaint(true);
                add(bgImage);
                bgImage.setBounds(50, 150, 1200, 590);
        }// </editor-fold>//GEN-END:initComponents

        private void tfplayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfplayer2ActionPerformed
                
        }//GEN-LAST:event_tfplayer2ActionPerformed

        private void tfplayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfplayer1ActionPerformed
                
        }//GEN-LAST:event_tfplayer1ActionPerformed

        private void butPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPlayActionPerformed
		gui.setPlayer1Name(tfplayer1.getText());
		gui.setPlayer2Name(tfplayer2.getText());
		//gui.game.start();
		gui.remove(this);
		gui.addGamePanel();
		gui.updateDisplay();
        }//GEN-LAST:event_butPlayActionPerformed

        private void jtComputerToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtComputerToggleActionPerformed
	        if(!isEnabled){
				tfplayer2.setText("Computer");
				tfplayer2.setEditable(false);
				jtComputerToggle.setText("Play Against Player");
				isEnabled = true;
			}
			else{
				tfplayer2.setText("Player 2");
				tfplayer2.setEditable(true);
				jtComputerToggle.setText("Play Against Computer");
				isEnabled = false;
			}
        }//GEN-LAST:event_jtComputerToggleActionPerformed

	public boolean getIsEnabled(){
		return isEnabled;
	}
	
	

        // Variables declaration - do not modify//GEN-BEGIN:variables
		private javax.swing.JLabel bgImage;
        private javax.swing.JButton butPlay;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JToggleButton jtComputerToggle;
        private javax.swing.JTextField tfplayer1;
        private javax.swing.JTextField tfplayer2;
        private javax.swing.JLabel title;
        // End of variables declaration//GEN-END:variables
}
