package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageAbsorbedByIterator theStillImageAbsorbedByIterator = (StillImageAbsorbedByIterator)findAncestorWithClass(this, StillImageAbsorbedByIterator.class);
			pageContext.getOut().print(theStillImageAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

