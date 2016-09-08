package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographIsUnionOfIterator theMultipartMonographIsUnionOfIterator = (MultipartMonographIsUnionOfIterator)findAncestorWithClass(this, MultipartMonographIsUnionOfIterator.class);
			pageContext.getOut().print(theMultipartMonographIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

