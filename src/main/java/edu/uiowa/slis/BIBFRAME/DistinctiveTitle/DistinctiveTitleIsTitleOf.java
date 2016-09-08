package edu.uiowa.slis.BIBFRAME.DistinctiveTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistinctiveTitleIsTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistinctiveTitleIsTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DistinctiveTitleIsTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DistinctiveTitleIsTitleOfIterator theDistinctiveTitleIsTitleOfIterator = (DistinctiveTitleIsTitleOfIterator)findAncestorWithClass(this, DistinctiveTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theDistinctiveTitleIsTitleOfIterator.getIsTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing DistinctiveTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistinctiveTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

