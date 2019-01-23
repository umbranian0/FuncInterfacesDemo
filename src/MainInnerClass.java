import java.awt.Color;

import javax.swing.JFrame;

class Menu extends JFrame{	
	public Menu() {
	   getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("Content Menu Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        getContentPane().setLayout(null);    
	}
	public void closeIt(){
        this.getContentPane().setVisible(true);
        this.dispose();
    }
};
public class MainInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menu menu = new Menu();	//Classe anonima

		
		//classe anonima (inner class) 
		
		Runnable r  = new Runnable() {
		public void run() {
			System.out.println("Running");
		}
		};
		
	}
}
