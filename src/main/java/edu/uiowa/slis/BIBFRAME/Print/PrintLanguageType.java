package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintLanguageIterator thePrintLanguageIterator = (PrintLanguageIterator)findAncestorWithClass(this, PrintLanguageIterator.class);
			pageContext.getOut().print(thePrintLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for language tag ");
		}
		return SKIP_BODY;
	}
}

