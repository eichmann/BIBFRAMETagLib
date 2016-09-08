package edu.uiowa.slis.BIBFRAME.IssnL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssnLIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IssnLIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssnLIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssnLIdentifiesIterator theIssnLIdentifiesIterator = (IssnLIdentifiesIterator)findAncestorWithClass(this, IssnLIdentifiesIterator.class);
			pageContext.getOut().print(theIssnLIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IssnL for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssnL for identifies tag ");
		}
		return SKIP_BODY;
	}
}

