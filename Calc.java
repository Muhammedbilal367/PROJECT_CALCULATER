import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calc implements ActionListener{
	JFrame mainframe;
	JLabel l1;
	JButton n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,ndot,nequal,ndiv,nmul,nmin;
	JButton nplus,ac;
	String oldv,newv;
	int count=0;
	float res=0;
	public Calc(){
	mainframe=new JFrame("CALCULATER");
	mainframe.setSize(600, 500);
	mainframe.setVisible(true);
	mainframe.setLocation(30, 60);
	mainframe.setDefaultCloseOperation(mainframe.EXIT_ON_CLOSE);
	
	l1=new JLabel("");
	l1.setHorizontalAlignment(SwingConstants.CENTER);
	l1.setBounds(40, 40, 270, 50);
	l1.setBackground(Color.blue);
	l1.setForeground(Color.yellow);
	l1.setOpaque(true);
	mainframe.add(l1);
	
	n7=new JButton("7");
	n7.addActionListener(this);
	n7.setBounds(40, 110, 45, 45);
	mainframe.add(n7);
	
	n8=new JButton("8");
	n8.addActionListener(this);
	n8.setBounds(90, 110, 45, 45);
	mainframe.add(n8);
	
	n9=new JButton("9");
	n9.addActionListener(this);
	n9.setBounds(140, 110, 45, 45);
	mainframe.add(n9);
	
	n4=new JButton("4");
	n4.addActionListener(this);
	n4.setBounds(40, 160, 45, 45);
	mainframe.add(n4);
	
	n5=new JButton("5");
	n5.addActionListener(this);
	n5.setBounds(90, 160, 45, 45);
	mainframe.add(n5);
		
	n6=new JButton("6");
	n6.addActionListener(this);
	n6.setBounds(140, 160, 45, 45);
	mainframe.add(n6);
	
	n1=new JButton("1");
	n1.addActionListener(this);
	n1.setBounds(40, 210, 45, 45);
	mainframe.add(n1);
	
	n2=new JButton("2");
	n2.addActionListener(this);
	n2.setBounds(90, 210, 45, 45);
	mainframe.add(n2);
	
	n3=new JButton("3");
	n3.addActionListener(this);
	n3.setBounds(140, 210, 45, 45);
	mainframe.add(n3);
	
	ndot=new JButton(".");
	ndot.addActionListener(this);
	ndot.setBounds(40, 260, 45, 45);
	mainframe.add(ndot);
	
	n0=new JButton("0");
	n0.addActionListener(this);
	n0.setBounds(90, 260, 45, 45);
	mainframe.add(n0);
	
	nequal=new JButton("=");
	nequal.addActionListener(this);
	nequal.setBounds(140, 260, 100, 45);
	nequal.setBackground(Color.red);
	nequal.setForeground(Color.white);
	mainframe.add(nequal);
	
	ndiv=new JButton("/");
	ndiv.addActionListener(this);
	ndiv.setBounds(260, 110, 45, 45);
	mainframe.add(ndiv);
	
	nmul=new JButton("X");
	nmul.addActionListener(this);
	nmul.setBounds(260, 160, 45, 45);
	mainframe.add(nmul);
	
	nmin=new JButton("-");
	nmin.addActionListener(this);
	nmin.setBounds(260, 210, 45, 45);
	mainframe.add(nmin);
	
	nplus=new JButton("+");
	nplus.addActionListener(this);
	nplus.setBounds(260, 260, 45, 45);
	mainframe.add(nplus);
	
	ac=new JButton("AC");
	ac.addActionListener(this);
	ac.setBounds(195, 110, 50, 140);
	ac.setBackground(Color.red);
	ac.setForeground(Color.white);
	ac.setOpaque(true);
	mainframe.add(ac);
	
	mainframe.setLayout(null);
	
}

	public static void main(String[] args) {
		new Calc();
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
    
	if(e.getSource()==n7)
	{
		l1.setText(l1.getText()+"7");
	}
	else if(e.getSource()==n8)
	{
		l1.setText(l1.getText()+"8");
	}
	else if(e.getSource()==n9)
	{
	    l1.setText(l1.getText()+"9");
	}
	else if(e.getSource()==n1)
    {
        l1.setText(l1.getText()+"1");
    }
	else if(e.getSource()==n2)
    {
        l1.setText(l1.getText()+"2");
    }
	else if(e.getSource()==n3)
    {
        l1.setText(l1.getText()+"3");
    }
	else if(e.getSource()==n4)
    {
        l1.setText(l1.getText()+"4");
    }
	else if(e.getSource()==n5)
    {
        l1.setText(l1.getText()+"5");
    }
	else if(e.getSource()==n6)
    {
        l1.setText(l1.getText()+"6");
    }
	else if(e.getSource()==n0)
    {
        l1.setText(l1.getText()+"0");
    }
	else if(e.getSource()==ndot)
    {
        l1.setText(l1.getText()+".");
    }
	
	
	
	else if(e.getSource()==ndiv)
	{   
	    this.count=1;
	    oldv=l1.getText();
        l1.setText("");
    }
	else if(e.getSource()==nmul)
    {
	    this.count=2;
	    oldv=l1.getText();
        l1.setText("");
    }
	else if(e.getSource()==nplus)
    {
	    this.count=3;
	    oldv=l1.getText();
        l1.setText("");
    }
	else if(e.getSource()==nmin)
    {
	    this.count=5;
	    oldv=l1.getText();
        l1.setText("");
    }
	else if(e.getSource()==nmul)
    {
	    this.count=6;
	    oldv=l1.getText();
        l1.setText("");
    }
	else if(e.getSource()==nequal)
    {
	    
        this.newv=l1.getText();
        float newvf=Float.parseFloat(this.newv);
        float oldvf=Float.parseFloat(this.oldv);
        if(count==1) {
            res=oldvf/newvf;
            }
        else if(count==2) {
            res=oldvf*newvf;
            }
        else if(this.count==3) {
            this.res=oldvf+newvf;
            }
        else if(count==4) {
            res=oldvf-newvf;
        
            }
        l1.setText(this.res+"");

    }
	else if(e.getSource()==ac)
    {
        l1.setText("");
    }
    }
	
}