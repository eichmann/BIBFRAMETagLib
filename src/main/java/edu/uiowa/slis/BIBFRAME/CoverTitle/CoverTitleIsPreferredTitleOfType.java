package edu.uiowa.slis.BIBFRAME.CoverTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoverTitleIsPreferredTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CoverTitleIsPreferredTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoverTitleIsPreferredTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoverTitleIsPreferredTitleOfIterator theCoverTitleIsPreferredTitleOfIterator = (CoverTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, CoverTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theCoverTitleIsPreferredTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

