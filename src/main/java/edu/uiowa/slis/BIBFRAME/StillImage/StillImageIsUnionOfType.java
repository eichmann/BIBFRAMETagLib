package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageIsUnionOfIterator theStillImageIsUnionOfIterator = (StillImageIsUnionOfIterator)findAncestorWithClass(this, StillImageIsUnionOfIterator.class);
			pageContext.getOut().print(theStillImageIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

