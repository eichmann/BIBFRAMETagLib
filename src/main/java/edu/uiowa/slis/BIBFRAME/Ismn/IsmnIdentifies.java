package edu.uiowa.slis.BIBFRAME.Ismn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsmnIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsmnIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(IsmnIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IsmnIdentifiesIterator theIsmnIdentifiesIterator = (IsmnIdentifiesIterator)findAncestorWithClass(this, IsmnIdentifiesIterator.class);
			pageContext.getOut().print(theIsmnIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Ismn for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ismn for identifies tag ");
		}
		return SKIP_BODY;
	}
}

