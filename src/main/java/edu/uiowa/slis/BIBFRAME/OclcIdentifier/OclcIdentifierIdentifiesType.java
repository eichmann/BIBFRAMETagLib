package edu.uiowa.slis.BIBFRAME.OclcIdentifier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OclcIdentifierIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OclcIdentifierIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(OclcIdentifierIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OclcIdentifierIdentifiesIterator theOclcIdentifierIdentifiesIterator = (OclcIdentifierIdentifiesIterator)findAncestorWithClass(this, OclcIdentifierIdentifiesIterator.class);
			pageContext.getOut().print(theOclcIdentifierIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OclcIdentifier for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing OclcIdentifier for identifies tag ");
		}
		return SKIP_BODY;
	}
}

