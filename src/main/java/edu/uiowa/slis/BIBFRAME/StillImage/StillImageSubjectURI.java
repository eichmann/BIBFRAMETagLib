package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StillImage theStillImage = (StillImage)findAncestorWithClass(this, StillImage.class);
			if (!theStillImage.commitNeeded) {
				pageContext.getOut().print(theStillImage.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			StillImage theStillImage = (StillImage)findAncestorWithClass(this, StillImage.class);
			return theStillImage.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing StillImage for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			StillImage theStillImage = (StillImage)findAncestorWithClass(this, StillImage.class);
			theStillImage.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for subjectURI tag ");
		}
	}
}

