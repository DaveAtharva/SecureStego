package steganography;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass extends WindowAdapter implements ActionListener
{
    private JFrame          mainFrame;
    private JMenuBar        menuBar;
    private JMenu           menuFile, menuHelp;
    private JMenuItem       mnuExit, mnuEmbedMessage, mnuEmbedFile, 
                            mnuHelp;
    private JMenuItem       mnuRetrieveMessage, mnuRetrieveFile;
    private JPanel          mainPanel, panelButtons;
    private JLabel          lblLogo;
    private JButton         btnEmbedFile, btnRetrieveFile,
                            btnEmbedMessage, btnRetrieveMessage;
    private JButton         btnHelp,btnExit;
    private Handler  back;


 public MainClass()
        {
  mainFrame= new JFrame("Steganograph");
  mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  mainFrame.addWindowListener(this);
  lblLogo=new JLabel(new ImageIcon("C:\\Users\\DELL\\Documents\\"
          + "NetBeansProjects\\minorFINAL\\src\\steganography"
          + "\\stego.gif"));

		mnuExit= new JMenuItem("Exit", 'x');
		mnuEmbedMessage= new JMenuItem("Embed Message",  'e');
		mnuEmbedFile= new JMenuItem("Embed File",  'f');
		mnuRetrieveMessage= new JMenuItem("Retrieve Message", 'm');
		mnuRetrieveFile= new JMenuItem("Retrieve File",  'r');	
		mnuHelp= new JMenuItem("Help", 'h');
 
  mnuEmbedMessage.addActionListener(this);
  mnuEmbedFile.addActionListener(this);
  mnuRetrieveMessage.addActionListener(this);
  mnuRetrieveFile.addActionListener(this);
  mnuExit.addActionListener(this);
  mnuHelp.addActionListener(this);
  menuFile= new JMenu("File");
  menuFile.setMnemonic('i');
  menuFile.add(mnuEmbedMessage);
  menuFile.add(mnuEmbedFile);
  menuFile.add(mnuRetrieveMessage);
  menuFile.add(mnuRetrieveFile);
  menuFile.add(mnuExit);
  
  menuHelp= new JMenu("Help");
  menuHelp.setMnemonic('H');
  menuHelp.add(mnuHelp);
  menuBar= new JMenuBar();
  menuBar.add(menuFile);
  menuBar.add(menuHelp);
  mainFrame.setJMenuBar(menuBar);
 
  mainPanel= new JPanel();
  panelButtons= new JPanel();
  btnEmbedMessage= new JButton("Embed Message");
  btnEmbedMessage.setMnemonic('e');
  btnEmbedFile= new JButton("Embed File");
  btnEmbedFile.setMnemonic('f');
  btnRetrieveMessage= new JButton("Retrieve Message");
  btnRetrieveMessage.setMnemonic('m');
  btnRetrieveFile= new JButton("Retrieve File");
  btnRetrieveFile.setMnemonic('r');
  btnHelp= new JButton("Help");
  btnHelp.setMnemonic('h');
  btnExit=new JButton("Exit");
  btnExit.setMnemonic('X');

  btnRetrieveMessage.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnRetrieveMessage.setBackground(Color.GRAY);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnRetrieveMessage.setBackground(Color.WHITE);
    }
});
  btnEmbedMessage.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnEmbedMessage.setBackground(Color.GRAY);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnEmbedMessage.setBackground(Color.WHITE);
    }
});
  btnRetrieveFile.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnRetrieveFile.setBackground(Color.GRAY);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnRetrieveFile.setBackground(Color.WHITE);
    }
});
  btnEmbedFile.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnEmbedFile.setBackground(Color.GRAY);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnEmbedFile.setBackground(Color.WHITE);
    }
});
  btnHelp.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnHelp.setBackground(Color.GRAY);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnHelp.setBackground(Color.WHITE);
    }
});
  btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnExit.setBackground(Color.GRAY);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnExit.setBackground(Color.WHITE);
    }
});
  btnEmbedMessage.setBackground(Color.WHITE);
  btnEmbedMessage.setForeground(Color.black);
  btnEmbedFile.setBackground(Color.WHITE);
  btnEmbedFile.setForeground(Color.black);
  btnRetrieveFile.setBackground(Color.WHITE);
  btnRetrieveFile.setForeground(Color.black);
  btnRetrieveMessage.setBackground(Color.WHITE);
  btnRetrieveMessage.setForeground(Color.black);
  btnExit.setBackground(Color.WHITE);
  btnExit.setForeground(Color.black);
  btnHelp.setBackground(Color.WHITE);
  btnHelp.setForeground(Color.black);
  mainPanel.setBackground(Color.lightGray);
  
  
  
