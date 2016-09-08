package edu.uiowa.slis.BIBFRAME.DissertationIdentifier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationIdentifierIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationIdentifierIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationIdentifierIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationIdentifierIdentifiesIterator theDissertationIdentifierIdentifiesIterator = (DissertationIdentifierIdentifiesIterator)findAncestorWithClass(this, DissertationIdentifierIdentifiesIterator.class);
			pageContext.getOut().print(theDissertationIdentifierIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing DissertationIdentifier for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing DissertationIdentifier for identifies tag ");
		}
		return SKIP_BODY;
	}
}

