package edu.uiowa.slis.BIBFRAME.LocalIlsIdentifer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocalIlsIdentiferIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocalIlsIdentiferIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(LocalIlsIdentiferIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocalIlsIdentiferIdentifiesIterator theLocalIlsIdentiferIdentifiesIterator = (LocalIlsIdentiferIdentifiesIterator)findAncestorWithClass(this, LocalIlsIdentiferIdentifiesIterator.class);
			pageContext.getOut().print(theLocalIlsIdentiferIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing LocalIlsIdentifer for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing LocalIlsIdentifer for identifies tag ");
		}
		return SKIP_BODY;
	}
}

