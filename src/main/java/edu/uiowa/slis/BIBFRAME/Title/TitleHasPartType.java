package edu.uiowa.slis.BIBFRAME.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TitleHasPartIterator theTitleHasPartIterator = (TitleHasPartIterator)findAncestorWithClass(this, TitleHasPartIterator.class);
			pageContext.getOut().print(theTitleHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Title for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

