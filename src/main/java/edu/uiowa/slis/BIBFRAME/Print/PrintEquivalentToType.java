package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintEquivalentToType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintEquivalentToType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintEquivalentToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintEquivalentToIterator thePrintEquivalentToIterator = (PrintEquivalentToIterator)findAncestorWithClass(this, PrintEquivalentToIterator.class);
			pageContext.getOut().print(thePrintEquivalentToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for equivalentTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for equivalentTo tag ");
		}
		return SKIP_BODY;
	}
}

