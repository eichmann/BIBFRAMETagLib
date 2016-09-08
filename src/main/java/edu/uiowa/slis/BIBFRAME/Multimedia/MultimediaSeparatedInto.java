package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaSeparatedIntoIterator theMultimediaSeparatedIntoIterator = (MultimediaSeparatedIntoIterator)findAncestorWithClass(this, MultimediaSeparatedIntoIterator.class);
			pageContext.getOut().print(theMultimediaSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

