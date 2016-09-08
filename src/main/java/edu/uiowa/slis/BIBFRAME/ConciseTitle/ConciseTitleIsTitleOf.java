package edu.uiowa.slis.BIBFRAME.ConciseTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConciseTitleIsTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConciseTitleIsTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ConciseTitleIsTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConciseTitleIsTitleOfIterator theConciseTitleIsTitleOfIterator = (ConciseTitleIsTitleOfIterator)findAncestorWithClass(this, ConciseTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theConciseTitleIsTitleOfIterator.getIsTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ConciseTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConciseTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

