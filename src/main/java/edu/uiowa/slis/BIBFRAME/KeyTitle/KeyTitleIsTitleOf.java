package edu.uiowa.slis.BIBFRAME.KeyTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeyTitleIsTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static KeyTitleIsTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(KeyTitleIsTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KeyTitleIsTitleOfIterator theKeyTitleIsTitleOfIterator = (KeyTitleIsTitleOfIterator)findAncestorWithClass(this, KeyTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theKeyTitleIsTitleOfIterator.getIsTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing KeyTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

