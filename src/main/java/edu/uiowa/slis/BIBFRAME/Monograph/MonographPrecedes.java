package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographPrecedesIterator theMonographPrecedesIterator = (MonographPrecedesIterator)findAncestorWithClass(this, MonographPrecedesIterator.class);
			pageContext.getOut().print(theMonographPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for precedes tag ");
		}
		return SKIP_BODY;
	}
}

