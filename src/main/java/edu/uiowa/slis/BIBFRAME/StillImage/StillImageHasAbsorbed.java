package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasAbsorbedIterator theStillImageHasAbsorbedIterator = (StillImageHasAbsorbedIterator)findAncestorWithClass(this, StillImageHasAbsorbedIterator.class);
			pageContext.getOut().print(theStillImageHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

