package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasOriginalVersionIterator theMultipartMonographHasOriginalVersionIterator = (MultipartMonographHasOriginalVersionIterator)findAncestorWithClass(this, MultipartMonographHasOriginalVersionIterator.class);
			pageContext.getOut().print(theMultipartMonographHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

