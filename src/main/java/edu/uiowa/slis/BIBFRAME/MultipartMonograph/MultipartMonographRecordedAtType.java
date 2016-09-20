package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographRecordedAtIterator theMultipartMonographRecordedAtIterator = (MultipartMonographRecordedAtIterator)findAncestorWithClass(this, MultipartMonographRecordedAtIterator.class);
			pageContext.getOut().print(theMultipartMonographRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

