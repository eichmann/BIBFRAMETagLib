package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintCopyrightDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintCopyrightDate currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintCopyrightDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintCopyrightDateIterator thePrint = (PrintCopyrightDateIterator)findAncestorWithClass(this, PrintCopyrightDateIterator.class);
			pageContext.getOut().print(thePrint.getCopyrightDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for copyrightDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for copyrightDate tag ");
		}
		return SKIP_BODY;
	}
}

