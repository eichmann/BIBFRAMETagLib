package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasDerivativeIterator theMultipartMonographHasDerivativeIterator = (MultipartMonographHasDerivativeIterator)findAncestorWithClass(this, MultipartMonographHasDerivativeIterator.class);
			pageContext.getOut().print(theMultipartMonographHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

