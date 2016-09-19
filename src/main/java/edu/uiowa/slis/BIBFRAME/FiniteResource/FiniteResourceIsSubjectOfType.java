package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceIsSubjectOfIterator theFiniteResourceIsSubjectOfIterator = (FiniteResourceIsSubjectOfIterator)findAncestorWithClass(this, FiniteResourceIsSubjectOfIterator.class);
			pageContext.getOut().print(theFiniteResourceIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

