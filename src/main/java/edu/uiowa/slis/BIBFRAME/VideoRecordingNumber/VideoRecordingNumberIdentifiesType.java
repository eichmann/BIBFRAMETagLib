package edu.uiowa.slis.BIBFRAME.VideoRecordingNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoRecordingNumberIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static VideoRecordingNumberIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoRecordingNumberIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoRecordingNumberIdentifiesIterator theVideoRecordingNumberIdentifiesIterator = (VideoRecordingNumberIdentifiesIterator)findAncestorWithClass(this, VideoRecordingNumberIdentifiesIterator.class);
			pageContext.getOut().print(theVideoRecordingNumberIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing VideoRecordingNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing VideoRecordingNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

