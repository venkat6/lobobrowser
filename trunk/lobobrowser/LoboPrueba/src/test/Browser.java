package test;


import java.awt.Dimension;
import java.util.Locale;

import org.lobobrowser.gui.BrowserPanel;




	/**
	 * Esta clase instancia un Panel de navegador web Lobo.
	 * 
	 * @author Agustin Burgos
	 */

public class Browser{
		
		/**
		 * Panel de navegador web lobo. Extiende JPanel de Swing
		 */
		private BrowserPanel panel;
		
		/**
		 * Url de la pagina web que será exhibida por el navegador
		 */
		private String url;


		/**
		 * serialVersionUID de la clase
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * Constructor de la clase. Recibe por parametro la url, el ancho y el lato del panel
		 * del navegador
		 * @param url
		 * @param width
		 * @param height
		 * @throws Exception
		 */
		public Browser (String url, int width, int height) throws Exception{

			this.setUrl(url);
		
			Locale.setDefault(Locale.getDefault());
		
			panel = new BrowserPanel();
			
			BrowserManager.getInstance().addBrowser(panel);

			panel.navigate(this.getUrl());
		
			this.setDimension(width, height);
		}
		
		/**
		 * Este metodo setea la dimension del panel del navegador
		 * @param width
		 * @param height
		 */
		public void setDimension(int width, int height) {
			this.panel.setSize(new Dimension(width,height));
		}

		/**
		 * Este metodo retorna el panel con el navegador Lobo incrustado en él
		 * @return panel
		 */
		public BrowserPanel getPanel() {
			return panel;
		}

		/**
		 * Este metodo retorna la url que tiene seteada por defecto el navegador
		 * @return url
		 */
		public String getUrl() {
			return url;
		}
		
		/**
		 * Este metodo setea la url que será exhibida por el navegador
		 * @param url
		 */
		public void setUrl(String url) {
			this.url = url;
		}
		
		/**
		 * Este metodo retorna el ancho del panel del navegador
		 * @return (int) this.panel.getWidth()
		 */
		public int getWidth() {
			return this.panel.getWidth();
		}
		
		/**
		 * Este metodo retorna el alto del panel del navegador
		 * @return (int)this.panel.getHeight()
		 */
		public int getHeight() {
			return this.panel.getHeight();
		}
	}

