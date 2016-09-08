package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MovingImage theMovingImage = (MovingImage)findAncestorWithClass(this, MovingImage.class);
			if (!theMovingImage.commitNeeded) {
				pageContext.getOut().print(theMovingImage.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			MovingImage theMovingImage = (MovingImage)findAncestorWithClass(this, MovingImage.class);
			return theMovingImage.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing MovingImage for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			MovingImage theMovingImage = (MovingImage)findAncestorWithClass(this, MovingImage.class);
			theMovingImage.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for label tag ");
		}
	}
}

