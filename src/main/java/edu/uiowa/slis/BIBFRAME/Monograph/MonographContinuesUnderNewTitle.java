package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographContinuesUnderNewTitleIterator theMonographContinuesUnderNewTitleIterator = (MonographContinuesUnderNewTitleIterator)findAncestorWithClass(this, MonographContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theMonographContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

