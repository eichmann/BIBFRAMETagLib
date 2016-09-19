package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasOtherEditionInverseIterator theStillImageHasOtherEditionInverseIterator = (StillImageHasOtherEditionInverseIterator)findAncestorWithClass(this, StillImageHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theStillImageHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

