/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dash.freq.gui;

import java.io.File;
import java.net.URL;
import org.dash.freq.data.*;
/**
 *
 * @author katrinaeaton
 */
public class GUIJFrame extends javax.swing.JFrame {

	
	File selectedFile;
	private String gtRegistry;
	private String estEntity;
	private URL url;
	/**
	 * Creates new form GUIJFrame
	 */
	public GUIJFrame() {
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

        fileChooserUpload = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        fileLocationTextArea = new javax.swing.JTextArea();
        fileOpenButton = new javax.swing.JButton();
        outputScrollPane = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        uploadButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileLocationTextArea.setEditable(false);
        fileLocationTextArea.setBackground(javax.swing.UIManager.getDefaults().getColor("window"));
        fileLocationTextArea.setColumns(20);
        fileLocationTextArea.setLineWrap(true);
        fileLocationTextArea.setRows(5);
        fileLocationTextArea.setWrapStyleWord(true);
        fileLocationTextArea.setAutoscrolls(false);
        fileLocationTextArea.setBorder(null);
        fileLocationTextArea.setDragEnabled(false);
        fileLocationTextArea.setFocusTraversalKeysEnabled(false);
        fileLocationTextArea.setFocusable(false);
        fileLocationTextArea.setOpaque(false);
        fileLocationTextArea.setRequestFocusEnabled(false);

        fileOpenButton.setText("Select File");
        fileOpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileOpenButtonActionPerformed(evt);
            }
        });

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        outputScrollPane.setViewportView(outputTextArea);

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(uploadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton))
                            .addComponent(outputScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fileOpenButton)
                        .addGap(12, 12, 12)
                        .addComponent(fileLocationTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileOpenButton)
                    .addComponent(fileLocationTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(outputScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileOpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileOpenButtonActionPerformed
		fileChooserUpload.setVisible(rootPaneCheckingEnabled);
		int returnValue = fileChooserUpload.showOpenDialog(null);
		if (returnValue == fileChooserUpload.APPROVE_OPTION)//JFileChooser.APPROVE_OPTION) 
		{
			selectedFile = fileChooserUpload.getSelectedFile();
			System.out.println(selectedFile.getName());
			String absolutePath = selectedFile.getAbsolutePath();
			fileLocationTextArea.setText( absolutePath );
		}
    }//GEN-LAST:event_fileOpenButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
		System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        System.out.println("THIS IS A DEMO FOR REDIRECTING OUTPUT TO GUI");

		System.out.println("--------------------------------------------");

		for(int i = 0; i < 30; i++)
		{
			System.out.print(Math.random()+"\t");
			System.out.println("<<End");
		}

		System.out.println("--------------------------------------------");
		PostPopulationFrequencies postPopulationFrequencies = null;
		try
		{
			postPopulationFrequencies = new PostPopulationFrequencies(selectedFile, gtRegistry,
						estEntity, url);
			postPopulationFrequencies.call();
		} catch (Exception e) {
			e.printStackTrace();
		}
				
    }//GEN-LAST:event_uploadButtonActionPerformed

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
			java.util.logging.Logger.getLogger(GUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		// redirect console to gui
		GUIConsole redirect = new GUIConsole();
		redirect.redirectSystemStreams();
		
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUIJFrame().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JFileChooser fileChooserUpload;
    private javax.swing.JTextArea fileLocationTextArea;
    private javax.swing.JButton fileOpenButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane outputScrollPane;
    protected static javax.swing.JTextArea outputTextArea;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
