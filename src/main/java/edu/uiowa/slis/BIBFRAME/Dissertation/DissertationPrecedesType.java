package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationPrecedesIterator theDissertationPrecedesIterator = (DissertationPrecedesIterator)findAncestorWithClass(this, DissertationPrecedesIterator.class);
			pageContext.getOut().print(theDissertationPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for precedes tag ");
		}
		return SKIP_BODY;
	}
}

