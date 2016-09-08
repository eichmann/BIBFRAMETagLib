package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographSupplementsIterator theMultipartMonographSupplementsIterator = (MultipartMonographSupplementsIterator)findAncestorWithClass(this, MultipartMonographSupplementsIterator.class);
			pageContext.getOut().print(theMultipartMonographSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for supplements tag ");
		}
		return SKIP_BODY;
	}
}

