package edu.uiowa.slis.BIBFRAME.TitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleElementPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleElementPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleElementPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TitleElementPrecedesIterator theTitleElementPrecedesIterator = (TitleElementPrecedesIterator)findAncestorWithClass(this, TitleElementPrecedesIterator.class);
			pageContext.getOut().print(theTitleElementPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing TitleElement for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing TitleElement for precedes tag ");
		}
		return SKIP_BODY;
	}
}

