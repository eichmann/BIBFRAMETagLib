package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasDerivativeIterator theIntegratingResourceHasDerivativeIterator = (IntegratingResourceHasDerivativeIterator)findAncestorWithClass(this, IntegratingResourceHasDerivativeIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

