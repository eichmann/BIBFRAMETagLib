package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationSeparatedIntoIterator theDissertationSeparatedIntoIterator = (DissertationSeparatedIntoIterator)findAncestorWithClass(this, DissertationSeparatedIntoIterator.class);
			pageContext.getOut().print(theDissertationSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

