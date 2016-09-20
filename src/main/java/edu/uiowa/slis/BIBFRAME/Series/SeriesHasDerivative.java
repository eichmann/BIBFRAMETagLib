package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasDerivativeIterator theSeriesHasDerivativeIterator = (SeriesHasDerivativeIterator)findAncestorWithClass(this, SeriesHasDerivativeIterator.class);
			pageContext.getOut().print(theSeriesHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

