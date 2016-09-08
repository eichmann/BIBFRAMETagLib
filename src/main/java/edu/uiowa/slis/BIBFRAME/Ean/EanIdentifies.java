package edu.uiowa.slis.BIBFRAME.Ean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EanIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EanIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(EanIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EanIdentifiesIterator theEanIdentifiesIterator = (EanIdentifiesIterator)findAncestorWithClass(this, EanIdentifiesIterator.class);
			pageContext.getOut().print(theEanIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Ean for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ean for identifies tag ");
		}
		return SKIP_BODY;
	}
}

