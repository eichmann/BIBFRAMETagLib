package edu.uiowa.slis.BIBFRAME.Nban;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NbanIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NbanIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NbanIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NbanIdentifiesIterator theNbanIdentifiesIterator = (NbanIdentifiesIterator)findAncestorWithClass(this, NbanIdentifiesIterator.class);
			pageContext.getOut().print(theNbanIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Nban for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nban for identifies tag ");
		}
		return SKIP_BODY;
	}
}

