package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOHasPartIterator theRWOHasPartIterator = (RWOHasPartIterator)findAncestorWithClass(this, RWOHasPartIterator.class);
			pageContext.getOut().print(theRWOHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

