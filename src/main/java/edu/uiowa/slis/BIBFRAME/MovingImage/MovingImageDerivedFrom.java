package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageDerivedFromIterator theMovingImageDerivedFromIterator = (MovingImageDerivedFromIterator)findAncestorWithClass(this, MovingImageDerivedFromIterator.class);
			pageContext.getOut().print(theMovingImageDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

