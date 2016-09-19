package edu.uiowa.slis.BIBFRAME.CaptionTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaptionTitleDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CaptionTitleDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(CaptionTitleDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaptionTitleDerivedFromIterator theCaptionTitleDerivedFromIterator = (CaptionTitleDerivedFromIterator)findAncestorWithClass(this, CaptionTitleDerivedFromIterator.class);
			pageContext.getOut().print(theCaptionTitleDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing CaptionTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

