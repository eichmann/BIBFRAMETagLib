package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographIsPartOfIterator theMultipartMonographIsPartOfIterator = (MultipartMonographIsPartOfIterator)findAncestorWithClass(this, MultipartMonographIsPartOfIterator.class);
			pageContext.getOut().print(theMultipartMonographIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

