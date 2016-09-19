package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceFollowsInNarrativeInverseIterator theIntegratingResourceFollowsInNarrativeInverseIterator = (IntegratingResourceFollowsInNarrativeInverseIterator)findAncestorWithClass(this, IntegratingResourceFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theIntegratingResourceFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

