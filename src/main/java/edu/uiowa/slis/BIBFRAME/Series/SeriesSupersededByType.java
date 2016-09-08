package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesSupersededByIterator theSeriesSupersededByIterator = (SeriesSupersededByIterator)findAncestorWithClass(this, SeriesSupersededByIterator.class);
			pageContext.getOut().print(theSeriesSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

