/**
 * 
 */
package util;

/** ********************************************* **
 * CGDebug.java
 * Debugger class for software development
 * @author Christian Garrovillo
 * Information and Communications Technologies
 *
 ** ********************************************* **
 */
public class DebugCG {

	DebugCG debug;
	private int debugLevel;
	
	public DebugCG getInstance() {
		if (this.debug == null) {
			this.debug = new DebugCG();
		}
		return this.debug;
	}
	
	private DebugCG() {}
	
	public DebugCG(int level) {
		this.debugLevel = level;
	}

	/**
	 * @return the debugLevel
	 */
	public int getDebugLevel() {
		return debugLevel;
	}
	
	public void output(int level) {
		if (level <= this.debugLevel)
			System.out.println("DEBUG at level " + level);
		else {}
	}
	
	public void output(int level, String msg) {
		if (level <= this.debugLevel) 
			System.out.println(msg);
		else {}
	}
	
}
