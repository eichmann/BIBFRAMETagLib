package edu.uiowa.slis.BIBFRAME.CaptionTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaptionTitleIsTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CaptionTitleIsTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaptionTitleIsTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaptionTitleIsTitleOfIterator theCaptionTitleIsTitleOfIterator = (CaptionTitleIsTitleOfIterator)findAncestorWithClass(this, CaptionTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theCaptionTitleIsTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaptionTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

