package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographIdentifiedByIterator theMultipartMonographIdentifiedByIterator = (MultipartMonographIdentifiedByIterator)findAncestorWithClass(this, MultipartMonographIdentifiedByIterator.class);
			pageContext.getOut().print(theMultipartMonographIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

