package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageRelationInverseIterator theStillImageRelationInverseIterator = (StillImageRelationInverseIterator)findAncestorWithClass(this, StillImageRelationInverseIterator.class);
			pageContext.getOut().print(theStillImageRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for relation tag ");
		}
		return SKIP_BODY;
	}
}

