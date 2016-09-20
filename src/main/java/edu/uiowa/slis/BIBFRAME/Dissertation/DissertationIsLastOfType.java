package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationIsLastOfIterator theDissertationIsLastOfIterator = (DissertationIsLastOfIterator)findAncestorWithClass(this, DissertationIsLastOfIterator.class);
			pageContext.getOut().print(theDissertationIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

