package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintDuration extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintDuration currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintDuration.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintDurationIterator thePrint = (PrintDurationIterator)findAncestorWithClass(this, PrintDurationIterator.class);
			pageContext.getOut().print(thePrint.getDuration());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for duration tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for duration tag ");
		}
		return SKIP_BODY;
	}
}

