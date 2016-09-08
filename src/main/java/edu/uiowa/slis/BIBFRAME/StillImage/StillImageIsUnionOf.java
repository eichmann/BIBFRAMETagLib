package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageIsUnionOfIterator theStillImageIsUnionOfIterator = (StillImageIsUnionOfIterator)findAncestorWithClass(this, StillImageIsUnionOfIterator.class);
			pageContext.getOut().print(theStillImageIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

