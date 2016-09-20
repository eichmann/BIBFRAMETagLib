package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographSeparatedIntoIterator theMultipartMonographSeparatedIntoIterator = (MultipartMonographSeparatedIntoIterator)findAncestorWithClass(this, MultipartMonographSeparatedIntoIterator.class);
			pageContext.getOut().print(theMultipartMonographSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

