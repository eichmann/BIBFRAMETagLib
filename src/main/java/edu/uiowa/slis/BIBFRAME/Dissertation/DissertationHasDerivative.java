package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasDerivativeIterator theDissertationHasDerivativeIterator = (DissertationHasDerivativeIterator)findAncestorWithClass(this, DissertationHasDerivativeIterator.class);
			pageContext.getOut().print(theDissertationHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

