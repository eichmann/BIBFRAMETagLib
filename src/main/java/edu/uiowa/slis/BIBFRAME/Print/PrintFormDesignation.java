package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintFormDesignationIterator thePrint = (PrintFormDesignationIterator)findAncestorWithClass(this, PrintFormDesignationIterator.class);
			pageContext.getOut().print(thePrint.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

