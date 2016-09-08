package edu.uiowa.slis.BIBFRAME.CaptionTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaptionTitleHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CaptionTitleHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaptionTitleHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaptionTitleHasPartIterator theCaptionTitleHasPartIterator = (CaptionTitleHasPartIterator)findAncestorWithClass(this, CaptionTitleHasPartIterator.class);
			pageContext.getOut().print(theCaptionTitleHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaptionTitle for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

