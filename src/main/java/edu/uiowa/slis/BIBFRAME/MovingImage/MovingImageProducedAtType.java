package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageProducedAtIterator theMovingImageProducedAtIterator = (MovingImageProducedAtIterator)findAncestorWithClass(this, MovingImageProducedAtIterator.class);
			pageContext.getOut().print(theMovingImageProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

