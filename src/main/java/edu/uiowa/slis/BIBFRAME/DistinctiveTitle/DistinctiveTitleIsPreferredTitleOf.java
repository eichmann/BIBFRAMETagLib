package edu.uiowa.slis.BIBFRAME.DistinctiveTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistinctiveTitleIsPreferredTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistinctiveTitleIsPreferredTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DistinctiveTitleIsPreferredTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DistinctiveTitleIsPreferredTitleOfIterator theDistinctiveTitleIsPreferredTitleOfIterator = (DistinctiveTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, DistinctiveTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theDistinctiveTitleIsPreferredTitleOfIterator.getIsPreferredTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing DistinctiveTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistinctiveTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

