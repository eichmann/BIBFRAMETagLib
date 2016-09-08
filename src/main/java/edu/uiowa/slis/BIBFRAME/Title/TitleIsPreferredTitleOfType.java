package edu.uiowa.slis.BIBFRAME.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleIsPreferredTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleIsPreferredTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleIsPreferredTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TitleIsPreferredTitleOfIterator theTitleIsPreferredTitleOfIterator = (TitleIsPreferredTitleOfIterator)findAncestorWithClass(this, TitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theTitleIsPreferredTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Title for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

