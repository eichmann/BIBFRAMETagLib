package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationIsFirstOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationIsFirstOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationIsFirstOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationIsFirstOfIterator theDissertationIsFirstOfIterator = (DissertationIsFirstOfIterator)findAncestorWithClass(this, DissertationIsFirstOfIterator.class);
			pageContext.getOut().print(theDissertationIsFirstOfIterator.getIsFirstOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

