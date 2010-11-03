package test;



import java.util.Vector;

import org.lobobrowser.gui.BrowserPanel;

/**
 * Se encarga de eliminar las instancias de los navegadores web al abandonar un mundo.
 * Esto es para optimizar el consumo de memoria del juego.
 * Se utiliza el patrón de diseño Singleton.
 * @author Guido Pochettino
 */
public class BrowserManager {

	/**
	 * Instancia única.
	 */
	private static BrowserManager instance;
	
	/**
	 * Colección que contiene todos los navegadores cargados en un mundo.
	 */
	private Vector<BrowserPanel> browsers;
	
	/**
	 * Constructor por defecto.
	 */
	private BrowserManager(){
		browsers = new Vector<BrowserPanel>();
	}
	
	/**
	 * Método de acceso a la instancia única.
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
