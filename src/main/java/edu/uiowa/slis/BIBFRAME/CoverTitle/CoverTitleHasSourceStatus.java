package edu.uiowa.slis.BIBFRAME.CoverTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoverTitleHasSourceStatus extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CoverTitleHasSourceStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(CoverTitleHasSourceStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoverTitleHasSourceStatusIterator theCoverTitleHasSourceStatusIterator = (CoverTitleHasSourceStatusIterator)findAncestorWithClass(this, CoverTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theCoverTitleHasSourceStatusIterator.getHasSourceStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

