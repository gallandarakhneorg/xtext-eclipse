/*
* generated by Xtext
*/
package org.eclipse.xtext.formatting2.regionaccess.internal;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RegionAccessTestLanguageStandaloneSetup extends RegionAccessTestLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new RegionAccessTestLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
