package edu.uiowa.slis.BIBFRAME.KeyTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeyTitleHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static KeyTitleHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(KeyTitleHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KeyTitleHasDerivativeIterator theKeyTitleHasDerivativeIterator = (KeyTitleHasDerivativeIterator)findAncestorWithClass(this, KeyTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theKeyTitleHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing KeyTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

