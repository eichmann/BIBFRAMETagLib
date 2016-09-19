package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasDerivativeIterator theIndexHasDerivativeIterator = (IndexHasDerivativeIterator)findAncestorWithClass(this, IndexHasDerivativeIterator.class);
			pageContext.getOut().print(theIndexHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

