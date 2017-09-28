/**
 * Copyright (c) 2017 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	rbeckmann - initial API and implementation
 * 
 */
package org.yakindu.sct.generator.c.language

import org.yakindu.sct.generator.common.ICodeBlock

/**
 * @author rbeckmann
 *
 */
abstract class CodeBlock extends org.yakindu.sct.generator.common.CodeBlock implements ICodeBlock {
	protected static final CharSequence BLOCKOPEN = '''
	{
	'''
	
	protected static final CharSequence BLOCKCLOSE = '''
	}
	'''
	
	override getBlockClose() {
		return BLOCKCLOSE
	}
	
	override getBlockOpen() {
		return BLOCKOPEN
	}
}