//  lblLogo.setBounds(1,1,800,600);
  btnEmbedMessage.setBounds(150, 100, 140, 45);
  btnEmbedFile.setBounds(350, 100, 140, 45);
  btnRetrieveMessage.setBounds(150, 160, 140, 45);
  btnRetrieveFile.setBounds(350, 160, 140, 45);
  btnHelp.setBounds(150, 220, 140, 45);
  btnExit.setBounds(350, 220, 140, 45);
 
 
  mainFrame.add(lblLogo);
  mainFrame.add(btnEmbedMessage);
  mainFrame.add(btnEmbedFile);
  mainFrame.add(btnRetrieveMessage);
  mainFrame.add(btnRetrieveFile);
  mainFrame.add(btnHelp);
  mainFrame.add(btnExit);

  btnEmbedMessage.addActionListener(this);
  btnEmbedFile.addActionListener(this);
  btnRetrieveMessage.addActionListener(this);
  btnRetrieveFile.addActionListener(this);
  btnHelp.addActionListener(this);
  btnExit.addActionListener(this);
  JPanel tempPanel= (JPanel) mainFrame.getContentPane();
  tempPanel.add(mainPanel, BorderLayout.CENTER);
 
  
  
  tempPanel.setBackground(Color.WHITE);
  Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
  mainFrame.setSize((int)(d.width-(d.width*.50)), 
          (int) (d.height-(d.height*.40)));
  mainFrame.setResizable(false);
  mainFrame.setVisible(true);
}

 public void actionPerformed(ActionEvent e) 
        {
  Object source= e.getSource();

  if(source== mnuEmbedMessage || source== btnEmbedMessage)
  {
   back= new Handler(this, Handler.EMBED_MESSAGE);
   back.start();
  }

  if(source== mnuRetrieveMessage || source== btnRetrieveMessage)
  {
   back= new Handler(this, Handler.RETRIEVE_MESSAGE);
   back.start();
  }

  if(source== mnuEmbedFile || source== btnEmbedFile )
  {
   back= new Handler(this, Handler.EMBED_FILE);
   back.start();
  }

  if(source== mnuRetrieveFile || source== btnRetrieveFile )
  {
   back= new Handler(this, Handler.RETRIEVE_FILE);
   back.start();
  }
  if(source== mnuHelp || source== btnHelp)
  {
      JOptionPane.showMessageDialog(mainFrame, 
           "Please write your query to us on - \n"+
           "19bit065@ietdavv.edu.in \n "+
              "19bcs011@ietdavv.edu.in \n"+
              "20i084@ietdavv.edu.in");
  }
  if(source== mnuExit ||  source== btnExit)
  {
   int result= JOptionPane.showConfirmDialog(mainFrame, 
           "Are you sure that you want to close Steganograph.",
           "Confirm Exit", JOptionPane.YES_NO_OPTION);
			if(result== JOptionPane.YES_OPTION)
			{
				
				System.exit(0);
			}
 
   
  }
 }


 	public static void main(String args[])
	{
            MainClass mainClient = new MainClass();
	}
}