package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageSupplementsIterator theStillImageSupplementsIterator = (StillImageSupplementsIterator)findAncestorWithClass(this, StillImageSupplementsIterator.class);
			pageContext.getOut().print(theStillImageSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for supplements tag ");
		}
		return SKIP_BODY;
	}
}

