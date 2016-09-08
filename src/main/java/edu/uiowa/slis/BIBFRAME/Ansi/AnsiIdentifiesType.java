package edu.uiowa.slis.BIBFRAME.Ansi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnsiIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnsiIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AnsiIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AnsiIdentifiesIterator theAnsiIdentifiesIterator = (AnsiIdentifiesIterator)findAncestorWithClass(this, AnsiIdentifiesIterator.class);
			pageContext.getOut().print(theAnsiIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Ansi for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ansi for identifies tag ");
		}
		return SKIP_BODY;
	}
}

