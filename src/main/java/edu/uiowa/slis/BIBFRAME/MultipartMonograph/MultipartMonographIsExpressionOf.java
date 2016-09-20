package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographIsExpressionOfIterator theMultipartMonographIsExpressionOfIterator = (MultipartMonographIsExpressionOfIterator)findAncestorWithClass(this, MultipartMonographIsExpressionOfIterator.class);
			pageContext.getOut().print(theMultipartMonographIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

