package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectAgentInverseIterator theThreeDimensionalObjectAgentInverseIterator = (ThreeDimensionalObjectAgentInverseIterator)findAncestorWithClass(this, ThreeDimensionalObjectAgentInverseIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for agent tag ");
		}
		return SKIP_BODY;
	}
}

