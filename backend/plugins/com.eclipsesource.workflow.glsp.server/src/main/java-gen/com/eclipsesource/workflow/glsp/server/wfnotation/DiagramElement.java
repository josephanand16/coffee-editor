/**
 * Copyright (c) 2019 EclipseSource and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
package com.eclipsesource.workflow.glsp.server.wfnotation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eclipsesource.workflow.glsp.server.wfnotation.DiagramElement#getSemanticElement <em>Semantic Element</em>}</li>
 *   <li>{@link com.eclipsesource.workflow.glsp.server.wfnotation.DiagramElement#getGraphicId <em>Graphic Id</em>}</li>
 * </ul>
 *
 * @see com.eclipsesource.workflow.glsp.server.wfnotation.WfnotationPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Semantic Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Element</em>' containment reference.
	 * @see #setSemanticElement(SemanticProxy)
	 * @see com.eclipsesource.workflow.glsp.server.wfnotation.WfnotationPackage#getDiagramElement_SemanticElement()
	 * @model containment="true"
	 * @generated
	 */
	SemanticProxy getSemanticElement();

	/**
	 * Sets the value of the '{@link com.eclipsesource.workflow.glsp.server.wfnotation.DiagramElement#getSemanticElement <em>Semantic Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Element</em>' containment reference.
	 * @see #getSemanticElement()
	 * @generated
	 */
	void setSemanticElement(SemanticProxy value);

	/**
	 * Returns the value of the '<em><b>Graphic Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic Id</em>' attribute.
	 * @see #setGraphicId(String)
	 * @see com.eclipsesource.workflow.glsp.server.wfnotation.WfnotationPackage#getDiagramElement_GraphicId()
	 * @model required="true"
	 * @generated
	 */
	String getGraphicId();

	/**
	 * Sets the value of the '{@link com.eclipsesource.workflow.glsp.server.wfnotation.DiagramElement#getGraphicId <em>Graphic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Id</em>' attribute.
	 * @see #getGraphicId()
	 * @generated
	 */
	void setGraphicId(String value);

} // DiagramElement
