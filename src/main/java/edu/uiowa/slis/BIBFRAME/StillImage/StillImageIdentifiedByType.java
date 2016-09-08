package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageIdentifiedByIterator theStillImageIdentifiedByIterator = (StillImageIdentifiedByIterator)findAncestorWithClass(this, StillImageIdentifiedByIterator.class);
			pageContext.getOut().print(theStillImageIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

