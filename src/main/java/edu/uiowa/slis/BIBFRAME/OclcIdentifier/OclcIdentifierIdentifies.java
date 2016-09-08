package edu.uiowa.slis.BIBFRAME.OclcIdentifier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OclcIdentifierIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OclcIdentifierIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(OclcIdentifierIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OclcIdentifierIdentifiesIterator theOclcIdentifierIdentifiesIterator = (OclcIdentifierIdentifiesIterator)findAncestorWithClass(this, OclcIdentifierIdentifiesIterator.class);
			pageContext.getOut().print(theOclcIdentifierIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing OclcIdentifier for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing OclcIdentifier for identifies tag ");
		}
		return SKIP_BODY;
	}
}

