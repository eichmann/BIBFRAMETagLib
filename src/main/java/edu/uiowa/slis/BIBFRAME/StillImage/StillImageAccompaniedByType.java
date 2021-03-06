package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageAccompaniedByIterator theStillImageAccompaniedByIterator = (StillImageAccompaniedByIterator)findAncestorWithClass(this, StillImageAccompaniedByIterator.class);
			pageContext.getOut().print(theStillImageAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

