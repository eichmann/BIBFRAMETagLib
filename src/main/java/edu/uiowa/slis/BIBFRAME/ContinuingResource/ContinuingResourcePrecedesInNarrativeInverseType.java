package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourcePrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourcePrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourcePrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourcePrecedesInNarrativeInverseIterator theContinuingResourcePrecedesInNarrativeInverseIterator = (ContinuingResourcePrecedesInNarrativeInverseIterator)findAncestorWithClass(this, ContinuingResourcePrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theContinuingResourcePrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

