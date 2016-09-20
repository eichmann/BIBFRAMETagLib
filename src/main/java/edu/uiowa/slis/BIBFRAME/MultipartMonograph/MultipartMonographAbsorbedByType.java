package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographAbsorbedByIterator theMultipartMonographAbsorbedByIterator = (MultipartMonographAbsorbedByIterator)findAncestorWithClass(this, MultipartMonographAbsorbedByIterator.class);
			pageContext.getOut().print(theMultipartMonographAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

