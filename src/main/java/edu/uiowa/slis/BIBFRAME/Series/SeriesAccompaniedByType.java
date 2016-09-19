package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesAccompaniedByIterator theSeriesAccompaniedByIterator = (SeriesAccompaniedByIterator)findAncestorWithClass(this, SeriesAccompaniedByIterator.class);
			pageContext.getOut().print(theSeriesAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

