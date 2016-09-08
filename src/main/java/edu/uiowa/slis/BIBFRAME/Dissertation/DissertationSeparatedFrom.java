package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationSeparatedFromIterator theDissertationSeparatedFromIterator = (DissertationSeparatedFromIterator)findAncestorWithClass(this, DissertationSeparatedFromIterator.class);
			pageContext.getOut().print(theDissertationSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

