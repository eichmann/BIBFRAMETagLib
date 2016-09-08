package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIsFindingAidForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesIsFindingAidForType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIsFindingAidForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesIsFindingAidForIterator theSeriesIsFindingAidForIterator = (SeriesIsFindingAidForIterator)findAncestorWithClass(this, SeriesIsFindingAidForIterator.class);
			pageContext.getOut().print(theSeriesIsFindingAidForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

