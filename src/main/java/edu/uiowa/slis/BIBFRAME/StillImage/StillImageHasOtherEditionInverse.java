package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasOtherEditionInverseIterator theStillImageHasOtherEditionInverseIterator = (StillImageHasOtherEditionInverseIterator)findAncestorWithClass(this, StillImageHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theStillImageHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

