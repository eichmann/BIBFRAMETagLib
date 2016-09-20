package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographSeparatedIntoIterator theMonographSeparatedIntoIterator = (MonographSeparatedIntoIterator)findAncestorWithClass(this, MonographSeparatedIntoIterator.class);
			pageContext.getOut().print(theMonographSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

