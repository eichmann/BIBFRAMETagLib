package edu.uiowa.slis.BIBFRAME.CoverTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoverTitleDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CoverTitleDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(CoverTitleDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoverTitleDerivedFromIterator theCoverTitleDerivedFromIterator = (CoverTitleDerivedFromIterator)findAncestorWithClass(this, CoverTitleDerivedFromIterator.class);
			pageContext.getOut().print(theCoverTitleDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

