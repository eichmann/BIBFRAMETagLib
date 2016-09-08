package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasContributionIterator theAudioHasContributionIterator = (AudioHasContributionIterator)findAncestorWithClass(this, AudioHasContributionIterator.class);
			pageContext.getOut().print(theAudioHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

