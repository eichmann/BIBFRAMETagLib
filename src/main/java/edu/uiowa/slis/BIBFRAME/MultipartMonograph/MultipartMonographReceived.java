package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographReceivedIterator theMultipartMonographReceivedIterator = (MultipartMonographReceivedIterator)findAncestorWithClass(this, MultipartMonographReceivedIterator.class);
			pageContext.getOut().print(theMultipartMonographReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for received tag ");
		}
		return SKIP_BODY;
	}
}

