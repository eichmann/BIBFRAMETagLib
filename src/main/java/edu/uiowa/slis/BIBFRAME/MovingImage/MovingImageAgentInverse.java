package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageAgentInverseIterator theMovingImageAgentInverseIterator = (MovingImageAgentInverseIterator)findAncestorWithClass(this, MovingImageAgentInverseIterator.class);
			pageContext.getOut().print(theMovingImageAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for agent tag ");
		}
		return SKIP_BODY;
	}
}

