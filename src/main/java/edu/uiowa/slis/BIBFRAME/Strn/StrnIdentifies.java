package edu.uiowa.slis.BIBFRAME.Strn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StrnIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StrnIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(StrnIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StrnIdentifiesIterator theStrnIdentifiesIterator = (StrnIdentifiesIterator)findAncestorWithClass(this, StrnIdentifiesIterator.class);
			pageContext.getOut().print(theStrnIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Strn for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Strn for identifies tag ");
		}
		return SKIP_BODY;
	}
}

