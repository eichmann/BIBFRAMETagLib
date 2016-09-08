package edu.uiowa.slis.BIBFRAME.KeyTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeyTitleIsPreferredTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static KeyTitleIsPreferredTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(KeyTitleIsPreferredTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KeyTitleIsPreferredTitleOfIterator theKeyTitleIsPreferredTitleOfIterator = (KeyTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, KeyTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theKeyTitleIsPreferredTitleOfIterator.getIsPreferredTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing KeyTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

