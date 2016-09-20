package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographPerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographPerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographPerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographPerformedAtIterator theMultipartMonographPerformedAtIterator = (MultipartMonographPerformedAtIterator)findAncestorWithClass(this, MultipartMonographPerformedAtIterator.class);
			pageContext.getOut().print(theMultipartMonographPerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

