package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationIsPartOfIterator theDissertationIsPartOfIterator = (DissertationIsPartOfIterator)findAncestorWithClass(this, DissertationIsPartOfIterator.class);
			pageContext.getOut().print(theDissertationIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

