package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasPreferredTitleIterator theIntegratingResourceHasPreferredTitleIterator = (IntegratingResourceHasPreferredTitleIterator)findAncestorWithClass(this, IntegratingResourceHasPreferredTitleIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

