package edu.uiowa.slis.BIBFRAME.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleIsTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleIsTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleIsTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TitleIsTitleOfIterator theTitleIsTitleOfIterator = (TitleIsTitleOfIterator)findAncestorWithClass(this, TitleIsTitleOfIterator.class);
			pageContext.getOut().print(theTitleIsTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Title for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

