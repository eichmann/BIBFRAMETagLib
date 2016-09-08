package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographSupplementsIterator theMultipartMonographSupplementsIterator = (MultipartMonographSupplementsIterator)findAncestorWithClass(this, MultipartMonographSupplementsIterator.class);
			pageContext.getOut().print(theMultipartMonographSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for supplements tag ");
		}
		return SKIP_BODY;
	}
}

