package edu.uiowa.slis.BIBFRAME.KeyTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeyTitleHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static KeyTitleHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(KeyTitleHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KeyTitleHasPartIterator theKeyTitleHasPartIterator = (KeyTitleHasPartIterator)findAncestorWithClass(this, KeyTitleHasPartIterator.class);
			pageContext.getOut().print(theKeyTitleHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing KeyTitle for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

