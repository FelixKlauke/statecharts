/**
 * Copyright (c) 2013 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.simulation.core.sruntime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.yakindu.base.base.BasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.yakindu.sct.simulation.core.sruntime.SRuntimeFactory
 * @model kind="package"
 * @generated
 */
public interface SRuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sruntime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.yakindu.org/sct/sruntime/2.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sruntime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SRuntimePackage eINSTANCE = org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.yakindu.sct.simulation.core.sruntime.impl.ExecutionContextImpl <em>Execution Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.ExecutionContextImpl
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getExecutionContext()
	 * @generated
	 */
	int EXECUTION_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__NAME = BasePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Active States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__ACTIVE_STATES = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__EVENTS = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__VARIABLES = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Executed Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__EXECUTED_ELEMENTS = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__SLOTS = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Suspended Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__SUSPENDED_ELEMENTS = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Snapshot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__SNAPSHOT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Execution Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_FEATURE_COUNT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.yakindu.sct.simulation.core.sruntime.impl.ExecutionSlotImpl <em>Execution Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.ExecutionSlotImpl
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getExecutionSlot()
	 * @generated
	 */
	int EXECUTION_SLOT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SLOT__NAME = BasePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SLOT__TYPE = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SLOT__VALUE = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SLOT__QUALIFIED_NAME = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SLOT_FEATURE_COUNT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.yakindu.sct.simulation.core.sruntime.impl.ExecutionEventImpl <em>Execution Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.ExecutionEventImpl
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getExecutionEvent()
	 * @generated
	 */
	int EXECUTION_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EVENT__NAME = EXECUTION_SLOT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EVENT__TYPE = EXECUTION_SLOT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EVENT__VALUE = EXECUTION_SLOT__VALUE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EVENT__QUALIFIED_NAME = EXECUTION_SLOT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Raised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EVENT__RAISED = EXECUTION_SLOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EVENT__SCHEDULED = EXECUTION_SLOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EVENT__DIRECTION = EXECUTION_SLOT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EVENT_FEATURE_COUNT = EXECUTION_SLOT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.yakindu.sct.simulation.core.sruntime.impl.ExecutionVariableImpl <em>Execution Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.ExecutionVariableImpl
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getExecutionVariable()
	 * @generated
	 */
	int EXECUTION_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VARIABLE__NAME = EXECUTION_SLOT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VARIABLE__TYPE = EXECUTION_SLOT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VARIABLE__VALUE = EXECUTION_SLOT__VALUE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VARIABLE__QUALIFIED_NAME = EXECUTION_SLOT__QUALIFIED_NAME;

	/**
	 * The number of structural features of the '<em>Execution Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VARIABLE_FEATURE_COUNT = EXECUTION_SLOT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yakindu.sct.simulation.core.sruntime.impl.CompositeSlotImpl <em>Composite Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.CompositeSlotImpl
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getCompositeSlot()
	 * @generated
	 */
	int COMPOSITE_SLOT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SLOT__NAME = EXECUTION_SLOT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SLOT__TYPE = EXECUTION_SLOT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SLOT__VALUE = EXECUTION_SLOT__VALUE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SLOT__QUALIFIED_NAME = EXECUTION_SLOT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SLOT__SLOTS = EXECUTION_SLOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SLOT_FEATURE_COUNT = EXECUTION_SLOT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.yakindu.sct.simulation.core.sruntime.EventDirection <em>Event Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.sct.simulation.core.sruntime.EventDirection
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getEventDirection()
	 * @generated
	 */
	int EVENT_DIRECTION = 5;

	/**
	 * The meta object id for the '<em>Inferred Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.types.ITypeSystem.InferredType
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getInferredType()
	 * @generated
	 */
	int INFERRED_TYPE = 6;


	/**
	 * The meta object id for the '<em>Java Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getJavaObject()
	 * @generated
	 */
	int JAVA_OBJECT = 7;


	/**
	 * Returns the meta object for class '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Context</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionContext
	 * @generated
	 */
	EClass getExecutionContext();

	/**
	 * Returns the meta object for the reference list '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionContext#getActiveStates <em>Active States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active States</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionContext#getActiveStates()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_ActiveStates();

	/**
	 * Returns the meta object for the reference list '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionContext#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionContext#getEvents()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_Events();

	/**
	 * Returns the meta object for the reference list '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionContext#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionContext#getVariables()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_Variables();

	/**
	 * Returns the meta object for the reference list '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionContext#getExecutedElements <em>Executed Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Elements</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionContext#getExecutedElements()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_ExecutedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionContext#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slots</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionContext#getSlots()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_Slots();

	/**
	 * Returns the meta object for the reference list '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionContext#getSuspendedElements <em>Suspended Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Suspended Elements</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionContext#getSuspendedElements()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_SuspendedElements();

	/**
	 * Returns the meta object for the attribute '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionContext#isSnapshot <em>Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snapshot</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionContext#isSnapshot()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EAttribute getExecutionContext_Snapshot();

	/**
	 * Returns the meta object for class '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionEvent <em>Execution Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Event</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionEvent
	 * @generated
	 */
	EClass getExecutionEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionEvent#isRaised <em>Raised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raised</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionEvent#isRaised()
	 * @see #getExecutionEvent()
	 * @generated
	 */
	EAttribute getExecutionEvent_Raised();

	/**
	 * Returns the meta object for the attribute '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionEvent#isScheduled <em>Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduled</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionEvent#isScheduled()
	 * @see #getExecutionEvent()
	 * @generated
	 */
	EAttribute getExecutionEvent_Scheduled();

	/**
	 * Returns the meta object for the attribute '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionEvent#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionEvent#getDirection()
	 * @see #getExecutionEvent()
	 * @generated
	 */
	EAttribute getExecutionEvent_Direction();

	/**
	 * Returns the meta object for class '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionSlot <em>Execution Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Slot</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionSlot
	 * @generated
	 */
	EClass getExecutionSlot();

	/**
	 * Returns the meta object for the attribute '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionSlot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionSlot#getType()
	 * @see #getExecutionSlot()
	 * @generated
	 */
	EAttribute getExecutionSlot_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionSlot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionSlot#getValue()
	 * @see #getExecutionSlot()
	 * @generated
	 */
	EAttribute getExecutionSlot_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionSlot#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionSlot#getQualifiedName()
	 * @see #getExecutionSlot()
	 * @generated
	 */
	EAttribute getExecutionSlot_QualifiedName();

	/**
	 * Returns the meta object for class '{@link org.yakindu.sct.simulation.core.sruntime.ExecutionVariable <em>Execution Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Variable</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.ExecutionVariable
	 * @generated
	 */
	EClass getExecutionVariable();

	/**
	 * Returns the meta object for class '{@link org.yakindu.sct.simulation.core.sruntime.CompositeSlot <em>Composite Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Slot</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.CompositeSlot
	 * @generated
	 */
	EClass getCompositeSlot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yakindu.sct.simulation.core.sruntime.CompositeSlot#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slots</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.CompositeSlot#getSlots()
	 * @see #getCompositeSlot()
	 * @generated
	 */
	EReference getCompositeSlot_Slots();

	/**
	 * Returns the meta object for enum '{@link org.yakindu.sct.simulation.core.sruntime.EventDirection <em>Event Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Direction</em>'.
	 * @see org.yakindu.sct.simulation.core.sruntime.EventDirection
	 * @generated
	 */
	EEnum getEventDirection();

	/**
	 * Returns the meta object for data type '{@link org.yakindu.base.types.ITypeSystem.InferredType <em>Inferred Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Inferred Type</em>'.
	 * @see org.yakindu.base.types.ITypeSystem.InferredType
	 * @model instanceClass="org.yakindu.base.types.ITypeSystem.InferredType"
	 * @generated
	 */
	EDataType getInferredType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Java Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getJavaObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SRuntimeFactory getSRuntimeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.yakindu.sct.simulation.core.sruntime.impl.ExecutionContextImpl <em>Execution Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.ExecutionContextImpl
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getExecutionContext()
		 * @generated
		 */
		EClass EXECUTION_CONTEXT = eINSTANCE.getExecutionContext();

		/**
		 * The meta object literal for the '<em><b>Active States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__ACTIVE_STATES = eINSTANCE.getExecutionContext_ActiveStates();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__EVENTS = eINSTANCE.getExecutionContext_Events();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__VARIABLES = eINSTANCE.getExecutionContext_Variables();

		/**
		 * The meta object literal for the '<em><b>Executed Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__EXECUTED_ELEMENTS = eINSTANCE.getExecutionContext_ExecutedElements();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__SLOTS = eINSTANCE.getExecutionContext_Slots();

		/**
		 * The meta object literal for the '<em><b>Suspended Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__SUSPENDED_ELEMENTS = eINSTANCE.getExecutionContext_SuspendedElements();

		/**
		 * The meta object literal for the '<em><b>Snapshot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_CONTEXT__SNAPSHOT = eINSTANCE.getExecutionContext_Snapshot();

		/**
		 * The meta object literal for the '{@link org.yakindu.sct.simulation.core.sruntime.impl.ExecutionEventImpl <em>Execution Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.ExecutionEventImpl
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getExecutionEvent()
		 * @generated
		 */
		EClass EXECUTION_EVENT = eINSTANCE.getExecutionEvent();

		/**
		 * The meta object literal for the '<em><b>Raised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_EVENT__RAISED = eINSTANCE.getExecutionEvent_Raised();

		/**
		 * The meta object literal for the '<em><b>Scheduled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_EVENT__SCHEDULED = eINSTANCE.getExecutionEvent_Scheduled();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_EVENT__DIRECTION = eINSTANCE.getExecutionEvent_Direction();

		/**
		 * The meta object literal for the '{@link org.yakindu.sct.simulation.core.sruntime.impl.ExecutionSlotImpl <em>Execution Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.ExecutionSlotImpl
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getExecutionSlot()
		 * @generated
		 */
		EClass EXECUTION_SLOT = eINSTANCE.getExecutionSlot();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_SLOT__TYPE = eINSTANCE.getExecutionSlot_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_SLOT__VALUE = eINSTANCE.getExecutionSlot_Value();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_SLOT__QUALIFIED_NAME = eINSTANCE.getExecutionSlot_QualifiedName();

		/**
		 * The meta object literal for the '{@link org.yakindu.sct.simulation.core.sruntime.impl.ExecutionVariableImpl <em>Execution Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.ExecutionVariableImpl
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getExecutionVariable()
		 * @generated
		 */
		EClass EXECUTION_VARIABLE = eINSTANCE.getExecutionVariable();

		/**
		 * The meta object literal for the '{@link org.yakindu.sct.simulation.core.sruntime.impl.CompositeSlotImpl <em>Composite Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.CompositeSlotImpl
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getCompositeSlot()
		 * @generated
		 */
		EClass COMPOSITE_SLOT = eINSTANCE.getCompositeSlot();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SLOT__SLOTS = eINSTANCE.getCompositeSlot_Slots();

		/**
		 * The meta object literal for the '{@link org.yakindu.sct.simulation.core.sruntime.EventDirection <em>Event Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.sct.simulation.core.sruntime.EventDirection
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getEventDirection()
		 * @generated
		 */
		EEnum EVENT_DIRECTION = eINSTANCE.getEventDirection();

		/**
		 * The meta object literal for the '<em>Inferred Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.types.ITypeSystem.InferredType
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getInferredType()
		 * @generated
		 */
		EDataType INFERRED_TYPE = eINSTANCE.getInferredType();

		/**
		 * The meta object literal for the '<em>Java Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.yakindu.sct.simulation.core.sruntime.impl.SRuntimePackageImpl#getJavaObject()
		 * @generated
		 */
		EDataType JAVA_OBJECT = eINSTANCE.getJavaObject();

	}

} //SRuntimePackage