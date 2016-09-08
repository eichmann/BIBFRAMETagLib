package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographContinuedUnderNewTitleByIterator theMultipartMonographContinuedUnderNewTitleByIterator = (MultipartMonographContinuedUnderNewTitleByIterator)findAncestorWithClass(this, MultipartMonographContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theMultipartMonographContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

