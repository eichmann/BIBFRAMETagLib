package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOName currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RWONameIterator theRWO = (RWONameIterator)findAncestorWithClass(this, RWONameIterator.class);
			pageContext.getOut().print(theRWO.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for name tag ");
		}
		return SKIP_BODY;
	}
}

