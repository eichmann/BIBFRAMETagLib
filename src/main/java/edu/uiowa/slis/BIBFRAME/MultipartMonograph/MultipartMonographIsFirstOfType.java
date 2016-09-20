package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographIsFirstOfIterator theMultipartMonographIsFirstOfIterator = (MultipartMonographIsFirstOfIterator)findAncestorWithClass(this, MultipartMonographIsFirstOfIterator.class);
			pageContext.getOut().print(theMultipartMonographIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

