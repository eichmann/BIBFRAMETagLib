package edu.uiowa.slis.BIBFRAME.KeyTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeyTitleDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static KeyTitleDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(KeyTitleDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KeyTitleDerivedFromIterator theKeyTitleDerivedFromIterator = (KeyTitleDerivedFromIterator)findAncestorWithClass(this, KeyTitleDerivedFromIterator.class);
			pageContext.getOut().print(theKeyTitleDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing KeyTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

