package edu.uiowa.slis.BIBFRAME.CoverTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoverTitleIsTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CoverTitleIsTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CoverTitleIsTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoverTitleIsTitleOfIterator theCoverTitleIsTitleOfIterator = (CoverTitleIsTitleOfIterator)findAncestorWithClass(this, CoverTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theCoverTitleIsTitleOfIterator.getIsTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

