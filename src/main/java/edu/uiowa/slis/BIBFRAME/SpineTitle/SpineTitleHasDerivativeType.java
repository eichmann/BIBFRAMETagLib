package edu.uiowa.slis.BIBFRAME.SpineTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpineTitleHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SpineTitleHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpineTitleHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpineTitleHasDerivativeIterator theSpineTitleHasDerivativeIterator = (SpineTitleHasDerivativeIterator)findAncestorWithClass(this, SpineTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theSpineTitleHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SpineTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

