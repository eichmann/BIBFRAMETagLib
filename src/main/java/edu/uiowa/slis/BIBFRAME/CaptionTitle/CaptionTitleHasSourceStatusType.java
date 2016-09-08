package edu.uiowa.slis.BIBFRAME.CaptionTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaptionTitleHasSourceStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CaptionTitleHasSourceStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaptionTitleHasSourceStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaptionTitleHasSourceStatusIterator theCaptionTitleHasSourceStatusIterator = (CaptionTitleHasSourceStatusIterator)findAncestorWithClass(this, CaptionTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theCaptionTitleHasSourceStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaptionTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

