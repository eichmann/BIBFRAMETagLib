package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FamilyReceivedIterator theFamilyReceivedIterator = (FamilyReceivedIterator)findAncestorWithClass(this, FamilyReceivedIterator.class);
			pageContext.getOut().print(theFamilyReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for received tag ");
		}
		return SKIP_BODY;
	}
}

