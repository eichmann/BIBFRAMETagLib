package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintIssuedWithType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintIssuedWithType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintIssuedWithType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintIssuedWithIterator thePrintIssuedWithIterator = (PrintIssuedWithIterator)findAncestorWithClass(this, PrintIssuedWithIterator.class);
			pageContext.getOut().print(thePrintIssuedWithIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for issuedWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for issuedWith tag ");
		}
		return SKIP_BODY;
	}
}

