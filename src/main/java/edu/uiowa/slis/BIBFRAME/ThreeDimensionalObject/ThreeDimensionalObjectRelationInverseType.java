package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectRelationInverseIterator theThreeDimensionalObjectRelationInverseIterator = (ThreeDimensionalObjectRelationInverseIterator)findAncestorWithClass(this, ThreeDimensionalObjectRelationInverseIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for relation tag ");
		}
		return SKIP_BODY;
	}
}

