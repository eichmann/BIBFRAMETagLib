package edu.uiowa.slis.BIBFRAME.CoverTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoverTitleHasSourceStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CoverTitleHasSourceStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoverTitleHasSourceStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoverTitleHasSourceStatusIterator theCoverTitleHasSourceStatusIterator = (CoverTitleHasSourceStatusIterator)findAncestorWithClass(this, CoverTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theCoverTitleHasSourceStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

