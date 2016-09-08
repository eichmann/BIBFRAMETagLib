package edu.uiowa.slis.BIBFRAME.AbbreviatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbbreviatedTitleIsTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AbbreviatedTitleIsTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AbbreviatedTitleIsTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbbreviatedTitleIsTitleOfIterator theAbbreviatedTitleIsTitleOfIterator = (AbbreviatedTitleIsTitleOfIterator)findAncestorWithClass(this, AbbreviatedTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theAbbreviatedTitleIsTitleOfIterator.getIsTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

