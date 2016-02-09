package com.dabomstew.pkrandom.gui;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;

/**
 * 
 * @author Stewart
 */
public class OperationDialog extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5965463550336235236L;

	/**
	 * Creates new form OperationDialog
	 */
	public OperationDialog(String text, Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		this.loadingLabel.setText(text);
		setLocationRelativeTo(parent);
	}

	public OperationDialog(String text, Dialog parent, boolean modal) {
		super(parent, modal);
		initComponents();
		this.loadingLabel.setText(text);
		setLocationRelativeTo(parent);
	}

	/* @formatter:off */
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		loadingLabel = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setUndecorated(true);

		jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(
				0, 0, 0), 2, true));

		loadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		loadingLabel.setIcon(getLoadingIcon());
		loadingLabel.setText("Loading...");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(loadingLabel)
						.addContainerGap(53, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(loadingLabel)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private ImageIcon getLoadingIcon() {
		try {
			InputStream in = OperationDialog.class
					.getResourceAsStream("/com/dabomstew/pkrandom/gui/loading.gif");
			byte[] buf = new byte[in.available()];
			in.read(buf);
			in.close();
			Image image = Toolkit.getDefaultToolkit().createImage(buf);
			return new ImageIcon(image);
		} catch (IOException ex) {
			return null;
		}
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel loadingLabel;

	// End of variables declaration//GEN-END:variables
	/* @formatter:on */
}
