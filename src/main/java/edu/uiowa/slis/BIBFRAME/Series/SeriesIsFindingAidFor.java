package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesIsFindingAidForIterator theSeriesIsFindingAidForIterator = (SeriesIsFindingAidForIterator)findAncestorWithClass(this, SeriesIsFindingAidForIterator.class);
			pageContext.getOut().print(theSeriesIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

