package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasOtherEditionIterator theMultipartMonographHasOtherEditionIterator = (MultipartMonographHasOtherEditionIterator)findAncestorWithClass(this, MultipartMonographHasOtherEditionIterator.class);
			pageContext.getOut().print(theMultipartMonographHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

