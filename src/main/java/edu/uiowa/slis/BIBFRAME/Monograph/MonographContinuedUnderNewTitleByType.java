package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographContinuedUnderNewTitleByIterator theMonographContinuedUnderNewTitleByIterator = (MonographContinuedUnderNewTitleByIterator)findAncestorWithClass(this, MonographContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theMonographContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

