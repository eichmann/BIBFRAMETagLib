package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographContinuesUnderNewTitleIterator theMultipartMonographContinuesUnderNewTitleIterator = (MultipartMonographContinuesUnderNewTitleIterator)findAncestorWithClass(this, MultipartMonographContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theMultipartMonographContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}
