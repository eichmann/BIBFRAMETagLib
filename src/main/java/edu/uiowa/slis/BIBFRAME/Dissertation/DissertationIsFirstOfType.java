package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationIsFirstOfIterator theDissertationIsFirstOfIterator = (DissertationIsFirstOfIterator)findAncestorWithClass(this, DissertationIsFirstOfIterator.class);
			pageContext.getOut().print(theDissertationIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

