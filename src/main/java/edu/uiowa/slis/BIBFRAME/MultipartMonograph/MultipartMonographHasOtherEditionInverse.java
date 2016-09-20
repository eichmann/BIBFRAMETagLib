package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasOtherEditionInverseIterator theMultipartMonographHasOtherEditionInverseIterator = (MultipartMonographHasOtherEditionInverseIterator)findAncestorWithClass(this, MultipartMonographHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theMultipartMonographHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

