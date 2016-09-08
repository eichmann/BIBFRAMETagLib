package edu.uiowa.slis.BIBFRAME.AbbreviatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbbreviatedTitleIsPreferredTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AbbreviatedTitleIsPreferredTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AbbreviatedTitleIsPreferredTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbbreviatedTitleIsPreferredTitleOfIterator theAbbreviatedTitleIsPreferredTitleOfIterator = (AbbreviatedTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, AbbreviatedTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theAbbreviatedTitleIsPreferredTitleOfIterator.getIsPreferredTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

