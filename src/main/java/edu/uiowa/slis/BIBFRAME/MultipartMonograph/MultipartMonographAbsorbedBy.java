package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographAbsorbedByIterator theMultipartMonographAbsorbedByIterator = (MultipartMonographAbsorbedByIterator)findAncestorWithClass(this, MultipartMonographAbsorbedByIterator.class);
			pageContext.getOut().print(theMultipartMonographAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

