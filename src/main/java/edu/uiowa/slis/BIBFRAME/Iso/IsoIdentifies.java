package edu.uiowa.slis.BIBFRAME.Iso;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsoIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsoIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(IsoIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IsoIdentifiesIterator theIsoIdentifiesIterator = (IsoIdentifiesIterator)findAncestorWithClass(this, IsoIdentifiesIterator.class);
			pageContext.getOut().print(theIsoIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Iso for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iso for identifies tag ");
		}
		return SKIP_BODY;
	}
}
