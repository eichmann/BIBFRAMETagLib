package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StillImage theStillImage = (StillImage)findAncestorWithClass(this, StillImage.class);
			if (!theStillImage.commitNeeded) {
				pageContext.getOut().print(theStillImage.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			StillImage theStillImage = (StillImage)findAncestorWithClass(this, StillImage.class);
			return theStillImage.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing StillImage for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			StillImage theStillImage = (StillImage)findAncestorWithClass(this, StillImage.class);
			theStillImage.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for label tag ");
		}
	}
}

