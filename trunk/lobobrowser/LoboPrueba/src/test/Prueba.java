package test;

import javax.swing.JFrame;

public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Browser browser=null;
		try {
			browser = new Browser("www.google.com",800,600);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JFrame frame = new JFrame();
		frame.add(browser.getPanel());
		frame.setSize(800, 600);
		frame.setVisible(true);
	

	}

}
