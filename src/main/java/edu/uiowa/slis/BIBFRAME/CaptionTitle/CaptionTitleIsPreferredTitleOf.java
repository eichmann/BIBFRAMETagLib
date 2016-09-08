package edu.uiowa.slis.BIBFRAME.CaptionTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaptionTitleIsPreferredTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CaptionTitleIsPreferredTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CaptionTitleIsPreferredTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaptionTitleIsPreferredTitleOfIterator theCaptionTitleIsPreferredTitleOfIterator = (CaptionTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, CaptionTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theCaptionTitleIsPreferredTitleOfIterator.getIsPreferredTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing CaptionTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

