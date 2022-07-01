package _13_IO;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class _02_FileEx1 {
	public static void main(String[] args) throws IOException {
		JFileChooser fc = new JFileChooser();
		int ret = fc.showOpenDialog(null);
		if (ret == 0) {
			File f = fc.getSelectedFile();
			System.out.println("FileName: "+f.getName());
			System.out.println("Extend of File: "+
						f.getName().substring(f.getName().lastIndexOf(".")+1));
			System.out.println("path: "+f.getPath());
			System.out.println("Absolute path: "+f.getAbsolutePath());
			System.out.println("Canonical path: "+f.getCanonicalPath());
			System.out.println("Directory Name: "+f.getParent());
			System.out.println("pathSeparator: "+File.pathSeparator);
			System.out.println("separatorChar: "+File.separatorChar);
		}
	}
}
