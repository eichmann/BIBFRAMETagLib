package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImagePerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImagePerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImagePerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImagePerformedAtIterator theStillImagePerformedAtIterator = (StillImagePerformedAtIterator)findAncestorWithClass(this, StillImagePerformedAtIterator.class);
			pageContext.getOut().print(theStillImagePerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

