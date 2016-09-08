package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintProviderStatement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintProviderStatement currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintProviderStatement.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintProviderStatementIterator thePrint = (PrintProviderStatementIterator)findAncestorWithClass(this, PrintProviderStatementIterator.class);
			pageContext.getOut().print(thePrint.getProviderStatement());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for providerStatement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for providerStatement tag ");
		}
		return SKIP_BODY;
	}
}

