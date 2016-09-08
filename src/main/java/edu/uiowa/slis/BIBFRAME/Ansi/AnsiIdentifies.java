package edu.uiowa.slis.BIBFRAME.Ansi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnsiIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnsiIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(AnsiIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AnsiIdentifiesIterator theAnsiIdentifiesIterator = (AnsiIdentifiesIterator)findAncestorWithClass(this, AnsiIdentifiesIterator.class);
			pageContext.getOut().print(theAnsiIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Ansi for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ansi for identifies tag ");
		}
		return SKIP_BODY;
	}
}

