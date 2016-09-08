package edu.uiowa.slis.BIBFRAME.Issn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssnIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IssnIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(IssnIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssnIdentifiesIterator theIssnIdentifiesIterator = (IssnIdentifiesIterator)findAncestorWithClass(this, IssnIdentifiesIterator.class);
			pageContext.getOut().print(theIssnIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Issn for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issn for identifies tag ");
		}
		return SKIP_BODY;
	}
}

