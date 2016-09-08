package edu.uiowa.slis.BIBFRAME.Isan;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsanIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsanIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(IsanIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IsanIdentifiesIterator theIsanIdentifiesIterator = (IsanIdentifiesIterator)findAncestorWithClass(this, IsanIdentifiesIterator.class);
			pageContext.getOut().print(theIsanIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Isan for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isan for identifies tag ");
		}
		return SKIP_BODY;
	}
}

