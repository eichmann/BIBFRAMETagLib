package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographContinuedUnderNewTitleByIterator theMonographContinuedUnderNewTitleByIterator = (MonographContinuedUnderNewTitleByIterator)findAncestorWithClass(this, MonographContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theMonographContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

