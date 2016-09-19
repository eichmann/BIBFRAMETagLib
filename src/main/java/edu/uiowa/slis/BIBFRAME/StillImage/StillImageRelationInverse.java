package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageRelationInverseIterator theStillImageRelationInverseIterator = (StillImageRelationInverseIterator)findAncestorWithClass(this, StillImageRelationInverseIterator.class);
			pageContext.getOut().print(theStillImageRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for relation tag ");
		}
		return SKIP_BODY;
	}
}

