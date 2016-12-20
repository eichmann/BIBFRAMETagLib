package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOIsPartOfIterator theRWOIsPartOfIterator = (RWOIsPartOfIterator)findAncestorWithClass(this, RWOIsPartOfIterator.class);
			pageContext.getOut().print(theRWOIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

