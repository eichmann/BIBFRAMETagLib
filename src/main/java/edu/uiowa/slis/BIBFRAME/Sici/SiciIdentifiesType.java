package edu.uiowa.slis.BIBFRAME.Sici;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SiciIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SiciIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SiciIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SiciIdentifiesIterator theSiciIdentifiesIterator = (SiciIdentifiesIterator)findAncestorWithClass(this, SiciIdentifiesIterator.class);
			pageContext.getOut().print(theSiciIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Sici for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sici for identifies tag ");
		}
		return SKIP_BODY;
	}
}

