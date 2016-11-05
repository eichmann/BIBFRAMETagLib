package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageRelationIterator theStillImageRelationIterator = (StillImageRelationIterator)findAncestorWithClass(this, StillImageRelationIterator.class);
			pageContext.getOut().print(theStillImageRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for relation tag ");
		}
		return SKIP_BODY;
	}
}

