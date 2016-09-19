package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWODeathDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWODeathDate currentInstance = null;
	private static final Log log = LogFactory.getLog(RWODeathDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RWODeathDateIterator theRWO = (RWODeathDateIterator)findAncestorWithClass(this, RWODeathDateIterator.class);
			pageContext.getOut().print(theRWO.getDeathDate());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for deathDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for deathDate tag ");
		}
		return SKIP_BODY;
	}
}

