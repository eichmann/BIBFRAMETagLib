package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageSupersededByIterator theStillImageSupersededByIterator = (StillImageSupersededByIterator)findAncestorWithClass(this, StillImageSupersededByIterator.class);
			pageContext.getOut().print(theStillImageSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

