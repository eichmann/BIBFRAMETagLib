package edu.uiowa.slis.BIBFRAME.Nbn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NbnIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NbnIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(NbnIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NbnIdentifiesIterator theNbnIdentifiesIterator = (NbnIdentifiesIterator)findAncestorWithClass(this, NbnIdentifiesIterator.class);
			pageContext.getOut().print(theNbnIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Nbn for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nbn for identifies tag ");
		}
		return SKIP_BODY;
	}
}

