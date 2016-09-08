package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaSeparatedFromIterator theMultimediaSeparatedFromIterator = (MultimediaSeparatedFromIterator)findAncestorWithClass(this, MultimediaSeparatedFromIterator.class);
			pageContext.getOut().print(theMultimediaSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

