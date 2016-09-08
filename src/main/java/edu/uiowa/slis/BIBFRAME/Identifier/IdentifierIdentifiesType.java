package edu.uiowa.slis.BIBFRAME.Identifier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentifierIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IdentifierIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentifierIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IdentifierIdentifiesIterator theIdentifierIdentifiesIterator = (IdentifierIdentifiesIterator)findAncestorWithClass(this, IdentifierIdentifiesIterator.class);
			pageContext.getOut().print(theIdentifierIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Identifier for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identifier for identifies tag ");
		}
		return SKIP_BODY;
	}
}

