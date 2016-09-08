package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintPreferredCitation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintPreferredCitation currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintPreferredCitation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintPreferredCitationIterator thePrint = (PrintPreferredCitationIterator)findAncestorWithClass(this, PrintPreferredCitationIterator.class);
			pageContext.getOut().print(thePrint.getPreferredCitation());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for preferredCitation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for preferredCitation tag ");
		}
		return SKIP_BODY;
	}
}

