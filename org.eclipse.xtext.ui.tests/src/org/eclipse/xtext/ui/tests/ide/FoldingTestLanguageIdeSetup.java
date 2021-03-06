/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.tests.FoldingTestLanguageRuntimeModule;
import org.eclipse.xtext.ui.tests.FoldingTestLanguageStandaloneSetup;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class FoldingTestLanguageIdeSetup extends FoldingTestLanguageStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new FoldingTestLanguageRuntimeModule(), new FoldingTestLanguageIdeModule());
	}
}
