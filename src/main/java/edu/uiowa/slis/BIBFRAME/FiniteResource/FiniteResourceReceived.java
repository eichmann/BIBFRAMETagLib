package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceReceivedIterator theFiniteResourceReceivedIterator = (FiniteResourceReceivedIterator)findAncestorWithClass(this, FiniteResourceReceivedIterator.class);
			pageContext.getOut().print(theFiniteResourceReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for received tag ");
		}
		return SKIP_BODY;
	}
}

