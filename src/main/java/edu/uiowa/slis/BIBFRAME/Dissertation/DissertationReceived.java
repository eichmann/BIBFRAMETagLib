package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationReceivedIterator theDissertationReceivedIterator = (DissertationReceivedIterator)findAncestorWithClass(this, DissertationReceivedIterator.class);
			pageContext.getOut().print(theDissertationReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for received tag ");
		}
		return SKIP_BODY;
	}
}

