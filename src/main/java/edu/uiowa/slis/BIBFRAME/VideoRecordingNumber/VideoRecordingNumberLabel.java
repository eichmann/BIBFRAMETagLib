package edu.uiowa.slis.BIBFRAME.VideoRecordingNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoRecordingNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static VideoRecordingNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoRecordingNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			VideoRecordingNumber theVideoRecordingNumber = (VideoRecordingNumber)findAncestorWithClass(this, VideoRecordingNumber.class);
			if (!theVideoRecordingNumber.commitNeeded) {
				pageContext.getOut().print(theVideoRecordingNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing VideoRecordingNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing VideoRecordingNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			VideoRecordingNumber theVideoRecordingNumber = (VideoRecordingNumber)findAncestorWithClass(this, VideoRecordingNumber.class);
			return theVideoRecordingNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing VideoRecordingNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing VideoRecordingNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			VideoRecordingNumber theVideoRecordingNumber = (VideoRecordingNumber)findAncestorWithClass(this, VideoRecordingNumber.class);
			theVideoRecordingNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing VideoRecordingNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing VideoRecordingNumber for label tag ");
		}
	}
}

