package edu.uiowa.slis.BIBFRAME.BinderTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BinderTitleHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BinderTitleHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(BinderTitleHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BinderTitleHasDerivativeIterator theBinderTitleHasDerivativeIterator = (BinderTitleHasDerivativeIterator)findAncestorWithClass(this, BinderTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theBinderTitleHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing BinderTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

