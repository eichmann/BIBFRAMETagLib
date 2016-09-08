package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasContributionIterator theNotatedMusicHasContributionIterator = (NotatedMusicHasContributionIterator)findAncestorWithClass(this, NotatedMusicHasContributionIterator.class);
			pageContext.getOut().print(theNotatedMusicHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

