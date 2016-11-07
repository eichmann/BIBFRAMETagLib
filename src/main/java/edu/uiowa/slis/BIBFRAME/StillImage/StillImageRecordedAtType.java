package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageRecordedAtIterator theStillImageRecordedAtIterator = (StillImageRecordedAtIterator)findAncestorWithClass(this, StillImageRecordedAtIterator.class);
			pageContext.getOut().print(theStillImageRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}
