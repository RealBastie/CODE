/**
 * Copyright 2010, 2017 Sebastian Ritter
 *
 * Lizenziert unter der EUPL, nur Version 1.1 ("Lizenz");
 * 
 * Sie dürfen dieses Werk ausschließlich gemäß
 * dieser Lizenz nutzen.
 * Eine Kopie der Lizenz finden Sie hier:
 *
 * http://ec.europa.eu/idabc/eupl5
 * 
 * Sofern nicht durch anwendbare Rechtsvorschriften
 * gefordert oder in schriftlicher Form vereinbart, wird
 * die unter der Lizenz verbreitete Software "so wie sie
 * ist", OHNE JEGLICHE GEWÄHRLEISTUNG ODER BEDINGUNGEN -
 * ausdrücklich oder stillschweigend - verbreitet.
 * Die sprachspezifischen Genehmigungen und Beschränkungen
 * unter der Lizenz sind dem Lizenztext zu entnehmen.
 */
package biz.ritter.develop.cobol.internal;

/**
 * COBOL Einstellungen
 * @author Sͬeͥbͭaͭsͤtͬian
 */
public interface CODEConstants {
  
  /**
   * Public ID für die COBOL Nature.
   */
  public static final String CODE_FULLQUALIFIED_NATURE_ID  = CODEConstants.CODE_CORE_ID
                                                               + "."
                                                               + "CODENature";
  /**
   * Public plugin ID für COBOL Core plugin.
   */
  public static final String CODE_CORE_ID                  = "CODE_Core";
  
  /**
   * Public ID für COBOL Builder.
   */
  public static final String CODE_FULLQUALIFIED_BUILDER_ID = CODE_CORE_ID + "."
                                                               + "CODE_Builder";
}
