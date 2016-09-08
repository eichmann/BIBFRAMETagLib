package edu.uiowa.slis.BIBFRAME.SystemNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SystemNumberIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SystemNumberIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SystemNumberIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SystemNumberIdentifiesIterator theSystemNumberIdentifiesIterator = (SystemNumberIdentifiesIterator)findAncestorWithClass(this, SystemNumberIdentifiesIterator.class);
			pageContext.getOut().print(theSystemNumberIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SystemNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing SystemNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

