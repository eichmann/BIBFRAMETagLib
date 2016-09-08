package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographIsLastOfIterator theMultipartMonographIsLastOfIterator = (MultipartMonographIsLastOfIterator)findAncestorWithClass(this, MultipartMonographIsLastOfIterator.class);
			pageContext.getOut().print(theMultipartMonographIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

