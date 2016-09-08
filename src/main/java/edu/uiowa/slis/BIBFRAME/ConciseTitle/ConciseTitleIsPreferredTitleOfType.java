package edu.uiowa.slis.BIBFRAME.ConciseTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConciseTitleIsPreferredTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConciseTitleIsPreferredTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConciseTitleIsPreferredTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConciseTitleIsPreferredTitleOfIterator theConciseTitleIsPreferredTitleOfIterator = (ConciseTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, ConciseTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theConciseTitleIsPreferredTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConciseTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConciseTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

