package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasExpressionIterator theMultipartMonographHasExpressionIterator = (MultipartMonographHasExpressionIterator)findAncestorWithClass(this, MultipartMonographHasExpressionIterator.class);
			pageContext.getOut().print(theMultipartMonographHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

