package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographFrequencyIterator theMultipartMonograph = (MultipartMonographFrequencyIterator)findAncestorWithClass(this, MultipartMonographFrequencyIterator.class);
			pageContext.getOut().print(theMultipartMonograph.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for frequency tag ");
		}
		return SKIP_BODY;
	}
}

