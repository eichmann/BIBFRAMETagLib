package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesAbsorbedByIterator theSeriesAbsorbedByIterator = (SeriesAbsorbedByIterator)findAncestorWithClass(this, SeriesAbsorbedByIterator.class);
			pageContext.getOut().print(theSeriesAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

