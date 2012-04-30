/*
 * The MIT License
 *
 * Copyright (c) <2010> <tap4j>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.tap4j.model;

import java.io.Serializable;

/**
 * Represents a Test Directive. Usually it would be a TO DO or SKIP directive.
 * 
 * @author Bruno P. Kinoshita - http://www.kinoshita.eti.br
 * @since 1.0
 */
public class Directive implements Serializable {
	private static final long serialVersionUID = 4259454717844916049L;

	public enum ID {
		SKIP, TODO
	}

	/**
	 * Directive Value (TO DO, SKIP).
	 */
	private final Directive.ID directiveValue;

	/**
	 * Reason for the directive.
	 */
	private final String reason;

	/**
	 * Constructor with parameters.
	 * 
	 * @param directiveValue
	 *            Directive Value.
	 * @param reason
	 *            Reason for the directive.
	 */
	public Directive(Directive.ID directiveValue, String reason) {
		super();
		this.directiveValue = directiveValue;
		this.reason = reason;
	}

	/**
	 * @return Directive Value.
	 */
	public Directive.ID getDirectiveValue() {
		return this.directiveValue;
	}

	/**
	 * @return Reason for the directive.
	 */
	public String getReason() {
		return this.reason;
	}

}
