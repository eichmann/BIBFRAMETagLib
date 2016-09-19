package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintIssuedWithInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintIssuedWithInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintIssuedWithInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintIssuedWithInverseIterator thePrintIssuedWithInverseIterator = (PrintIssuedWithInverseIterator)findAncestorWithClass(this, PrintIssuedWithInverseIterator.class);
			pageContext.getOut().print(thePrintIssuedWithInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for issuedWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for issuedWith tag ");
		}
		return SKIP_BODY;
	}
}

