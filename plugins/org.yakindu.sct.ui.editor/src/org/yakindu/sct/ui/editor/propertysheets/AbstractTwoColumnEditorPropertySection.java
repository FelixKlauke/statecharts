/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.propertysheets;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Text;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public abstract class AbstractTwoColumnEditorPropertySection extends
		AbstractEditorPropertySection {

    protected Text documentation;

    protected abstract void createRightColumnControls(Composite rightColumn);

	protected abstract void createLeftColumnControls(Composite leftColumn);

	@Override
	public void createControls(Composite parent) {
		parent.setLayout(new FillLayout());
		SashForm sashForm = new SashForm(parent, SWT.HORIZONTAL | SWT.SMOOTH);
		sashForm.setSashWidth(2);
		sashForm.setBackground(sashForm.getDisplay().getSystemColor( SWT.COLOR_GRAY));
		sashForm.setLayout(new FillLayout());
		Composite leftColumn = getToolkit().createComposite(sashForm);
		leftColumn.setLayout(createLeftColumnLayout());
		Composite rightColumn = getToolkit().createComposite(sashForm);
		rightColumn.setLayout(createRightColumnLayout());
		sashForm.setWeights(new int[] { 1, 1 });
		createLeftColumnControls(leftColumn);
		createRightColumnControls(rightColumn);
	}

	@Override
	protected final Layout createBodyLayout() {
		return super.createBodyLayout();
	}

	protected Layout createLeftColumnLayout() {
		return createBodyLayout();
	}

	protected Layout createRightColumnLayout() {
		return createBodyLayout();
	}

    protected void createDocumentationControl(Composite parent) {
        Label lblDocumentation = getToolkit().createLabel(parent, "Documentation: ");
        documentation = getToolkit().createText(parent, "", SWT.MULTI | SWT.BORDER | SWT.V_SCROLL | SWT.WRAP);
        GridDataFactory.fillDefaults().applyTo(lblDocumentation);
        GridDataFactory.fillDefaults().grab(true, true).hint(parent.getSize()).minSize(100, documentation.getLineHeight() * 3).applyTo(documentation);
    }

}
