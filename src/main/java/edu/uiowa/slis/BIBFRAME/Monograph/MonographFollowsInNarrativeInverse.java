package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographFollowsInNarrativeInverseIterator theMonographFollowsInNarrativeInverseIterator = (MonographFollowsInNarrativeInverseIterator)findAncestorWithClass(this, MonographFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMonographFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

