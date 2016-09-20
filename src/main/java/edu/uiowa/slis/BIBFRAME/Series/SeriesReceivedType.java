package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesReceivedIterator theSeriesReceivedIterator = (SeriesReceivedIterator)findAncestorWithClass(this, SeriesReceivedIterator.class);
			pageContext.getOut().print(theSeriesReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for received tag ");
		}
		return SKIP_BODY;
	}
}

