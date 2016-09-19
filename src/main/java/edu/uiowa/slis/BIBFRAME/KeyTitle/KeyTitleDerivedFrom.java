package edu.uiowa.slis.BIBFRAME.KeyTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeyTitleDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static KeyTitleDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(KeyTitleDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KeyTitleDerivedFromIterator theKeyTitleDerivedFromIterator = (KeyTitleDerivedFromIterator)findAncestorWithClass(this, KeyTitleDerivedFromIterator.class);
			pageContext.getOut().print(theKeyTitleDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing KeyTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

