package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographPrecedesIterator theMonographPrecedesIterator = (MonographPrecedesIterator)findAncestorWithClass(this, MonographPrecedesIterator.class);
			pageContext.getOut().print(theMonographPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for precedes tag ");
		}
		return SKIP_BODY;
	}
}

