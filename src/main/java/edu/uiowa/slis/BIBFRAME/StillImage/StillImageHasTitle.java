package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasTitleIterator theStillImageHasTitleIterator = (StillImageHasTitleIterator)findAncestorWithClass(this, StillImageHasTitleIterator.class);
			pageContext.getOut().print(theStillImageHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

