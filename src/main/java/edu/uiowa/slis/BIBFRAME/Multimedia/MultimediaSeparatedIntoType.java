package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaSeparatedIntoIterator theMultimediaSeparatedIntoIterator = (MultimediaSeparatedIntoIterator)findAncestorWithClass(this, MultimediaSeparatedIntoIterator.class);
			pageContext.getOut().print(theMultimediaSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

