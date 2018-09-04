import java.awt.FileDialog;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class MyListener implements ActionListener {
	private Main m;
	Tool tool=new Tool();
	public void setMain(Main m)
	{
		this.m=m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String com=e.getActionCommand();
		switch(com)
		{
			case "打开":
				FileDialog fd=new FileDialog(m.jf,"选择文件",FileDialog.LOAD);
				fd.setFile("*.PDF;*.pdf");
				fd.setDirectory(FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath());
				fd.setVisible(true);
				String path;
				if(fd.getDirectory()!=null&&fd.getFile()!=null)
				{
					path=fd.getDirectory()+fd.getFile();
					m.bis=tool.toImage(path);
					m.jp.repaint();
				}
				

				break;
			case "下一页":
				m.index++;
				m.jp.repaint();
				break;
			case "上一页":
				m.index--;
				m.jp.repaint();
				break;
			case "转化为图片":
				JFileChooser fc=new JFileChooser();
				fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fc.setCurrentDirectory(FileSystemView.getFileSystemView().getHomeDirectory());
				fc.showSaveDialog(null);
				if(fc.getSelectedFile()!=null)
				{
					path=fc.getSelectedFile().getPath();
					System.out.println(path);
					tool.save(m.bis, path);
				}
				
				break;
		}
		
	}

}
