package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographTranslatesIterator theMultipartMonographTranslatesIterator = (MultipartMonographTranslatesIterator)findAncestorWithClass(this, MultipartMonographTranslatesIterator.class);
			pageContext.getOut().print(theMultipartMonographTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for translates tag ");
		}
		return SKIP_BODY;
	}
}

