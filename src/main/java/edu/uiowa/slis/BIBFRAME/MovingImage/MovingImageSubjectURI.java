package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MovingImage theMovingImage = (MovingImage)findAncestorWithClass(this, MovingImage.class);
			if (!theMovingImage.commitNeeded) {
				pageContext.getOut().print(theMovingImage.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			MovingImage theMovingImage = (MovingImage)findAncestorWithClass(this, MovingImage.class);
			return theMovingImage.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing MovingImage for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			MovingImage theMovingImage = (MovingImage)findAncestorWithClass(this, MovingImage.class);
			theMovingImage.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for subjectURI tag ");
		}
	}
}

