package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TemporalEntityFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntityFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntityFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TemporalEntityFollowsIterator theTemporalEntityFollowsIterator = (TemporalEntityFollowsIterator)findAncestorWithClass(this, TemporalEntityFollowsIterator.class);
			pageContext.getOut().print(theTemporalEntityFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for follows tag ");
		}
		return SKIP_BODY;
	}
}

