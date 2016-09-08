package edu.uiowa.slis.BIBFRAME.Issn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssnIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IssnIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssnIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssnIdentifiesIterator theIssnIdentifiesIterator = (IssnIdentifiesIterator)findAncestorWithClass(this, IssnIdentifiesIterator.class);
			pageContext.getOut().print(theIssnIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issn for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issn for identifies tag ");
		}
		return SKIP_BODY;
	}
}

