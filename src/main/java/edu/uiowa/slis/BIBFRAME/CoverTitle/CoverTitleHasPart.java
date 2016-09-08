package edu.uiowa.slis.BIBFRAME.CoverTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoverTitleHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CoverTitleHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(CoverTitleHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoverTitleHasPartIterator theCoverTitleHasPartIterator = (CoverTitleHasPartIterator)findAncestorWithClass(this, CoverTitleHasPartIterator.class);
			pageContext.getOut().print(theCoverTitleHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

