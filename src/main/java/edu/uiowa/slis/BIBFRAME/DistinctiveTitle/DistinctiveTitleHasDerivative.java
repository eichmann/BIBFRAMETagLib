package edu.uiowa.slis.BIBFRAME.DistinctiveTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistinctiveTitleHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistinctiveTitleHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(DistinctiveTitleHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DistinctiveTitleHasDerivativeIterator theDistinctiveTitleHasDerivativeIterator = (DistinctiveTitleHasDerivativeIterator)findAncestorWithClass(this, DistinctiveTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theDistinctiveTitleHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing DistinctiveTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistinctiveTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

