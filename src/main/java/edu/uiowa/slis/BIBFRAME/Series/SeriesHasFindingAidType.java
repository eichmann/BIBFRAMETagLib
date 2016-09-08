package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasFindingAidType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasFindingAidType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasFindingAidType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasFindingAidIterator theSeriesHasFindingAidIterator = (SeriesHasFindingAidIterator)findAncestorWithClass(this, SeriesHasFindingAidIterator.class);
			pageContext.getOut().print(theSeriesHasFindingAidIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

