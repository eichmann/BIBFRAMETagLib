package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasPartIterator theSeriesHasPartIterator = (SeriesHasPartIterator)findAncestorWithClass(this, SeriesHasPartIterator.class);
			pageContext.getOut().print(theSeriesHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

