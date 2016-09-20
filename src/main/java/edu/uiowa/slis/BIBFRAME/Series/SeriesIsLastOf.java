package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIsLastOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesIsLastOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIsLastOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesIsLastOfIterator theSeriesIsLastOfIterator = (SeriesIsLastOfIterator)findAncestorWithClass(this, SeriesIsLastOfIterator.class);
			pageContext.getOut().print(theSeriesIsLastOfIterator.getIsLastOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

