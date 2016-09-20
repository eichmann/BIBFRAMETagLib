package edu.uiowa.slis.BIBFRAME.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePerformanceOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConferencePerformanceOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePerformanceOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePerformanceOfIterator theConferencePerformanceOfIterator = (ConferencePerformanceOfIterator)findAncestorWithClass(this, ConferencePerformanceOfIterator.class);
			pageContext.getOut().print(theConferencePerformanceOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for performanceOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for performanceOf tag ");
		}
		return SKIP_BODY;
	}
}

