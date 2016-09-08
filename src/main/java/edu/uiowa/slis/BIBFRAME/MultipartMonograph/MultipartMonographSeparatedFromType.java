package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographSeparatedFromIterator theMultipartMonographSeparatedFromIterator = (MultipartMonographSeparatedFromIterator)findAncestorWithClass(this, MultipartMonographSeparatedFromIterator.class);
			pageContext.getOut().print(theMultipartMonographSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

