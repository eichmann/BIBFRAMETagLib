package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintEquivalentToInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintEquivalentToInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintEquivalentToInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintEquivalentToInverseIterator thePrintEquivalentToInverseIterator = (PrintEquivalentToInverseIterator)findAncestorWithClass(this, PrintEquivalentToInverseIterator.class);
			pageContext.getOut().print(thePrintEquivalentToInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for equivalentTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for equivalentTo tag ");
		}
		return SKIP_BODY;
	}
}

