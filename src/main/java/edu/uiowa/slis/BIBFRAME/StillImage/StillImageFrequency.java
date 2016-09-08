package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StillImageFrequencyIterator theStillImage = (StillImageFrequencyIterator)findAncestorWithClass(this, StillImageFrequencyIterator.class);
			pageContext.getOut().print(theStillImage.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for frequency tag ");
		}
		return SKIP_BODY;
	}
}

