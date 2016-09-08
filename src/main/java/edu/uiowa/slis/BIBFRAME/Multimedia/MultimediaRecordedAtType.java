package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaRecordedAtIterator theMultimediaRecordedAtIterator = (MultimediaRecordedAtIterator)findAncestorWithClass(this, MultimediaRecordedAtIterator.class);
			pageContext.getOut().print(theMultimediaRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

