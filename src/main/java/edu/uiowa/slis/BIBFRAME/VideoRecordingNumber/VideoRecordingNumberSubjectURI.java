package edu.uiowa.slis.BIBFRAME.VideoRecordingNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoRecordingNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static VideoRecordingNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoRecordingNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			VideoRecordingNumber theVideoRecordingNumber = (VideoRecordingNumber)findAncestorWithClass(this, VideoRecordingNumber.class);
			if (!theVideoRecordingNumber.commitNeeded) {
				pageContext.getOut().print(theVideoRecordingNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing VideoRecordingNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing VideoRecordingNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			VideoRecordingNumber theVideoRecordingNumber = (VideoRecordingNumber)findAncestorWithClass(this, VideoRecordingNumber.class);
			return theVideoRecordingNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing VideoRecordingNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing VideoRecordingNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			VideoRecordingNumber theVideoRecordingNumber = (VideoRecordingNumber)findAncestorWithClass(this, VideoRecordingNumber.class);
			theVideoRecordingNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing VideoRecordingNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing VideoRecordingNumber for subjectURI tag ");
		}
	}
}

