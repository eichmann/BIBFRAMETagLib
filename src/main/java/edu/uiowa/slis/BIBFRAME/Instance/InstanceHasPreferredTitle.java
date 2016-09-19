package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceHasPreferredTitleIterator theInstanceHasPreferredTitleIterator = (InstanceHasPreferredTitleIterator)findAncestorWithClass(this, InstanceHasPreferredTitleIterator.class);
			pageContext.getOut().print(theInstanceHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

