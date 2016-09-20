package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasDerivativeIterator theSeriesHasDerivativeIterator = (SeriesHasDerivativeIterator)findAncestorWithClass(this, SeriesHasDerivativeIterator.class);
			pageContext.getOut().print(theSeriesHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

