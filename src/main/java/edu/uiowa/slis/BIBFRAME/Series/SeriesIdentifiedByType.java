package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesIdentifiedByIterator theSeriesIdentifiedByIterator = (SeriesIdentifiedByIterator)findAncestorWithClass(this, SeriesIdentifiedByIterator.class);
			pageContext.getOut().print(theSeriesIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

