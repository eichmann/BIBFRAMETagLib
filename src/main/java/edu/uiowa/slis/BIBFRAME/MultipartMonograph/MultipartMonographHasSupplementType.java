package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasSupplementIterator theMultipartMonographHasSupplementIterator = (MultipartMonographHasSupplementIterator)findAncestorWithClass(this, MultipartMonographHasSupplementIterator.class);
			pageContext.getOut().print(theMultipartMonographHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

