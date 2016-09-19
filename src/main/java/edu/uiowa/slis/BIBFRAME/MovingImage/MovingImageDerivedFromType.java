package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageDerivedFromIterator theMovingImageDerivedFromIterator = (MovingImageDerivedFromIterator)findAncestorWithClass(this, MovingImageDerivedFromIterator.class);
			pageContext.getOut().print(theMovingImageDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

