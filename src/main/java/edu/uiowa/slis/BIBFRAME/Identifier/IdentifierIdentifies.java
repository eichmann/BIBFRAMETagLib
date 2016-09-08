package edu.uiowa.slis.BIBFRAME.Identifier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentifierIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IdentifierIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentifierIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IdentifierIdentifiesIterator theIdentifierIdentifiesIterator = (IdentifierIdentifiesIterator)findAncestorWithClass(this, IdentifierIdentifiesIterator.class);
			pageContext.getOut().print(theIdentifierIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Identifier for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identifier for identifies tag ");
		}
		return SKIP_BODY;
	}
}

