package edu.uiowa.slis.BIBFRAME.AbbreviatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbbreviatedTitleDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AbbreviatedTitleDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(AbbreviatedTitleDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbbreviatedTitleDerivedFromIterator theAbbreviatedTitleDerivedFromIterator = (AbbreviatedTitleDerivedFromIterator)findAncestorWithClass(this, AbbreviatedTitleDerivedFromIterator.class);
			pageContext.getOut().print(theAbbreviatedTitleDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

