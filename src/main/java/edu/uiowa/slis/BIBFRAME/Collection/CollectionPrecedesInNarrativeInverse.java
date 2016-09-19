package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionPrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionPrecedesInNarrativeInverseIterator theCollectionPrecedesInNarrativeInverseIterator = (CollectionPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, CollectionPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theCollectionPrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

