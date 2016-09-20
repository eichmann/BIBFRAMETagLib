package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographReceivedIterator theMultipartMonographReceivedIterator = (MultipartMonographReceivedIterator)findAncestorWithClass(this, MultipartMonographReceivedIterator.class);
			pageContext.getOut().print(theMultipartMonographReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for received tag ");
		}
		return SKIP_BODY;
	}
}

