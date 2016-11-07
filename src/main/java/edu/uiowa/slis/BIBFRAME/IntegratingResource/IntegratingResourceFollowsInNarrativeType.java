package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceFollowsInNarrativeIterator theIntegratingResourceFollowsInNarrativeIterator = (IntegratingResourceFollowsInNarrativeIterator)findAncestorWithClass(this, IntegratingResourceFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theIntegratingResourceFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}
