package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOIdentifiedByIterator theRWOIdentifiedByIterator = (RWOIdentifiedByIterator)findAncestorWithClass(this, RWOIdentifiedByIterator.class);
			pageContext.getOut().print(theRWOIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

