package edu.uiowa.slis.BIBFRAME.AbbreviatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbbreviatedTitleHasSourceStatus extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AbbreviatedTitleHasSourceStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(AbbreviatedTitleHasSourceStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbbreviatedTitleHasSourceStatusIterator theAbbreviatedTitleHasSourceStatusIterator = (AbbreviatedTitleHasSourceStatusIterator)findAncestorWithClass(this, AbbreviatedTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theAbbreviatedTitleHasSourceStatusIterator.getHasSourceStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

