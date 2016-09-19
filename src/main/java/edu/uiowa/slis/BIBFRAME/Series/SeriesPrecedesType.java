package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesPrecedesIterator theSeriesPrecedesIterator = (SeriesPrecedesIterator)findAncestorWithClass(this, SeriesPrecedesIterator.class);
			pageContext.getOut().print(theSeriesPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for precedes tag ");
		}
		return SKIP_BODY;
	}
}

