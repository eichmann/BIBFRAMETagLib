package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesSupplementsIterator theSeriesSupplementsIterator = (SeriesSupplementsIterator)findAncestorWithClass(this, SeriesSupplementsIterator.class);
			pageContext.getOut().print(theSeriesSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for supplements tag ");
		}
		return SKIP_BODY;
	}
}

