package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasOriginalVersionInverseIterator theMultipartMonographHasOriginalVersionInverseIterator = (MultipartMonographHasOriginalVersionInverseIterator)findAncestorWithClass(this, MultipartMonographHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theMultipartMonographHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

