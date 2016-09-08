package edu.uiowa.slis.BIBFRAME.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleHasSourceStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleHasSourceStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleHasSourceStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TitleHasSourceStatusIterator theTitleHasSourceStatusIterator = (TitleHasSourceStatusIterator)findAncestorWithClass(this, TitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theTitleHasSourceStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Title for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

