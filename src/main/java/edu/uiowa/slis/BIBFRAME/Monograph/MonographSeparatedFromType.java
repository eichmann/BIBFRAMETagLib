package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographSeparatedFromIterator theMonographSeparatedFromIterator = (MonographSeparatedFromIterator)findAncestorWithClass(this, MonographSeparatedFromIterator.class);
			pageContext.getOut().print(theMonographSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

