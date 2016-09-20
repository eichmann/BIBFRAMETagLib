package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographIsExpressionOfIterator theMultipartMonographIsExpressionOfIterator = (MultipartMonographIsExpressionOfIterator)findAncestorWithClass(this, MultipartMonographIsExpressionOfIterator.class);
			pageContext.getOut().print(theMultipartMonographIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

