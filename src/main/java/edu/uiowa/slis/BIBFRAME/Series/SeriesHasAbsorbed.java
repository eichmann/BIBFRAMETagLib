package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasAbsorbedIterator theSeriesHasAbsorbedIterator = (SeriesHasAbsorbedIterator)findAncestorWithClass(this, SeriesHasAbsorbedIterator.class);
			pageContext.getOut().print(theSeriesHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

