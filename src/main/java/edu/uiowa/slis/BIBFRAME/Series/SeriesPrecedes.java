package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesPrecedesIterator theSeriesPrecedesIterator = (SeriesPrecedesIterator)findAncestorWithClass(this, SeriesPrecedesIterator.class);
			pageContext.getOut().print(theSeriesPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for precedes tag ");
		}
		return SKIP_BODY;
	}
}

