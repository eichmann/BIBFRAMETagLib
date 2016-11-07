package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexPrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexPrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexPrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexPrecedesInNarrativeInverseIterator theIndexPrecedesInNarrativeInverseIterator = (IndexPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, IndexPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theIndexPrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}
