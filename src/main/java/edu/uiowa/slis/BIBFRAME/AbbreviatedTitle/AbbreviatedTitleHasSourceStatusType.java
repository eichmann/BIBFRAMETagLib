package edu.uiowa.slis.BIBFRAME.AbbreviatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbbreviatedTitleHasSourceStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AbbreviatedTitleHasSourceStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbbreviatedTitleHasSourceStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbbreviatedTitleHasSourceStatusIterator theAbbreviatedTitleHasSourceStatusIterator = (AbbreviatedTitleHasSourceStatusIterator)findAncestorWithClass(this, AbbreviatedTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theAbbreviatedTitleHasSourceStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

