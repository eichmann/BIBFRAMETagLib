package edu.uiowa.slis.BIBFRAME.Nbn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NbnIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NbnIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NbnIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NbnIdentifiesIterator theNbnIdentifiesIterator = (NbnIdentifiesIterator)findAncestorWithClass(this, NbnIdentifiesIterator.class);
			pageContext.getOut().print(theNbnIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Nbn for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nbn for identifies tag ");
		}
		return SKIP_BODY;
	}
}

