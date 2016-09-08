package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourcePrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourcePrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourcePrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourcePrecedesInNarrativeIterator theContinuingResourcePrecedesInNarrativeIterator = (ContinuingResourcePrecedesInNarrativeIterator)findAncestorWithClass(this, ContinuingResourcePrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theContinuingResourcePrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

