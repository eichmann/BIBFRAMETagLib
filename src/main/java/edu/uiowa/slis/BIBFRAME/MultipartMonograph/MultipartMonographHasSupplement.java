package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasSupplementIterator theMultipartMonographHasSupplementIterator = (MultipartMonographHasSupplementIterator)findAncestorWithClass(this, MultipartMonographHasSupplementIterator.class);
			pageContext.getOut().print(theMultipartMonographHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

