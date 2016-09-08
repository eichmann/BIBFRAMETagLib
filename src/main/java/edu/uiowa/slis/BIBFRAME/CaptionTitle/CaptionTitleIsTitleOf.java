package edu.uiowa.slis.BIBFRAME.CaptionTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaptionTitleIsTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CaptionTitleIsTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CaptionTitleIsTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaptionTitleIsTitleOfIterator theCaptionTitleIsTitleOfIterator = (CaptionTitleIsTitleOfIterator)findAncestorWithClass(this, CaptionTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theCaptionTitleIsTitleOfIterator.getIsTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing CaptionTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

