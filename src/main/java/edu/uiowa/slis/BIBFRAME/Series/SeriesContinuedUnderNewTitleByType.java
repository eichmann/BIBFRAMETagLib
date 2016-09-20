package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesContinuedUnderNewTitleByIterator theSeriesContinuedUnderNewTitleByIterator = (SeriesContinuedUnderNewTitleByIterator)findAncestorWithClass(this, SeriesContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theSeriesContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

