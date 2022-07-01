package _13_IO;

import java.awt.FileDialog;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import _12_Swing.BaseFrm;

public class _03_FileIO {
	public static void main(String[] args) {
		new FileFrm();
	}
}

class FileFrm extends BaseFrm implements ActionListener {
	JPanel pnlNorth;
	JButton btnOpen, btnSave, btnNew, btnBackup;
	JScrollPane scp;
	JTextArea ta;
	JFileChooser fc;
	FileDialog fd;
	String selected;

	public FileFrm() throws HeadlessException {
		super(800, 600);
		inflate();
	}

	@Override
	public void init() {
		pnlNorth = new JPanel();
		btnOpen = new JButton("Open");
		btnSave = new JButton("Save");
		btnNew = new JButton("New");
		btnBackup = new JButton("Backup");
		ta = new JTextArea();
		scp = new JScrollPane(ta);
		fc = new JFileChooser();
		btnOpen.addActionListener(this);
		btnNew.addActionListener(this);
		btnSave.addActionListener(this);
		btnBackup.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOpen) {
			// fileOpenFileChooser();
			fileOpenFileDialog();
		} else if (e.getSource() == btnBackup) {
			// fileBackupChooser();
			fileBackupDialog();
		}
	}

	void fileOpenFileChooser() {
		try {
			int ret = fc.showOpenDialog(btnOpen);
			if (ret == 0) {
				selected = fc.getSelectedFile().toString();
				FileInputStream fis = new FileInputStream(selected);
				int data = 0;
				while ((data = fis.read()) != -1) {
					ta.append(String.valueOf((char) data));
				}
				fis.close();
			}
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}
	}

	void fileOpenFileDialog() {
		try {
			fd = new FileDialog(this, "���� ����", FileDialog.LOAD);
			fd.setVisible(true);

			selected = fd.getDirectory() + fd.getFile();
			FileInputStream fis = new FileInputStream(selected);
			int data = 0;
			while ((data = fis.read()) != -1) {
				char c = (char) data;
				ta.append(String.valueOf(c));
			}
			fis.close();
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}
	}

	void fileBackupChooser() {
		int ret = fc.showSaveDialog(btnBackup);
		if (ret == 0) {
			try {
				String saveFile = fc.getSelectedFile().toString();
				FileInputStream fis = new FileInputStream(saveFile);

				String backFile = saveFile.substring(0, saveFile.lastIndexOf(".")) + ".bak";
				FileOutputStream fos = new FileOutputStream(backFile);

				int data = 0;
				while ((data = fis.read()) != -1) {
					fos.write(data);
				}
				fis.close();
				fos.close();
			} catch (IOException e1) {
			}
		}
	}

	void fileBackupDialog() {
		try {
			fd = new FileDialog(this, "���� ����", FileDialog.SAVE);
			fd.setVisible(true);
			String saveFile = fd.getDirectory() + fd.getFile();
			FileInputStream fis = new FileInputStream(saveFile);

			String backFile = saveFile.substring(0, saveFile.lastIndexOf(".")) + ".bak";
			FileOutputStream fos = new FileOutputStream(backFile);

			int data = 0;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			fis.close();
			fos.close();
		} catch (IOException e1) {
		}
	}

	@Override
	public void arrange() {
		pnlNorth.add(btnNew);
		pnlNorth.add(btnOpen);
		pnlNorth.add(btnSave);
		pnlNorth.add(btnBackup);
		add(pnlNorth, "North");
		add(scp, "Center");
	}

}