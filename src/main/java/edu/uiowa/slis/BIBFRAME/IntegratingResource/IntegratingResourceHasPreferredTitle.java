package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasPreferredTitleIterator theIntegratingResourceHasPreferredTitleIterator = (IntegratingResourceHasPreferredTitleIterator)findAncestorWithClass(this, IntegratingResourceHasPreferredTitleIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

