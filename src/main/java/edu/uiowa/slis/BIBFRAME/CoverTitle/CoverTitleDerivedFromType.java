package edu.uiowa.slis.BIBFRAME.CoverTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoverTitleDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CoverTitleDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoverTitleDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoverTitleDerivedFromIterator theCoverTitleDerivedFromIterator = (CoverTitleDerivedFromIterator)findAncestorWithClass(this, CoverTitleDerivedFromIterator.class);
			pageContext.getOut().print(theCoverTitleDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

