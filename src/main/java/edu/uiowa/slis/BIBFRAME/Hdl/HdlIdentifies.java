package edu.uiowa.slis.BIBFRAME.Hdl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HdlIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static HdlIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(HdlIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HdlIdentifiesIterator theHdlIdentifiesIterator = (HdlIdentifiesIterator)findAncestorWithClass(this, HdlIdentifiesIterator.class);
			pageContext.getOut().print(theHdlIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Hdl for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hdl for identifies tag ");
		}
		return SKIP_BODY;
	}
}

