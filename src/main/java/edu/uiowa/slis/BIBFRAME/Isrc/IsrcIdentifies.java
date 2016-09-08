package edu.uiowa.slis.BIBFRAME.Isrc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsrcIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsrcIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(IsrcIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IsrcIdentifiesIterator theIsrcIdentifiesIterator = (IsrcIdentifiesIterator)findAncestorWithClass(this, IsrcIdentifiesIterator.class);
			pageContext.getOut().print(theIsrcIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Isrc for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isrc for identifies tag ");
		}
		return SKIP_BODY;
	}
}

