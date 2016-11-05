package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectRelationIterator theThreeDimensionalObjectRelationIterator = (ThreeDimensionalObjectRelationIterator)findAncestorWithClass(this, ThreeDimensionalObjectRelationIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for relation tag ");
		}
		return SKIP_BODY;
	}
}

