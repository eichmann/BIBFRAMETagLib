package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectSupersedesIterator theThreeDimensionalObjectSupersedesIterator = (ThreeDimensionalObjectSupersedesIterator)findAncestorWithClass(this, ThreeDimensionalObjectSupersedesIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

