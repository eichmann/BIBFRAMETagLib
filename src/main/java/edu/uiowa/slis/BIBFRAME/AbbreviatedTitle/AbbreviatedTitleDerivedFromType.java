package edu.uiowa.slis.BIBFRAME.AbbreviatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbbreviatedTitleDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AbbreviatedTitleDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbbreviatedTitleDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbbreviatedTitleDerivedFromIterator theAbbreviatedTitleDerivedFromIterator = (AbbreviatedTitleDerivedFromIterator)findAncestorWithClass(this, AbbreviatedTitleDerivedFromIterator.class);
			pageContext.getOut().print(theAbbreviatedTitleDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

