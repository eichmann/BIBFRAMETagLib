package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographSplitIntoIterator theMultipartMonographSplitIntoIterator = (MultipartMonographSplitIntoIterator)findAncestorWithClass(this, MultipartMonographSplitIntoIterator.class);
			pageContext.getOut().print(theMultipartMonographSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

