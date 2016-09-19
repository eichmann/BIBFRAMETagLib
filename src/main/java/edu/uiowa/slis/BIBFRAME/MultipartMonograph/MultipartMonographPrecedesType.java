package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographPrecedesIterator theMultipartMonographPrecedesIterator = (MultipartMonographPrecedesIterator)findAncestorWithClass(this, MultipartMonographPrecedesIterator.class);
			pageContext.getOut().print(theMultipartMonographPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for precedes tag ");
		}
		return SKIP_BODY;
	}
}

