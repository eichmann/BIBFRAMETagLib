package edu.uiowa.slis.BIBFRAME.ConciseTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConciseTitleHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConciseTitleHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(ConciseTitleHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConciseTitleHasPartIterator theConciseTitleHasPartIterator = (ConciseTitleHasPartIterator)findAncestorWithClass(this, ConciseTitleHasPartIterator.class);
			pageContext.getOut().print(theConciseTitleHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing ConciseTitle for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConciseTitle for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

