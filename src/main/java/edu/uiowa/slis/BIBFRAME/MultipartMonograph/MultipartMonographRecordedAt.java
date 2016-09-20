package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographRecordedAtIterator theMultipartMonographRecordedAtIterator = (MultipartMonographRecordedAtIterator)findAncestorWithClass(this, MultipartMonographRecordedAtIterator.class);
			pageContext.getOut().print(theMultipartMonographRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

