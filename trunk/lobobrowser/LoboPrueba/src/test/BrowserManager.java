package test;



import java.util.Vector;

import org.lobobrowser.gui.BrowserPanel;

/**
 * Se encarga de eliminar las instancias de los navegadores web al abandonar un mundo.
 * Esto es para optimizar el consumo de memoria del juego.
 * Se utiliza el patr�n de dise�o Singleton.
 * @author Guido Pochettino
 */
public class BrowserManager {

	/**
	 * Instancia �nica.
	 */
	private static BrowserManager instance;
	
	/**
	 * Colecci�n que contiene todos los navegadores cargados en un mundo.
	 */
	private Vector<BrowserPanel> browsers;
	
	/**
	 * Constructor por defecto.
	 */
	private BrowserManager(){
		browsers = new Vector<BrowserPanel>();
	}
	
	/**
	 * M�todo de acceso a la instancia �nica.
	 * @return
	 */
	public static BrowserManager getInstance(){
		if ( instance == null )
			instance = new BrowserManager();
		return instance;
	}
	
	/**
	 * Se agrega un browser para monitorear.
	 * @param browser
	 */
	public void addBrowser(BrowserPanel browser){
		browsers.add(browser);
	}
	
	/**
	 * Se dan de baja todos los navegadores cargados hasta el momento.
	 */
	public void eraseBrowsers(){
		for (int i = 0; i < browsers.size(); i++) {
			browsers.get(i).dispose();
		}
		browsers.clear();
	}
}
