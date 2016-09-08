package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexPrecedesInNarrativeIterator theIndexPrecedesInNarrativeIterator = (IndexPrecedesInNarrativeIterator)findAncestorWithClass(this, IndexPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theIndexPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

