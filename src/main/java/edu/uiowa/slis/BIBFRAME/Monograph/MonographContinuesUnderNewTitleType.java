package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographContinuesUnderNewTitleIterator theMonographContinuesUnderNewTitleIterator = (MonographContinuesUnderNewTitleIterator)findAncestorWithClass(this, MonographContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theMonographContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

