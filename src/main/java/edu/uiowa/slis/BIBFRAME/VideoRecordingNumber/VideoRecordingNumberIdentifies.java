package edu.uiowa.slis.BIBFRAME.VideoRecordingNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoRecordingNumberIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static VideoRecordingNumberIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoRecordingNumberIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoRecordingNumberIdentifiesIterator theVideoRecordingNumberIdentifiesIterator = (VideoRecordingNumberIdentifiesIterator)findAncestorWithClass(this, VideoRecordingNumberIdentifiesIterator.class);
			pageContext.getOut().print(theVideoRecordingNumberIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing VideoRecordingNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing VideoRecordingNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

