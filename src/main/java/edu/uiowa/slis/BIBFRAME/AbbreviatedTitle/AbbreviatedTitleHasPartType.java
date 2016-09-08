package edu.uiowa.slis.BIBFRAME.AbbreviatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbbreviatedTitleHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AbbreviatedTitleHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbbreviatedTitleHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbbreviatedTitleHasPartIterator theAbbreviatedTitleHasPartIterator = (AbbreviatedTitleHasPartIterator)findAncestorWithClass(this, AbbreviatedTitleHasPartIterator.class);
			pageContext.getOut().print(theAbbreviatedTitleHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

