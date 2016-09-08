package edu.uiowa.slis.BIBFRAME.AbbreviatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbbreviatedTitleIsPreferredTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AbbreviatedTitleIsPreferredTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbbreviatedTitleIsPreferredTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbbreviatedTitleIsPreferredTitleOfIterator theAbbreviatedTitleIsPreferredTitleOfIterator = (AbbreviatedTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, AbbreviatedTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theAbbreviatedTitleIsPreferredTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

