package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesContinuesUnderNewTitleIterator theSeriesContinuesUnderNewTitleIterator = (SeriesContinuesUnderNewTitleIterator)findAncestorWithClass(this, SeriesContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theSeriesContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

