package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintIssuedWithInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintIssuedWithInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintIssuedWithInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintIssuedWithInverseIterator thePrintIssuedWithInverseIterator = (PrintIssuedWithInverseIterator)findAncestorWithClass(this, PrintIssuedWithInverseIterator.class);
			pageContext.getOut().print(thePrintIssuedWithInverseIterator.getIssuedWithInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for issuedWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for issuedWith tag ");
		}
		return SKIP_BODY;
	}
}

