package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesPerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesPerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesPerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesPerformedAtIterator theSeriesPerformedAtIterator = (SeriesPerformedAtIterator)findAncestorWithClass(this, SeriesPerformedAtIterator.class);
			pageContext.getOut().print(theSeriesPerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for performedAt tag ");
		}
		return SKIP_BODY;
	}
}
