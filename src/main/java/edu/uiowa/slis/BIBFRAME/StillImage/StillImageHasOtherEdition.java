package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasOtherEditionIterator theStillImageHasOtherEditionIterator = (StillImageHasOtherEditionIterator)findAncestorWithClass(this, StillImageHasOtherEditionIterator.class);
			pageContext.getOut().print(theStillImageHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

