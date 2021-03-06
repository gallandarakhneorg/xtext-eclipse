/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.tests.tasks;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.junit4.internal.LineDelimiters;
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.tasks.TaskMarkerContributor;
import org.eclipse.xtext.ui.tasks.TaskMarkerTypeProvider;
import org.eclipse.xtext.ui.tests.ui.internal.TestsActivator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Stefan Oehme - Initial contribution and API
 */
@SuppressWarnings("all")
public class TaskMarkerContributorTest extends AbstractXtextTests {
  @Inject
  private TaskMarkerContributor markerContributor;
  
  @Before
  public void setup() {
    this.setInjector(TestsActivator.getInstance().getInjector(
      TestsActivator.ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_DOMAINMODELTESTLANGUAGE));
    this.injectMembers(this);
  }
  
  @Test
  public void testMarkerCreation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* TODO foo");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* FIXME bar");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      final IFile file = IResourcesSetupUtil.createFile("foo/foo.domainModelTest", 
        LineDelimiters.toUnix(_builder.toString()));
      final XtextResource resource = this.getResource(file);
      NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
      this.markerContributor.updateMarkers(file, resource, _nullProgressMonitor);
      final IMarker[] markers = file.findMarkers(TaskMarkerTypeProvider.XTEXT_TASK_TYPE, true, IResource.DEPTH_ZERO);
      Assert.assertEquals(2, ((List<IMarker>)Conversions.doWrapArray(markers)).size());
      Assert.assertEquals("TODO foo", IterableExtensions.<IMarker>head(((Iterable<IMarker>)Conversions.doWrapArray(markers))).getAttribute(IMarker.MESSAGE));
      Assert.assertEquals(Integer.valueOf(2), IterableExtensions.<IMarker>head(((Iterable<IMarker>)Conversions.doWrapArray(markers))).getAttribute(IMarker.LINE_NUMBER));
      Assert.assertEquals(Integer.valueOf(6), IterableExtensions.<IMarker>head(((Iterable<IMarker>)Conversions.doWrapArray(markers))).getAttribute(IMarker.CHAR_START));
      Assert.assertEquals(Integer.valueOf(14), IterableExtensions.<IMarker>head(((Iterable<IMarker>)Conversions.doWrapArray(markers))).getAttribute(IMarker.CHAR_END));
      Assert.assertEquals(Integer.valueOf(IMarker.PRIORITY_NORMAL), IterableExtensions.<IMarker>head(((Iterable<IMarker>)Conversions.doWrapArray(markers))).getAttribute(IMarker.PRIORITY));
      Assert.assertEquals("line 2", IterableExtensions.<IMarker>head(((Iterable<IMarker>)Conversions.doWrapArray(markers))).getAttribute(IMarker.LOCATION));
      Assert.assertEquals("FIXME bar", markers[1].getAttribute(IMarker.MESSAGE));
      Assert.assertEquals(Integer.valueOf(3), markers[1].getAttribute(IMarker.LINE_NUMBER));
      Assert.assertEquals(Integer.valueOf(18), markers[1].getAttribute(IMarker.CHAR_START));
      Assert.assertEquals(Integer.valueOf(27), markers[1].getAttribute(IMarker.CHAR_END));
      Assert.assertEquals(Integer.valueOf(IMarker.PRIORITY_HIGH), markers[1].getAttribute(IMarker.PRIORITY));
      Assert.assertEquals("line 3", markers[1].getAttribute(IMarker.LOCATION));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public XtextResource getResource(final IFile file) {
    try {
      return this.getResource(IResourcesSetupUtil.fileToString(file), URI.createFileURI(file.getFullPath().toString()).toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @After
  public void cleanUp() {
    try {
      IResourcesSetupUtil.cleanWorkspace();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
