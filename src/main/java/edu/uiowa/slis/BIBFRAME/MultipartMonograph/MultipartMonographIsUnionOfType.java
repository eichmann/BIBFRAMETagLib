package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographIsUnionOfIterator theMultipartMonographIsUnionOfIterator = (MultipartMonographIsUnionOfIterator)findAncestorWithClass(this, MultipartMonographIsUnionOfIterator.class);
			pageContext.getOut().print(theMultipartMonographIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

