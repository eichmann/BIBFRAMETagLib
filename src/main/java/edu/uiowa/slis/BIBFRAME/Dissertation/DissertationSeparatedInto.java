package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationSeparatedIntoIterator theDissertationSeparatedIntoIterator = (DissertationSeparatedIntoIterator)findAncestorWithClass(this, DissertationSeparatedIntoIterator.class);
			pageContext.getOut().print(theDissertationSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}
