package edu.uiowa.slis.BIBFRAME.Iswc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IswcIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IswcIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(IswcIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IswcIdentifiesIterator theIswcIdentifiesIterator = (IswcIdentifiesIterator)findAncestorWithClass(this, IswcIdentifiesIterator.class);
			pageContext.getOut().print(theIswcIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Iswc for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iswc for identifies tag ");
		}
		return SKIP_BODY;
	}
}

