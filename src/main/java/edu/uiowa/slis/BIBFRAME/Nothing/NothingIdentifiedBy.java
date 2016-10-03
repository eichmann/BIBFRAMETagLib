package edu.uiowa.slis.BIBFRAME.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NothingIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingIdentifiedByIterator theNothingIdentifiedByIterator = (NothingIdentifiedByIterator)findAncestorWithClass(this, NothingIdentifiedByIterator.class);
			pageContext.getOut().print(theNothingIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

